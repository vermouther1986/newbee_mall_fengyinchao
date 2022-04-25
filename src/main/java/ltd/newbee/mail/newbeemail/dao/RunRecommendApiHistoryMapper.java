package ltd.newbee.mail.newbeemail.dao;

import java.util.List;

import ltd.newbee.mail.newbeemail.entity.RunRecommendApiHistory;

public interface RunRecommendApiHistoryMapper {
	int insertRunRecommendApiHistory(List<RunRecommendApiHistory> list);
	List<RunRecommendApiHistory> getCategoryId();
}
