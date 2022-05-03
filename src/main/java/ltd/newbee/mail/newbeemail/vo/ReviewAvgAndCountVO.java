package ltd.newbee.mail.newbeemail.vo;

import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

public class ReviewAvgAndCountVO {
	private Double avgRating;
	private Integer allRating;
	private Integer allReview;
	private List<RatingCountVO> RatingCount;
	public List<RatingCountVO> getRatingCount() {
		return RatingCount;
	}
	public void setRatingCount(List<RatingCountVO> ratingCount) {
		RatingCount = ratingCount;
	}
	public Double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(Double avgRating) {
		this.avgRating = avgRating;
	}
	public Integer getAllRating() {
		return allRating;
	}
	public void setAllRating(Integer allRating) {
		this.allRating = allRating;
	}
	
	public Integer getAllReview() {
		return allReview;
	}
	public void setAllReview(Integer allReview) {
		this.allReview = allReview;
	}

	
}