package ltd.newbee.mail.newbeemail.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.RunRecommendApiHistoryMapper;
import ltd.newbee.mail.newbeemail.entity.RunRecommendApiHistory;
import ltd.newbee.mail.newbeemail.service.RunRecommendApiHistoryService;
@Service
public class RunRecommendApiHistoryServicempl implements RunRecommendApiHistoryService {
	@Resource
	RunRecommendApiHistoryMapper runRecommendApiHistoryMapper;
	@Override
	public int insertRecommendApiHistory(List<RunRecommendApiHistory> list) {
	
		return runRecommendApiHistoryMapper.insertRunRecommendApiHistory(list);
	}
	@Override
	public  List<RunRecommendApiHistory> getCategoryId(){
	
		return runRecommendApiHistoryMapper.getCategoryId();
	}

}
