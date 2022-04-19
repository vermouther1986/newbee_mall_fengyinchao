package ltd.newbee.mail.newbeemail.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mail.newbeemail.service.NewBeeMallIndexConfigService;
import ltd.newbee.mail.newbeemail.util.Result;
import ltd.newbee.mail.newbeemail.util.ResultGenerator;

@Controller

public class IndexController {

	@Resource
	private NewBeeMallIndexConfigService newBeeMallIndexConfigService;

	@GetMapping("/newGoods")
    @ResponseBody
    public Result hello() {
		
        return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(3, 5));
	
	
	
	
}
}
