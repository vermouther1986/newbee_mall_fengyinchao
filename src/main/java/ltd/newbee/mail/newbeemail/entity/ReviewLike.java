package ltd.newbee.mail.newbeemail.entity;

import java.util.Date;
import javax.annotation.Generated;

public class ReviewLike {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T19:45:43.363966+09:00", comments="Source field: review_like.review_id")
    private Long reviewId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T19:45:43.371927+09:00", comments="Source field: review_like.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T19:45:43.372518+09:00", comments="Source field: review_like.like_date")
    private Date likeDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T19:45:43.37106+09:00", comments="Source field: review_like.review_id")
    public Long getReviewId() {
        return reviewId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T19:45:43.37181+09:00", comments="Source field: review_like.review_id")
    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T19:45:43.372004+09:00", comments="Source field: review_like.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T19:45:43.372075+09:00", comments="Source field: review_like.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T19:45:43.372654+09:00", comments="Source field: review_like.like_date")
    public Date getLikeDate() {
        return likeDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T19:45:43.372734+09:00", comments="Source field: review_like.like_date")
    public void setLikeDate(Date likeDate) {
        this.likeDate = likeDate;
    }
}