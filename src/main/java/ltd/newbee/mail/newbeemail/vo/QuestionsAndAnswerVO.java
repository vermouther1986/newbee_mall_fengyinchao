package ltd.newbee.mail.newbeemail.vo;

import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

public class QuestionsAndAnswerVO {

private Integer totalCount;
	
	private Integer currentPage;
	
	private Integer totalPage;
	private List<QuestionsAndAnswerVO> QuestionsAndAnswerVOLv;
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List<QuestionsAndAnswerVO> getQuestionsAndAnswerVOLv() {
		return QuestionsAndAnswerVOLv;
	}
	public void setQuestionsAndAnswerVOLv(List<QuestionsAndAnswerVO> questionsAndAnswerVOLv) {
		QuestionsAndAnswerVOLv = questionsAndAnswerVOLv;
	} 


}
