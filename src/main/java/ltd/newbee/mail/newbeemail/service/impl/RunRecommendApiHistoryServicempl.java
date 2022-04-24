package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.RunRecommendApiHistoryMapper;
import ltd.newbee.mail.newbeemail.entity.RunRecommendApiHistory;
import ltd.newbee.mail.newbeemail.service.RunRecommendApiHistoryService;
@Service
public class RunRecommendApiHistoryServicempl implements RunRecommendApiHistoryService {
	@Resource
	RunRecommendApiHistoryMapper runRecommendApiHistoryMapper;;
	@Override
	public int insertRecommendApiHistory() {
		List<RunRecommendApiHistory> list = new  ArrayList<RunRecommendApiHistory>();
		RunRecommendApiHistory h1 = new RunRecommendApiHistory();
		h1.setGoodsId(10003l);
		h1.setRunDate(new Date());
		list.add(h1);
		return runRecommendApiHistoryMapper.insertRecommendApiHistory(list);
	}

}
