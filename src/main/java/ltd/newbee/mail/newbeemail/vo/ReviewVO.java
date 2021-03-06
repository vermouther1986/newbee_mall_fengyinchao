package ltd.newbee.mail.newbeemail.vo;

import java.util.Date;
import javax.annotation.Generated;

public class ReviewVO {
	private Double avgRating;
	private Integer allRating;
	private Integer countRating;
	private Integer allReview;

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

	public Integer getCountRating() {
		return countRating;
	}

	public void setCountRating(Integer countRating) {
		this.countRating = countRating;
	}

	public Integer getAllReview() {
		return allReview;
	}

	public void setAllReview(Integer allReview) {
		this.allReview = allReview;
	}

	private Integer countReview;

	public Integer getCountReview() {
		return countReview;
	}

	public void setCountReview(Integer countReview) {
		this.countReview = countReview;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.270535+09:00", comments = "Source field: review.review_id")
	private Long reviewId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.278343+09:00", comments = "Source field: review.order_id")
	private Long orderId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.278524+09:00", comments = "Source field: review.nick_name")
	private String nickName;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.278788+09:00", comments = "Source field: review.rating")
	private Integer rating;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.279078+09:00", comments = "Source field: review.title")
	private String title;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.279275+09:00", comments = "Source field: review.content")
	private String content;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.279469+09:00", comments = "Source field: review.photo1")
	private String photo1;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280166+09:00", comments = "Source field: review.photo2")
	private String photo2;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280361+09:00", comments = "Source field: review.photo3")
	private String photo3;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280555+09:00", comments = "Source field: review.photo4")
	private String photo4;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280742+09:00", comments = "Source field: review.photo5")
	private String photo5;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280966+09:00", comments = "Source field: review.review_date")
	private Date reviewDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.281192+09:00", comments = "Source field: review.proved")
	private Integer proved;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.277738+09:00", comments = "Source field: review.review_id")
	public Long getReviewId() {
		return reviewId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.278254+09:00", comments = "Source field: review.review_id")
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.278407+09:00", comments = "Source field: review.order_id")
	public Long getOrderId() {
		return orderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.278469+09:00", comments = "Source field: review.order_id")
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.278594+09:00", comments = "Source field: review.nick_name")
	public String getNickName() {
		return nickName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.278724+09:00", comments = "Source field: review.nick_name")
	public void setNickName(String nickName) {
		this.nickName = nickName == null ? null : nickName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.27885+09:00", comments = "Source field: review.rating")
	public Integer getRating() {
		return rating;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.278915+09:00", comments = "Source field: review.rating")
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.279149+09:00", comments = "Source field: review.title")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.279217+09:00", comments = "Source field: review.title")
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.279341+09:00", comments = "Source field: review.content")
	public String getContent() {
		return content;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.279408+09:00", comments = "Source field: review.content")
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280013+09:00", comments = "Source field: review.photo1")
	public String getPhoto1() {
		return photo1;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280101+09:00", comments = "Source field: review.photo1")
	public void setPhoto1(String photo1) {
		this.photo1 = photo1 == null ? null : photo1.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280234+09:00", comments = "Source field: review.photo2")
	public String getPhoto2() {
		return photo2;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.2803+09:00", comments = "Source field: review.photo2")
	public void setPhoto2(String photo2) {
		this.photo2 = photo2 == null ? null : photo2.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280424+09:00", comments = "Source field: review.photo3")
	public String getPhoto3() {
		return photo3;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280495+09:00", comments = "Source field: review.photo3")
	public void setPhoto3(String photo3) {
		this.photo3 = photo3 == null ? null : photo3.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280618+09:00", comments = "Source field: review.photo4")
	public String getPhoto4() {
		return photo4;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280683+09:00", comments = "Source field: review.photo4")
	public void setPhoto4(String photo4) {
		this.photo4 = photo4 == null ? null : photo4.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280813+09:00", comments = "Source field: review.photo5")
	public String getPhoto5() {
		return photo5;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.280905+09:00", comments = "Source field: review.photo5")
	public void setPhoto5(String photo5) {
		this.photo5 = photo5 == null ? null : photo5.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.281065+09:00", comments = "Source field: review.review_date")
	public Date getReviewDate() {
		return reviewDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.281138+09:00", comments = "Source field: review.review_date")
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.281254+09:00", comments = "Source field: review.proved")
	public Integer getProved() {
		return proved;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:05:50.281311+09:00", comments = "Source field: review.proved")
	public void setProved(Integer proved) {
		this.proved = proved;
	}

	public class ReviewLike {
		@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:08:40.169821+09:00", comments = "Source field: review_like.review_id")
		private Long reviewId;

		@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:08:40.170275+09:00", comments = "Source field: review_like.user_id")
		private Long userId;

		@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:08:40.170416+09:00", comments = "Source field: review_like.like_date")
		private Date likeDate;

		@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:08:40.170162+09:00", comments = "Source field: review_like.review_id")
		public Long getReviewId() {
			return reviewId;
		}

		@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:08:40.170229+09:00", comments = "Source field: review_like.review_id")
		public void setReviewId(Long reviewId) {
			this.reviewId = reviewId;
		}

		@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:08:40.170329+09:00", comments = "Source field: review_like.user_id")
		public Long getUserId() {
			return userId;
		}

		@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:08:40.170375+09:00", comments = "Source field: review_like.user_id")
		public void setUserId(Long userId) {
			this.userId = userId;
		}

		@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:08:40.170467+09:00", comments = "Source field: review_like.like_date")
		public Date getLikeDate() {
			return likeDate;
		}

		@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-28T19:08:40.170544+09:00", comments = "Source field: review_like.like_date")
		public void setLikeDate(Date likeDate) {
			this.likeDate = likeDate;
		}
	}
}