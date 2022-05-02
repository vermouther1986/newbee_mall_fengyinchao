package ltd.newbee.mail.newbeemail.service;

import java.util.List;


import ltd.newbee.mail.newbeemail.vo.ReviewVO;

public interface ReviewMapperService {
	List<ReviewVO> getReviewForIndex( int goodsId,int rating,int start,int number);

	
}
