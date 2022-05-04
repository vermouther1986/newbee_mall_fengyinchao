package ltd.newbee.mail.newbeemail.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


import ltd.newbee.mail.newbeemail.entity.MallUser;
import ltd.newbee.mail.newbeemail.entity.Review;
import ltd.newbee.mail.newbeemail.service.CheckUserExistsService;
import ltd.newbee.mail.newbeemail.service.QuestionsAndAnswerService;
import ltd.newbee.mail.newbeemail.service.ReviewCheckService;
import ltd.newbee.mail.newbeemail.util.Result;
import ltd.newbee.mail.newbeemail.util.ResultGenerator;

@Controller
public class GoodsController {
	// 判断可否写评价
	@Resource
	private ReviewCheckService reviewCheckService;
	private CheckUserExistsService checkUserExistsService;
	private QuestionsAndAnswerService questionsAndAnswerService;

	@PostMapping("/goods/review")
	@ResponseBody
	public Result review(@RequestBody HashMap<String, Object> reviewMap) {

		String userid = reviewMap.get("userId").toString();
		String goodsid = reviewMap.get("goodsId").toString();
		long userId = Long.parseLong(userid);
		long goodsId = Long.parseLong(goodsid);
		List<Review> entityList = new ArrayList<Review>();
		entityList = reviewCheckService.getReviewCheck(goodsId, userId);
		if (entityList.size() == 0 && entityList != null) {
			return ResultGenerator.genFailResult("can't review");

		} else {

			System.out.println(reviewMap);
			return ResultGenerator.genSuccessResult(reviewCheckService.insertReview(reviewMap));
		}

	}
	// 评价星数

	@GetMapping("/ratingavgandcount")
	@ResponseBody
	public Result ratingavg(long goodsId) {

		return ResultGenerator.genSuccessResult(reviewCheckService.getReviewCounterForIndex(goodsId));
	}

	@PostMapping("/goodlike/check/like")
	@ResponseBody
	public Result goodlike(@RequestBody HashMap<String, Object> goodlikeMap) {

		String reviewId1 = goodlikeMap.get("reviewId").toString();
		String userId1 = goodlikeMap.get("userId").toString();
		long reviewId = Long.parseLong(reviewId1);
		long userId = Long.parseLong(userId1);

		int goodCount = reviewCheckService.getGoodLikeforCheck(userId, reviewId);
		if (goodCount > 0) {
			return ResultGenerator.genFailResult("已点赞");

		} else {
			
			return ResultGenerator.genSuccessResult(reviewCheckService.insertGoodLike(goodlikeMap));
		}

	}

	@PostMapping("/question/good/like")
	@ResponseBody
	public Result qagoodlike(@RequestBody HashMap<String, Object> qaGoodlikeMap) {

		String answerId1 = qaGoodlikeMap.get("answerId").toString();
		String userId1 = qaGoodlikeMap.get("userId").toString();
		long answerId = Long.parseLong(answerId1);
		long userId = Long.parseLong(userId1);
		
	
			int qalikeCount = questionsAndAnswerService.getQuestionsLike(answerId, userId);
			if (qalikeCount > 0) {
				return ResultGenerator.genFailResult("已点赞");

			} else {
			
				return ResultGenerator.genSuccessResult(questionsAndAnswerService.insertQuestionsLike(qaGoodlikeMap));
			}

	
		
	}

}
