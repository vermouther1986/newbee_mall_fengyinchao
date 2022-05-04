package ltd.newbee.mail.newbeemail.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mail.newbeemail.entity.QuestionsAndAnswer;

public interface QuestionsAndAnswerMapper {

	List<QuestionsAndAnswer>  getQuestionsAndAnswer(long goodsId,int page,int number,String orderBy);
	
	int getQuestionsTotol(long goodsId );

	//QA点赞
	int getQuestionsLike(long answerId, long userId);

	int insertQuestionsLike(Map<String, Object> QaLike);
	
	
}
