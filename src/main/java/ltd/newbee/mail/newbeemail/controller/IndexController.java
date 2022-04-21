package ltd.newbee.mail.newbeemail.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ltd.newbee.mail.newbeemail.service.NewBeeMallCarouselService;
import ltd.newbee.mail.newbeemail.service.NewBeeMallCategoryService;
import ltd.newbee.mail.newbeemail.service.NewBeeMallIndexConfigService;
import ltd.newbee.mail.newbeemail.util.Result;
import ltd.newbee.mail.newbeemail.util.ResultGenerator;

@Controller

public class IndexController {

	@Resource
	private NewBeeMallIndexConfigService newBeeMallIndexConfigService;
	
	@Resource
	private NewBeeMallCategoryService newBeeMallCategoryService;

	@Resource
	private  NewBeeMallCarouselService newBeeMallCarouselService;

	@GetMapping("/goodses")
	@ResponseBody
	public Result goodses(int configType) {

		return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(configType, 5));
	}
	
	
	@GetMapping("/categories")
	@ResponseBody
	public Result categories() {

		 return ResultGenerator.genSuccessResult(newBeeMallCategoryService.getCategoriesForIndex());
	}
	
	@GetMapping("/carousel")
	@ResponseBody
	public Result carousel(int number) {

		
		return ResultGenerator.genSuccessResult(newBeeMallCarouselService.getCarouselsForIndex(number));
	}

}
