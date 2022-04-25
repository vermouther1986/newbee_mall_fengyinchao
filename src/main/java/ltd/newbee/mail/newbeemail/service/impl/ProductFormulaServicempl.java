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
			vo.setSize(list.getSize1Name() + list.getSize1() + list.getSize2Name() + list.getSize2()
					+ list.getSize3Name() + list.getSize3() + list.getSizeUnit());
			vo.setWaapSize(list.getWrapSize1Name() + list.getWarpSize1() + list.getWrapSize2Name() + list.getWarpSize3()
					+ list.getWrapSize3Name() + list.getWarpSize3() + list.getWarpSize3());
			vo.setWarrantyYears(list.getWarrantyYears());
			vo.setWaapSize(list.getWrapSize1Name() + list.getWarpSize1() + list.getWrapSize2Name() + list.getWarpSize2()
					+ list.getWrapSize3Name() + list.getWarpSize3() + list.getWrapSizeUnit());
			volist.add(vo);
		}

		return volist;
	}

}
