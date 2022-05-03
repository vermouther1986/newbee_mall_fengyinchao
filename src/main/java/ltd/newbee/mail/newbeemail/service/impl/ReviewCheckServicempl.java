package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mail.newbeemail.dao.ReviewCheckMapper;
import ltd.newbee.mail.newbeemail.entity.Review;

import ltd.newbee.mail.newbeemail.service.ReviewCheckService;
import ltd.newbee.mail.newbeemail.vo.RatingCountVO;
import ltd.newbee.mail.newbeemail.vo.ReviewAvgAndCountVO;

@Service
public class ReviewCheckServicempl implements ReviewCheckService {

	@Resource
	ReviewCheckMapper reviewCheckMapper;

	@Override
	// 采番
	public int insertReview(Map<String, Object> review) {
		// TODO Auto-generated method stub
		long newReviewId = reviewCheckMapper.insertNewReviewId() + 1;
		review.replace("reviewId", newReviewId);
		review.replace("reviewDate", new Date());

		return reviewCheckMapper.insertReview(review);
	}

	@Override
	public List<Review> getReviewCheck(long goodsId, long userId) {

		return reviewCheckMapper.getReviewCheck(goodsId, userId);
	}

	@Override
	public List<ReviewAvgAndCountVO> getAllRatingAndAllReviewAndAvgRatingForIndex(long goodsId) {
		List<Review> entitylist = reviewCheckMapper.getAllRatingAndAllReviewAndAvgRating(goodsId);
		List<Review> ratinglist = reviewCheckMapper.getRatingCount(goodsId);
		List<ReviewAvgAndCountVO> volist = new ArrayList<ReviewAvgAndCountVO>();
		List<RatingCountVO> ratvolist = new ArrayList<RatingCountVO>();
		ReviewAvgAndCountVO vo = new ReviewAvgAndCountVO();
		for (Review entity : entitylist) {

			BeanUtil.copyProperties(entity, vo);

		}
		volist.add(vo);
		for (Review rating : ratinglist) {
			RatingCountVO rvo = new RatingCountVO();
			BeanUtil.copyProperties(rating, rvo);
			ratvolist.add(rvo);
		}
		vo.setRatingCount(ratvolist);
		return volist;

	}

}
