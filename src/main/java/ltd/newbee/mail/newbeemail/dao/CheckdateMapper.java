package ltd.newbee.mail.newbeemail.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mail.newbeemail.entity.NewBeeMallGoods;

public interface CheckdateMapper {

	List<NewBeeMallGoods> findIndexCheckDateByUserId(@Param("userid") long userid, @Param("list") int list);

}
