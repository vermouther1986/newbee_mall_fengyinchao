package ltd.newbee.mail.newbeemail.entity;

import java.util.Date;

import javax.annotation.Generated;

public class QuestionsAndAnswer {
	
	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108134+09:00", comments="Source field: qa_like.user_id")
	    private Long userId;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108181+09:00", comments="Source field: qa_like.like_date")
	    private Date likeDate;

	   
	
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
	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:19:08.679037+09:00", comments="Source field: questions.question_id")
	    private Long questionId;

	   

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
	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.942392+09:00", comments="Source field: answers.answer_id")
	    private Long answerId;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.942591+09:00", comments="Source field: answers.employee_id")
	    private Long employeeId;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.942641+09:00", comments="Source field: answers.answer_date")
	    private Date answerDate;

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.943892+09:00", comments="Source field: answers.answer_contents")
	    private String answerContents;

	   
	   
	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.942515+09:00", comments="Source field: answers.answer_id")
	    public Long getAnswerId() {
	        return answerId;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.942568+09:00", comments="Source field: answers.answer_id")
	    public void setAnswerId(Long answerId) {
	        this.answerId = answerId;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.942608+09:00", comments="Source field: answers.employee_id")
	    public Long getEmployeeId() {
	        return employeeId;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.942626+09:00", comments="Source field: answers.employee_id")
	    public void setEmployeeId(Long employeeId) {
	        this.employeeId = employeeId;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.94266+09:00", comments="Source field: answers.answer_date")
	    public Date getAnswerDate() {
	        return answerDate;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.943835+09:00", comments="Source field: answers.answer_date")
	    public void setAnswerDate(Date answerDate) {
	        this.answerDate = answerDate;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.943926+09:00", comments="Source field: answers.answer_contents")
	    public String getAnswerContents() {
	        return answerContents;
	    }

	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:23:59.943961+09:00", comments="Source field: answers.answer_contents")
	    public void setAnswerContents(String answerContents) {
	        this.answerContents = answerContents == null ? null : answerContents.trim();
	    }

	 
	  

	 

}
