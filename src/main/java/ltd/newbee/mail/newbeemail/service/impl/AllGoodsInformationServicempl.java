package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mail.newbeemail.dao.AllGoodsInformationMapper;

import ltd.newbee.mail.newbeemail.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mail.newbeemail.service.AllGoodsInformationService;
import ltd.newbee.mail.newbeemail.vo.TbNewbeeMallGoodsInfoVO;

@Service
public class AllGoodsInformationServicempl implements AllGoodsInformationService {
	@Resource
	AllGoodsInformationMapper allGoodsInformationMapper;

	@Override
	public List<TbNewbeeMallGoodsInfoVO> getAllGoodsInformationForIndex(long goodsId) {
		List<TbNewbeeMallGoodsInfo> entitylist = allGoodsInformationMapper.getAllGoodsInfomation(goodsId);
		List<TbNewbeeMallGoodsInfoVO> volist = new ArrayList<TbNewbeeMallGoodsInfoVO>();
		for (TbNewbeeMallGoodsInfo entity : entitylist) {
			TbNewbeeMallGoodsInfoVO vo= new TbNewbeeMallGoodsInfoVO ();
			
			BeanUtil.copyProperties(entity,vo);
			
			volist.add(vo);
		}

		return volist;
	}

}
