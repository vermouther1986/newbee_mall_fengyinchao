package ltd.newbee.mail.newbeemail.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mail.newbeemail.entity.Review;
import ltd.newbee.mail.newbeemail.entity.ReviewLike;

public interface ReviewCheckMapper {

    //插入表
	int insertReview(Map<String, Object> review);
	List<Review> getReviewCheck(long goodsId, long userId);
	//采番
	long insertNewReviewId();
	//评价统计
	List<Review> getRatingCount(long goodsId);
	List<Review> getAllRatingAndAllReviewAndAvgRating(long goodsId);
	//点赞检查
	int getGoodLikeforCheck(long userId, long reviewId);

	int insertGoodLike(Map<String, Object> goodlike);
}
