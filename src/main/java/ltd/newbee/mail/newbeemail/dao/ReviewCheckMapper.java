package ltd.newbee.mail.newbeemail.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mail.newbeemail.entity.Review;

public interface ReviewCheckMapper {

    //插入表
	int insertReview(Map<String, Object> review);
	List<Review> getReviewCheck(long goodsId, long userId);
	//采番
	long insertNewReviewId();
	List<Review> getRatingCount(long goodsId);
	List<Review> getAllRatingAndAllReviewAndAvgRating(long goodsId);
}
