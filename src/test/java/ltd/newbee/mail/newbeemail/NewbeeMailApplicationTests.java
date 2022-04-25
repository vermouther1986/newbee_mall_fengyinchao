package ltd.newbee.mail.newbeemail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mail.newbeemail.entity.RunRecommendApiHistory;
import ltd.newbee.mail.newbeemail.service.RunRecommendApiHistoryService;

@SpringBootTest
class NewbeeMailApplicationTests {
	@Resource
	RunRecommendApiHistoryService runRecommendApiHistoryService;
	@Test
	void contextLoads() {
		List<RunRecommendApiHistory> list = new ArrayList<RunRecommendApiHistory>();
		RunRecommendApiHistory h1 = new RunRecommendApiHistory();
		h1.getUserId(0);
		h1.setRunDate(new Date());
		list.add(h1);
		int cnt = runRecommendApiHistoryService.insertRecommendApiHistory(list);
		assertEquals(1, cnt);
	}

}
