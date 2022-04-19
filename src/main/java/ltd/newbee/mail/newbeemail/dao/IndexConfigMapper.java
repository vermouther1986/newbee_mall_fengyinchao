package ltd.newbee.mail.newbeemail.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mail.newbeemail.entity.IndexConfig;


public  interface IndexConfigMapper {

	List<IndexConfig> findIndexConfigsByTypeAndNum(@Param("configType") int configType, @Param("number") int number);

}
