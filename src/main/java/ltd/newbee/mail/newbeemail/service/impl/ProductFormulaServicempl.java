package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.ProductFormulaMapper;

import ltd.newbee.mail.newbeemail.entity.ProductFormula;
import ltd.newbee.mail.newbeemail.service.ProductFormulaService;
import ltd.newbee.mail.newbeemail.vo.ProductFormulaVO;

@Service
class ProductFormulaServicempl implements ProductFormulaService {
	@Resource
	private ProductFormulaMapper productFormulaMapper;

	@Override
	public List<ProductFormulaVO> getProductFormulaForIndex(long goodsId) {
		List<ProductFormula> entity = productFormulaMapper.getProductFormula(goodsId);
		List<ProductFormulaVO> volist = new ArrayList<ProductFormulaVO>();
		for (ProductFormula list : entity) {
			ProductFormulaVO vo = new ProductFormulaVO();
			vo.setGoodsId(list.getGoodsId());
			vo.setColor(list.getColor());
			vo.setMaterial(list.getMaterail());
			String s = "";
			String w="";

			if (list.getSize1() != 0) {
				s = s + list.getSize1() + list.getSize1Name();

			}
			if (list.getSize2() != 0) {
				s = s + list.getSize2() + list.getSize2Name();

			}
			if (list.getSize3() != 0) {
				s = s + list.getSize3() + list.getSize3Name();

			}
			if (list.getSizeUnit() != null && list.getSizeUnit().equals("")) {
				s = s + list.getSizeUnit();

			}

			if (list.getWarpSize1() != 0) {
				w = w + list.getWarpSize1() + list.getWrapSize1Name();

			}
			if (list.getWarpSize2() != 0) {
			w= w+ list.getWarpSize2() + list.getWrapSize2Name();

			}
			if (list.getWarpSize3() != 0) {
				w= w+ list.getWarpSize3() + list.getWrapSize3Name();

			}
			if (list.getWrapSizeUnit() != null && list.getWrapSizeUnit().equals("")) {
				w = w + list.getWrapSizeUnit();

			}
			vo.setSize(s);
			vo.setWrapSize(w);
			vo.setWarrantyYears(list.getWarranty() + list.getWarrantyUnit());

			volist.add(vo);
		}

		return volist;
	}

}
