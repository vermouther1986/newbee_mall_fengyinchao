package ltd.newbee.mail.newbeemail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mail.newbeemail.service.RunRecommendApiHistoryService;

@SpringBootTest
class NewbeeMailApplicationTests {
	@Resource
	RunRecommendApiHistoryService runRecommendApiHistoryService;
	@Test
	void contextLoads() {
		int cnt = runRecommendApiHistoryService.insertRecommendApiHistory();
		assertEquals(1,cnt);
	}

}
