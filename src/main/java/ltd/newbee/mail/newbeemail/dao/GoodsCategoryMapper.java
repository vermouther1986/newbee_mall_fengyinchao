package ltd.newbee.mail.newbeemail.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ltd.newbee.mail.newbeemail.entity.GoodsCategory;

public interface GoodsCategoryMapper {
	List<GoodsCategory> selectByLevelAndParentIdsAndNumber(@Param("parentIds") List<Long> parentIds,
			@Param("categoryLevel") int categoryLevel, @Param("number") int number);
}
