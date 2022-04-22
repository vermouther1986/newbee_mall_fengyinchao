package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.CarouselMapper;
import ltd.newbee.mail.newbeemail.entity.Carousel;

import ltd.newbee.mail.newbeemail.service.NewBeeMallCarouselService;

import ltd.newbee.mail.newbeemail.vo.NewBeeMallIndexCarouselVO;
	@Service
public class NewBeeMallCarouselServicmpl implements NewBeeMallCarouselService {

	@Resource
	private CarouselMapper carouselMapper;

	@Override
	public List<NewBeeMallIndexCarouselVO> getCarouselsForIndex(int number) {
		List<Carousel> entitylist = carouselMapper.findCarouselsByNum(number);
		List<NewBeeMallIndexCarouselVO> volist = new ArrayList<NewBeeMallIndexCarouselVO>();
		for (Carousel entity : entitylist) {
			NewBeeMallIndexCarouselVO vo = new NewBeeMallIndexCarouselVO();
			vo.setCarouselUrl(entity.getCarouselUrl());
			vo.setRedirectUrl(entity.getRedirectUrl());
			volist.add(vo);

		}
		return volist;

	}
}
