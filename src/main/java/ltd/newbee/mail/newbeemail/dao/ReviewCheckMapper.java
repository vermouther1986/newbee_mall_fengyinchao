package ltd.newbee.mail.newbeemail.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mail.newbeemail.entity.Review;

public interface ReviewCheckMapper {


	int insertReview(Map<String, Object> review);

	List<Review> getReviewCheck(long goodsId, long userId);
	int getRatingCount(Map<String, Object> review);
	int  getAllRatingAndAllReviewAndAvgRating(Map<String, Object> review);
	long insertNewReviewId();
	List<Review>getRatingCount(long goodsId);
	List<Review> getAllRatingAndAllReviewAndAvgRating(long goodsId);
}
