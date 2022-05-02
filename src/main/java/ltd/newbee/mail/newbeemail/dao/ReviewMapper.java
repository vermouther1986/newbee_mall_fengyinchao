package ltd.newbee.mail.newbeemail.dao;

import java.util.List;


import ltd.newbee.mail.newbeemail.entity.Review;

public interface ReviewMapper {
	List<Review> getReview(int goodsId,int rating,int start,int number);
}
