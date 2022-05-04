package ltd.newbee.mail.newbeemail.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mail.newbeemail.entity.QuestionsAndAnswer;
import ltd.newbee.mail.newbeemail.vo.QuestionsAndAnswerVO;

public interface QuestionsAndAnswerService {

	
	
	List<QuestionsAndAnswerVO>  getQuestionsAndAnswerForIndex(long goodsId,int page,int number,String orderBy );

	
	int getQuestionsLike(long answerId, long userId);

	int insertQuestionsLike(Map<String, Object> QaLike);
	
	
	
}
