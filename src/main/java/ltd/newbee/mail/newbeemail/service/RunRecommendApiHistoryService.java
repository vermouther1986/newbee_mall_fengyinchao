package ltd.newbee.mail.newbeemail.service;

import java.util.List;


import ltd.newbee.mail.newbeemail.entity.RunRecommendApiHistory;

public interface RunRecommendApiHistoryService {
	int insertRecommendApiHistory(List<RunRecommendApiHistory> list);
	
	List<RunRecommendApiHistory> getCategoryId();
}
