package ltd.newbee.mail.newbeemail.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mail.newbeemail.dao.RunRecommendApiHistoryMapper;
import ltd.newbee.mail.newbeemail.entity.Review;
import ltd.newbee.mail.newbeemail.entity.ReviewApiCheck;
import ltd.newbee.mail.newbeemail.entity.RunRecommendApiHistory;
import ltd.newbee.mail.newbeemail.service.AllGoodsInformationService;
import ltd.newbee.mail.newbeemail.service.CheckUserExistsService;
import ltd.newbee.mail.newbeemail.service.CheckdateService;
import ltd.newbee.mail.newbeemail.service.GoodsImageService;
import ltd.newbee.mail.newbeemail.service.NewBeeMallCarouselService;
import ltd.newbee.mail.newbeemail.service.NewBeeMallCategoryService;
import ltd.newbee.mail.newbeemail.service.NewBeeMallIndexConfigService;
import ltd.newbee.mail.newbeemail.service.ProductFormulaService;
import ltd.newbee.mail.newbeemail.service.QuestionsAndAnswerService;
import ltd.newbee.mail.newbeemail.service.ReviewCheckService;
import ltd.newbee.mail.newbeemail.service.ReviewMapperService;
import ltd.newbee.mail.newbeemail.service.RunRecommendApiHistoryService;
import ltd.newbee.mail.newbeemail.util.Result;
import ltd.newbee.mail.newbeemail.util.ResultGenerator;

@Controller

public class IndexController {

	@Resource
	private NewBeeMallIndexConfigService newBeeMallIndexConfigService;

	@Resource
	private NewBeeMallCategoryService newBeeMallCategoryService;

	@Resource
	private NewBeeMallCarouselService newBeeMallCarouselService;
	@Resource
	private CheckUserExistsService checkUserExistsService;

	@Resource
	private CheckdateService checkdateService;
	@Resource
	private RunRecommendApiHistoryService runRecommendApiHistoryService;
	@Resource
	private ProductFormulaService productFormulaService;
	@Resource
	private GoodsImageService goodsImageService;
	@Resource
	private AllGoodsInformationService allGoodsInformationService;
	@Resource
	private QuestionsAndAnswerService questionsAndAnswerService;
	@Resource
	private ReviewMapperService reviewMapperService;
	@Resource
	private ReviewCheckService reviewCheckService;

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

	@GetMapping("/user")
	@ResponseBody
	public Result user(long userid, int list) {

		int count = checkUserExistsService.findUserByIdCount(userid);
		if (count == 0) {

			return ResultGenerator.genFailResult("failed");
		} else {

			// return ResultGenerator.genSuccessResult("success");
			return ResultGenerator.genSuccessResult(checkdateService.getCheckDateForIndex(userid, 5));
		}

	}

	@GetMapping("/recomend")
	@ResponseBody
	public Result recomend() {
		List<RunRecommendApiHistory> list = runRecommendApiHistoryService.getCategoryId();
		for (RunRecommendApiHistory run : list) {
			run.setRunDate(new Date());

		}
		int count = runRecommendApiHistoryService.insertRecommendApiHistory(list);

		if (count == 0) {

			return ResultGenerator.genFailResult("failed");
		} else {

			// return ResultGenerator.genSuccessResult("success");
			return ResultGenerator.genSuccessResult("success");
		}

	}

	@GetMapping("/formula")
	@ResponseBody
	public Result formulal(long goodsId) {

		return ResultGenerator.genSuccessResult(productFormulaService.getProductFormulaForIndex(goodsId));
	}

	@GetMapping("/goodsimage")
	@ResponseBody
	public Result goodsimage(long goodsId) {

		return ResultGenerator.genSuccessResult(goodsImageService.getGoodsImage(goodsId));
	}

	@GetMapping("/allgoods")
	@ResponseBody
	public Result allgoods(long goodsId) {

		return ResultGenerator.genSuccessResult(allGoodsInformationService.getAllGoodsInformationForIndex(goodsId));
	}

	@GetMapping("/question")
	@ResponseBody
	public Result question(long goodsId, int page, int number, String orderBy) {

		return ResultGenerator
				.genSuccessResult(questionsAndAnswerService.getQuestionsAndAnswerForIndex(goodsId, page, 3, orderBy));
	}

	@GetMapping("/review")
	@ResponseBody
	public Result review(int goodsId, int rating, int start, int number) {

		return ResultGenerator.genSuccessResult(reviewMapperService.getReviewForIndex(goodsId, rating, start, number));
	}

	@ResponseBody
	public Result reviewcheck(int goodsId, int userId) {
		List<Review> entityList = new ArrayList<Review>();
		entityList = reviewCheckService.getReviewCheck(goodsId, userId);
		List<Review> insertlist = new ArrayList<Review>();
		
		Review relist = new Review();
//修改文件
		if (entityList.size() == 0) {
			return ResultGenerator.genFailResult("can't review");

		} else {
			for (Review entity : entityList) {
				BeanUtil.copyProperties(entity, relist);
			
			}
			insertlist.add(relist);
			
			return ResultGenerator
					.genSuccessResult(reviewCheckService.insertReviewApiCheck(insertlist));
		}

	}

	@PostMapping("/goods/detail/review")
	@ResponseBody
	public Result review(@RequestBody HashMap<String, Object> reviewMap) {
		System.out.println(reviewMap);
		return ResultGenerator.genSuccessResult(reviewCheckService.insertReviewApiCheck(reviewMap));
	}

}
