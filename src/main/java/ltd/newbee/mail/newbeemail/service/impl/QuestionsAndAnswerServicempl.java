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

@Service
public class QuestionsAndAnswerServicempl implements QuestionsAndAnswerService {
	@Resource
	QuestionsAndAnswerMapper questionsAndAnswerMapper;

	@Override
	public List<QuestionsAndAnswerVO> getQuestionsAndAnswerForIndex(long goodsId, int page, int number) {
		List<QuestionsAndAnswer> entitylist = questionsAndAnswerMapper.getQuestionsAndAnswer(goodsId, page, number);
		List<QuestionsAndAnswerVO> volist = new ArrayList<QuestionsAndAnswerVO>();
		for (QuestionsAndAnswer entity : entitylist) {
			QuestionsAndAnswerVO vo = new QuestionsAndAnswerVO();
			BeanUtil.copyProperties(entity, vo);
			volist.add(vo);

		}

		return volist;

	}

	@Override

	public List<QuestionsAndAnswerVO> getQuestionsPageAndTotoForIndex() {
		List<QuestionsAndAnswer> entitylist1 = questionsAndAnswerMapper.getQuestionsPageAndTotol();
		List<QuestionsAndAnswerVO> volist1 = new ArrayList<QuestionsAndAnswerVO>();
		for (QuestionsAndAnswer entity : entitylist1) {
			QuestionsAndAnswerVO vo1 = new QuestionsAndAnswerVO();
			BeanUtil.copyProperties(entity, vo1);
			volist1.add(vo1);

		}
		return volist1;
	}
}
