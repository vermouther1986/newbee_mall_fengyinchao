package ltd.newbee.mail.newbeemail.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mail.newbeemail.entity.Review;
import ltd.newbee.mail.newbeemail.vo.ReviewAvgAndCountVO;

public interface ReviewCheckService {
	// 插入表
	int insertReview(Map<String, Object> review);

	// 检查是否插入表
	List<Review> getReviewCheck(long goodsId, long userId);

	// 统计评价
	List<ReviewAvgAndCountVO> getReviewCounterForIndex(long goodsId);

	// 检查点赞
	int getGoodLikeforCheck(long userId, long reviewId);
	
	int insertGoodLike(Map<String, Object> goodlike);
}
