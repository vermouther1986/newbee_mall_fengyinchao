package ltd.newbee.mail.newbeemail.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.ReviewCheckMapper;

import ltd.newbee.mail.newbeemail.entity.ReviewApiCheck;
import ltd.newbee.mail.newbeemail.service.ReviewCheckService;
@Service
public class ReviewCheckServicempl implements ReviewCheckService {

	
	@Resource
	ReviewCheckMapper reviewCheckMapper;
	@Override
	public int insertReviewApiCheck(List<ReviewApiCheck> list) {
		// TODO Auto-generated method stub
		return reviewCheckMapper.insertReviewApiCheck(list);
	}

	@Override
	public List<ReviewApiCheck> getReviewCheck(long goodsId,long userId) {
		// TODO Auto-generated method stub
		return reviewCheckMapper.getReviewCheck(goodsId,userId);
	}

}
