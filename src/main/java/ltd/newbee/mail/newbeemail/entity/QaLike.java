package ltd.newbee.mail.newbeemail.entity;

import java.util.Date;
import javax.annotation.Generated;

public class QaLike {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108013+09:00", comments="Source field: qa_like.answer_id")
    private Long answerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108134+09:00", comments="Source field: qa_like.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108181+09:00", comments="Source field: qa_like.like_date")
    private Date likeDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.10809+09:00", comments="Source field: qa_like.answer_id")
    public Long getAnswerId() {
        return answerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108117+09:00", comments="Source field: qa_like.answer_id")
    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108151+09:00", comments="Source field: qa_like.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108168+09:00", comments="Source field: qa_like.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108198+09:00", comments="Source field: qa_like.like_date")
    public Date getLikeDate() {
        return likeDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108214+09:00", comments="Source field: qa_like.like_date")
    public void setLikeDate(Date likeDate) {
        this.likeDate = likeDate;
    }
}