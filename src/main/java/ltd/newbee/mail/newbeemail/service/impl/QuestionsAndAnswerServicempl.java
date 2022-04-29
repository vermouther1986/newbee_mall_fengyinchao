package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mail.newbeemail.dao.QuestionsAndAnswerMapper;
import ltd.newbee.mail.newbeemail.entity.QuestionsAndAnswer;

import ltd.newbee.mail.newbeemail.service.QuestionsAndAnswerService;

import ltd.newbee.mail.newbeemail.vo.QuestionsAndAnswerVO;
import ltd.newbee.mail.newbeemail.vo.QuestionsAndAnswerVO2;

@Service
public class QuestionsAndAnswerServicempl implements QuestionsAndAnswerService {
	@Resource
	QuestionsAndAnswerMapper questionsAndAnswerMapper;

	@Override
	public List<QuestionsAndAnswerVO> getQuestionsAndAnswerForIndex(long goodsId, int page, int number,
			String orderBy) {
		int start = 0;
		start = (page - 1) * number;
		List<QuestionsAndAnswer> entitylist = questionsAndAnswerMapper.getQuestionsAndAnswer(goodsId, start, number,
				orderBy);
		List<QuestionsAndAnswerVO> volist= new ArrayList<QuestionsAndAnswerVO>();
		QuestionsAndAnswerVO vo = new QuestionsAndAnswerVO();
		List<QuestionsAndAnswerVO2> volist1= BeanUtil.copyToList(entitylist, QuestionsAndAnswerVO2.class);
		int currentpage = page;
		int totalpage = 0;
		int count = questionsAndAnswerMapper.getQuestionsTotol(goodsId);
		if (count % number != 0) {

			totalpage = count / number + 1;
		} else {

			totalpage = count / number;

		}
		vo.setCurrentPage(currentpage);
		vo.setTotalCount(count);
		vo.setTotalPage(totalpage);
		vo.setQuestionsAndAnswerVOLv(volist);
		volist.add(vo);
	
		
		return volist;
	}

}
