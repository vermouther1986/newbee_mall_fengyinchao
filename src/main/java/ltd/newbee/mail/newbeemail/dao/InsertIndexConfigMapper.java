package ltd.newbee.mail.newbeemail.dao;

import java.util.List;

import ltd.newbee.mail.newbeemail.entity.IndexConfig;


public interface InsertIndexConfigMapper {
	int insertIndexConfigByGoodsId(List<IndexConfig> list);
}
