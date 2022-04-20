package ltd.newbee.mail.newbeemail.service.impl;

import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.IndexConfigMapper;
import ltd.newbee.mail.newbeemail.entity.IndexConfig;
import ltd.newbee.mail.newbeemail.entity.NewBeeMallGoods;
import ltd.newbee.mail.newbeemail.service.NewBeeMallIndexConfigService;
import ltd.newbee.mail.newbeemail.vo.NewBeeMallGoodsDetailVO;
@Service
public class NewBeeMallIndexConfigServiceImpl implements NewBeeMallIndexConfigService {

	@Resource
	private IndexConfigMapper indexConfigMapper;

	@Override

	public List<NewBeeMallGoodsDetailVO> getConfigGoodsesForIndex(int configType,int number) {

		List<IndexConfig> idxConfList = indexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);


		
	List<Long> ids = new ArrayList<Long>();
	for(IndexConfig iConf : idxConfList) {
		ids.add(iConf.getGoodsId());
	}
	List<NewBeeMallGoods> entityList = indexConfigMapper.findIndexConfigsByGoodId(ids);

	List<NewBeeMallGoodsDetailVO> voList = new ArrayList<NewBeeMallGoodsDetailVO>();
	
	for(NewBeeMallGoods entity : entityList) {
		NewBeeMallGoodsDetailVO vo = new NewBeeMallGoodsDetailVO();

		vo.setGoodsId(entity.getGoodsId());

		vo.setGoodsName(entity.getGoodsName());

		vo.setGoodsIntro(entity.getGoodsIntro());

		vo.setGoodsCoverImg(entity.getGoodsCoverImg());

		vo.setSellingPrice(entity.getSellingPrice());

		String name = vo.getGoodsName();
	
		if (name.length() > 30) {
			vo.setGoodsName(name.substring(0,30) + "...");
		}

		voList.add(vo);
	}
	return voList;
	}
}

