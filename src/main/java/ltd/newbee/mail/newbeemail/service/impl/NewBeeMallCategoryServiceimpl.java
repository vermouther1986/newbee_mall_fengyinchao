	package ltd.newbee.mail.newbeemail.service.impl;

	import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.GoodsCategoryMapper;
import ltd.newbee.mail.newbeemail.dao.IndexConfigMapper;
import ltd.newbee.mail.newbeemail.entity.GoodsCategory;
import ltd.newbee.mail.newbeemail.entity.IndexConfig;
import ltd.newbee.mail.newbeemail.entity.NewBeeMallGoods;
import ltd.newbee.mail.newbeemail.service.NewBeeMallCategoryService;
import ltd.newbee.mail.newbeemail.service.NewBeeMallIndexConfigService;
import ltd.newbee.mail.newbeemail.vo.NewBeeMallGoodsDetailVO;
import ltd.newbee.mail.newbeemail.vo.NewBeeMallIndexCategoryVO;
import ltd.newbee.mail.newbeemail.vo.SecondLevelCategoryVO;
import ltd.newbee.mail.newbeemail.vo.ThirdLevelCategoryVO;

	@Service
	public class NewBeeMallCategoryServiceimpl implements NewBeeMallCategoryService {

	@Resource
	private GoodsCategoryMapper goodsCategoryMapper;

	@Override

	public List<NewBeeMallIndexCategoryVO> getCategoriesForIndex() {
		List<Long> lev1ParentsList = new ArrayList<Long>();
		lev1ParentsList.add(0l);
		List<GoodsCategory> lev1CateList = new ArrayList<GoodsCategory>();
		lev1CateList = goodsCategoryMapper.selectByLevelAndParentIdsAndNumber(lev1ParentsList, 1, 100);

		List<Long> cateList1 = new ArrayList<Long>();

		for (GoodsCategory gc : lev1CateList) {

			cateList1.add(gc.getCategoryId());

		}
		// level2
		List<GoodsCategory> lev2CateList = new ArrayList<GoodsCategory>();
		lev2CateList = goodsCategoryMapper.selectByLevelAndParentIdsAndNumber(cateList1, 2, 100);
		List<Long> cateList2 = new ArrayList<Long>();
		for (GoodsCategory gc : lev2CateList) {
			cateList2.add(gc.getCategoryId());

		}
		// level2
		List<GoodsCategory> lev3CateList = new ArrayList<GoodsCategory>();

		lev3CateList = goodsCategoryMapper.selectByLevelAndParentIdsAndNumber(cateList2, 3, 100);

		// levl1 entity=>v0
		List<NewBeeMallIndexCategoryVO> rsList = new ArrayList<NewBeeMallIndexCategoryVO>();
		for (GoodsCategory gc : lev1CateList) {
			NewBeeMallIndexCategoryVO vo = new NewBeeMallIndexCategoryVO();
			vo.setCategoryId(gc.getCategoryId());
			vo.setCategoryLevel(gc.getCategoryLevel());
			vo.setCategoryName(gc.getCategoryName());
			List<SecondLevelCategoryVO> Levl2CateVoList = new ArrayList<SecondLevelCategoryVO>();
			for (GoodsCategory gc2 : lev2CateList) {
				SecondLevelCategoryVO levl2CateVo = new SecondLevelCategoryVO();
				if (gc2.getParentId() == gc.getCategoryId()) {
					levl2CateVo.setCategoryId(gc2.getCategoryId());
					levl2CateVo.setCategoryLevel(gc2.getCategoryLevel());
					levl2CateVo.setCategoryName(gc2.getCategoryName());
					levl2CateVo.setParentId(gc2.getParentId());
					List<ThirdLevelCategoryVO> levl3VoList = new ArrayList<ThirdLevelCategoryVO>();
					for (GoodsCategory gc3 : lev3CateList) {
						List<ThirdLevelCategoryVO> levl3cateVo = new ArrayList<ThirdLevelCategoryVO>();
						ThirdLevelCategoryVO levl3CateVo = new ThirdLevelCategoryVO();
						if (gc3.getParentId() == gc2.getCategoryId()) {
							levl3CateVo.setCategoryId(gc3.getCategoryId());
							levl3CateVo.setCategoryLevel(gc3.getCategoryLevel());
							levl3CateVo.setCategoryName(gc3.getCategoryName());
							levl3VoList.add(levl3CateVo);
							levl2CateVo.setThirdLevelCategoryVOS(levl3VoList);

						}
					}
					Levl2CateVoList.add(levl2CateVo);

				}
			}
			vo.setSecondLevelCategoryVOS(Levl2CateVoList);
			rsList.add(vo);
		}
		return rsList;
	}
}
