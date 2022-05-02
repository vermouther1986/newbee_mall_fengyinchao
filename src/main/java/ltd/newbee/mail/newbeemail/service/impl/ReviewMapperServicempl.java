package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mail.newbeemail.dao.ReviewMapper;
import ltd.newbee.mail.newbeemail.entity.Review;
import ltd.newbee.mail.newbeemail.service.ReviewMapperService;
import ltd.newbee.mail.newbeemail.vo.ReviewVO;
@Service
public class ReviewMapperServicempl implements ReviewMapperService {

	@Resource
	private  ReviewMapper   reviewMapper ;

	public List<ReviewVO> getReviewForIndex(int goodsId,int rating ,int start,int number) {
	
		
		List<Review> entityList = reviewMapper.getReview(goodsId,rating,start,number);
		
		
		List<ReviewVO> volist=new ArrayList<ReviewVO>();
		
		for(Review entity:entityList) {
			
			ReviewVO vo=new ReviewVO ();
			BeanUtil.copyProperties(entity, vo);
			volist.add(vo);
			
		}
		return volist;
	}

}
