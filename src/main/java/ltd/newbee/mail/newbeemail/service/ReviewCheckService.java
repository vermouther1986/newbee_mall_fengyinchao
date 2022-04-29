package ltd.newbee.mail.newbeemail.service;

import java.util.List;

import ltd.newbee.mail.newbeemail.entity.ReviewApiCheck;


public interface ReviewCheckService {
	
	int insertReviewApiCheck(List<ReviewApiCheck>list);
	List<ReviewApiCheck> getReviewCheck(long goodsId,long userId);
	
	
	
	
}
