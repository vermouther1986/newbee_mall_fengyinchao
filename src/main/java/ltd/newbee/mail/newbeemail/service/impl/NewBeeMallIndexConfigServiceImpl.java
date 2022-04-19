package ltd.newbee.mail.newbeemail.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.IndexConfigMapper;
import ltd.newbee.mail.newbeemail.entity.IndexConfig;
import ltd.newbee.mail.newbeemail.service.NewBeeMallIndexConfigService;

@Service
public class NewBeeMallIndexConfigServiceImpl implements NewBeeMallIndexConfigService {
	
	@Resource
    private IndexConfigMapper indexConfigMapper;
	
	@Override
	public List<IndexConfig> getConfigGoodsesForIndex(int configType,int number) {
		
		return indexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);
	}

}