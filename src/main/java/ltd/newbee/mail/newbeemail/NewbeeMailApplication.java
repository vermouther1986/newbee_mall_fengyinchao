package ltd.newbee.mail.newbeemail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("ltd.newbee.mail.newbeemail.dao")
@SpringBootApplication
public class NewbeeMailApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewbeeMailApplication.class, args);
	}

}
