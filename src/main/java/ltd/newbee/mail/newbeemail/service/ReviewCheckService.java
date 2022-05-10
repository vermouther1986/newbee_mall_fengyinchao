package ltd.newbee.mail.newbeemail.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mail.newbeemail.entity.Review;
import ltd.newbee.mail.newbeemail.vo.ReviewAvgAndCountVO;





public interface ReviewCheckService {
	//插入表
	int insertReview(Map<String,Object>review);
	
	List<Review> getReviewCheck(long goodsId,long userId);
	
	
	List<ReviewAvgAndCountVO> getReviewCounterForIndex(long goodsId);
}

