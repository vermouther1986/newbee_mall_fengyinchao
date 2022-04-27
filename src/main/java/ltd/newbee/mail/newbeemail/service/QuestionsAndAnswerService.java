package ltd.newbee.mail.newbeemail.service;

import java.util.List;

import ltd.newbee.mail.newbeemail.entity.QuestionsAndAnswer;
import ltd.newbee.mail.newbeemail.vo.QuestionsAndAnswerVO;

public interface QuestionsAndAnswerService {

	
	
	List<QuestionsAndAnswerVO>  getQuestionsAndAnswerForIndex(long goodsId,int page,int number);

	;
	
	List<QuestionsAndAnswerVO> getQuestionsPageAndTotoForIndex( );
	
}
