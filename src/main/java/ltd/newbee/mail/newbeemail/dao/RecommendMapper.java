package ltd.newbee.mail.newbeemail.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mail.newbeemail.entity.IndexConfig;

public interface RecommendMapper {

	
	List<IndexConfig> findRecommendShopList(@Param("userid") long userid,@Param("list") int list);
	
	
}
