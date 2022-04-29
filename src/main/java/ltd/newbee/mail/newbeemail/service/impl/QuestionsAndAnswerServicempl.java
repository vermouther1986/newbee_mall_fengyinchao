package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mail.newbeemail.dao.QuestionsAndAnswerMapper;
import ltd.newbee.mail.newbeemail.entity.QuestionsAndAnswer;

import ltd.newbee.mail.newbeemail.service.QuestionsAndAnswerService;
import ltd.newbee.mail.newbeemail.vo.CurrentPageVO;
import ltd.newbee.mail.newbeemail.vo.QuestionsAndAnswerVO;

@Service
public class QuestionsAndAnswerServicempl implements QuestionsAndAnswerService {
	@Resource
	QuestionsAndAnswerMapper questionsAndAnswerMapper;

	@Override
	public List<QuestionsAndAnswerVO> getQuestionsAndAnswerForIndex(long goodsId, int page, int number,String orderBy ) {
		int stary=0;
		stary=(page-1)*number;
		List<QuestionsAndAnswer> entitylist = questionsAndAnswerMapper.getQuestionsAndAnswer(goodsId, stary, number,orderBy );
		List<QuestionsAndAnswerVO> volist = new ArrayList<QuestionsAndAnswerVO>();
		QuestionsAndAnswerVO vo = new QuestionsAndAnswerVO();
		for (QuestionsAndAnswer entity : entitylist) {
			
			BeanUtil.copyProperties(entity, vo);
			
			volist.add(vo);
		}
		CurrentPageVO  vo1=new CurrentPageVO ();
	    int currentpage=page;
		int totalpage=0;
		int count= questionsAndAnswerMapper.getQuestionsTotol(goodsId);
		if(count%number!=0) {
			
			totalpage=count/number+1;
		}else {
			
			totalpage=count/number;
			
		}
		vo.setCurrentpage(currentpage);
		vo.setTotalCount(count);
		vo.setTotalpage(totalpage);
	
		
		
		return volist;
	}




	
}
