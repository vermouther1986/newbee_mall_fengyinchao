package ltd.newbee.mail.newbeemail.service;

import java.util.List;


import ltd.newbee.mail.newbeemail.vo.NewBeeMallGoodsDetailVO;


public interface NewBeeMallIndexConfigService {


	List<NewBeeMallGoodsDetailVO> getConfigGoodsesForIndex(int configType ,int number);
	
	
}