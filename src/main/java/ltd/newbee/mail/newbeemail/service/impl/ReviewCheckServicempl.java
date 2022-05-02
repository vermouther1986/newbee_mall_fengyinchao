package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.ReviewCheckMapper;
import ltd.newbee.mail.newbeemail.entity.Review;
import ltd.newbee.mail.newbeemail.entity.ReviewApiCheck;
import ltd.newbee.mail.newbeemail.service.ReviewCheckService;

@Service
public class ReviewCheckServicempl implements ReviewCheckService {

	@Resource
	ReviewCheckMapper reviewCheckMapper;

	@Override
	public int insertReviewApiCheck(Map<String, Object> review) {
		// TODO Auto-generated method stub
		long newReviewId = reviewCheckMapper.insertNewReviewId() + 1;
		review.replace("reviewId", newReviewId);
		review.replace("reviewDate", new Date());

		return reviewCheckMapper.insertReviewApiCheck(review);
	}

	@Override
	public List<Review> getReviewCheck(long goodsId, long userId) {

		return reviewCheckMapper.getReviewCheck(goodsId, userId);
	}

	@Override
	public int insertReviewApiCheck(List<Review> list) {
		// TODO Auto-generated method stub
		return reviewCheckMapper.insertReviewApiCheck(list);
	}

}
