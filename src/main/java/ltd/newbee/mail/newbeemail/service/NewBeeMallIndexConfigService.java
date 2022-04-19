package ltd.newbee.mail.newbeemail.service;

import java.util.List;

import ltd.newbee.mail.newbeemail.entity.IndexConfig;

public interface NewBeeMallIndexConfigService {
	List<IndexConfig> getConfigGoodsesForIndex(int configType ,int number);
}