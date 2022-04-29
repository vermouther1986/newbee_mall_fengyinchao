package ltd.newbee.mail.newbeemail.dao;

import java.util.List;


import ltd.newbee.mail.newbeemail.entity.ReviewApiCheck;

public interface ReviewCheckMapper {
	int insertReviewApiCheck(List<ReviewApiCheck>list);
List<ReviewApiCheck> getReviewCheck(long goodsId,long userId );
}
