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

	public int insertReview(Map<String, Object> review) {
		// 采番
		long newReviewId = reviewCheckMapper.insertNewReviewId() + 1;
		review.replace("reviewId", newReviewId);
		review.replace("reviewDate", new Date());
		// 插入表格
		return reviewCheckMapper.insertReview(review);
	}

//统计评价
	@Override
	public List<ReviewAvgAndCountVO> getReviewCounterForIndex(long goodsId) {
		List<Review> entitylist = reviewCheckMapper.getAllRatingAndAllReviewAndAvgRating(goodsId);
		List<Review> ratinglist = reviewCheckMapper.getRatingCount(goodsId);
		ReviewAvgAndCountVO vo = new ReviewAvgAndCountVO();
		List<ReviewAvgAndCountVO> volist = BeanUtil.copyToList(entitylist, ReviewAvgAndCountVO.class);
		List<RatingCountVO> relist = BeanUtil.copyToList(ratinglist, RatingCountVO.class);
		vo.setRatingCount(relist);
		volist.add(vo);
		return volist;

	}

//检查是否可以评价
	@Override
	public List<Review> getReviewCheck(long goodsId, long userId) {
		// TODO Auto-generated method stub
		return reviewCheckMapper.getReviewCheck(goodsId, userId);
	}
//点赞检查
	@Override
	public int getGoodLikeforCheck(long userId, long reviewId) {
		
		return reviewCheckMapper.getGoodLikeforCheck( userId, reviewId);
	}

	@Override
	public int insertGoodLike(Map<String, Object> goodlike) {
		
		
		goodlike.replace("likeDate", new Date());
		return reviewCheckMapper.insertGoodLike(goodlike);
	}

}
