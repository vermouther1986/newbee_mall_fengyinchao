package ltd.newbee.mail.newbeemail.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Questions {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.679037+09:00", comments="Source field: questions.question_id")
    private Long questionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681378+09:00", comments="Source field: questions.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681583+09:00", comments="Source field: questions.question_date")
    private Date questionDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681717+09:00", comments="Source field: questions.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681803+09:00", comments="Source field: questions.proved")
    private Integer proved;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681877+09:00", comments="Source field: questions.question_contents")
    private String questionContents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.67959+09:00", comments="Source field: questions.question_id")
    public Long getQuestionId() {
        return questionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681309+09:00", comments="Source field: questions.question_id")
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.68145+09:00", comments="Source field: questions.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681534+09:00", comments="Source field: questions.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681649+09:00", comments="Source field: questions.question_date")
    public Date getQuestionDate() {
        return questionDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681688+09:00", comments="Source field: questions.question_date")
    public void setQuestionDate(Date questionDate) {
        this.questionDate = questionDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681747+09:00", comments="Source field: questions.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681778+09:00", comments="Source field: questions.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681828+09:00", comments="Source field: questions.proved")
    public Integer getProved() {
        return proved;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681855+09:00", comments="Source field: questions.proved")
    public void setProved(Integer proved) {
        this.proved = proved;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681901+09:00", comments="Source field: questions.question_contents")
    public String getQuestionContents() {
        return questionContents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.681931+09:00", comments="Source field: questions.question_contents")
    public void setQuestionContents(String questionContents) {
        this.questionContents = questionContents == null ? null : questionContents.trim();
    }
}