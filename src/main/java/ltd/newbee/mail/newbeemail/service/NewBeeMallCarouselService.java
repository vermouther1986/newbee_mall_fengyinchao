package ltd.newbee.mail.newbeemail.service;

import java.util.List;

import ltd.newbee.mail.newbeemail.vo.NewBeeMallIndexCarouselVO;



public interface NewBeeMallCarouselService {
	List<NewBeeMallIndexCarouselVO> getCarouselsForIndex(int number);
}
