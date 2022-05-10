package ltd.newbee.mail.newbeemail.dao;

import java.util.List;

import ltd.newbee.mail.newbeemail.entity.QuestionsAndAnswer;

public interface QuestionsAndAnswerMapper {

	List<QuestionsAndAnswer>  getQuestionsAndAnswer(long goodsId,int page,int number,String orderBy);
	
	int getQuestionsTotol(long goodsId );

	

	
	
	
}
