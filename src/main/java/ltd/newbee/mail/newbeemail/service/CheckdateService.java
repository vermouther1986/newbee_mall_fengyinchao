package ltd.newbee.mail.newbeemail.service;

import java.util.List;

import ltd.newbee.mail.newbeemail.vo.NewBeeMallGoodsDetailVO;

public interface CheckdateService {
	List<NewBeeMallGoodsDetailVO> getCheckDateForIndex(long userid, int list);
}
