package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.CheckdateMapper;
import ltd.newbee.mail.newbeemail.entity.NewBeeMallGoods;
import ltd.newbee.mail.newbeemail.service.CheckdateService;
import ltd.newbee.mail.newbeemail.vo.NewBeeMallGoodsDetailVO;

@Service
public class CheckdateServicempl implements CheckdateService {
	@Resource
	private CheckdateMapper checkdateMapper;

	@Override
	public List<NewBeeMallGoodsDetailVO> getCheckDateForIndex(long userid, int list) {

		List<NewBeeMallGoodsDetailVO> volist = new ArrayList<NewBeeMallGoodsDetailVO>();
		List<NewBeeMallGoods> entitylist = checkdateMapper.findIndexCheckDateByUserId(userid, list);

		for (NewBeeMallGoods entity : entitylist) {

			NewBeeMallGoodsDetailVO vo = new NewBeeMallGoodsDetailVO();
			vo.setGoodsId(entity.getGoodsId());
			vo.setGoodsName(entity.getGoodsName());
			volist.add(vo);

		}

		return volist;
	}

}
