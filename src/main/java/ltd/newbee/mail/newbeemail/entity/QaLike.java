package ltd.newbee.mail.newbeemail.entity;

import java.util.Date;
import javax.annotation.Generated;

public class QaLike {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T22:21:53.722693+09:00", comments="Source field: qa_like.answer_id")
    private Long answerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T22:21:53.723203+09:00", comments="Source field: qa_like.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T22:21:53.72339+09:00", comments="Source field: qa_like.like_date")
    private Date likeDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T22:21:53.723023+09:00", comments="Source field: qa_like.answer_id")
    public Long getAnswerId() {
        return answerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T22:21:53.723127+09:00", comments="Source field: qa_like.answer_id")
    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T22:21:53.723276+09:00", comments="Source field: qa_like.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T22:21:53.723336+09:00", comments="Source field: qa_like.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T22:21:53.723453+09:00", comments="Source field: qa_like.like_date")
    public Date getLikeDate() {
        return likeDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-05-04T22:21:53.723509+09:00", comments="Source field: qa_like.like_date")
    public void setLikeDate(Date likeDate) {
        this.likeDate = likeDate;
    }
}