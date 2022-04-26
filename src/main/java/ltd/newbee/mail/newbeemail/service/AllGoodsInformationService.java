package ltd.newbee.mail.newbeemail.service;

import java.util.List;

import ltd.newbee.mail.newbeemail.vo.TbNewbeeMallGoodsInfoVO;

public interface AllGoodsInformationService {

	List<TbNewbeeMallGoodsInfoVO> getAllGoodsInformationForIndex(long goodsId);
}
