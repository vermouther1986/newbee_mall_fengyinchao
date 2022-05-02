package ltd.newbee.mail.newbeemail.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mail.newbeemail.entity.Review;


public interface ReviewCheckMapper {
	int insertReviewApiCheck(List<Review> list);
	int insertReviewApiCheck(Map<String,Object>review);
List<Review> getReviewCheck(long goodsId,long userId );
     
	int insertNewReviewId();
}
