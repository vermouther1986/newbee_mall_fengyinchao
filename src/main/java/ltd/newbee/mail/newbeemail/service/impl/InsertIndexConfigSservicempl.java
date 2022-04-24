package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.InsertIndexConfigMapper;

import ltd.newbee.mail.newbeemail.entity.IndexConfig;

import ltd.newbee.mail.newbeemail.service.InsertIndexConfigSservice;

@Service
public class InsertIndexConfigSservicempl implements InsertIndexConfigSservice {

	
	@Resource
	InsertIndexConfigMapper insertIndexConfigMapper;
	
	@Override
	public int insertIndexConfigByGoodsId() {
	
		List<IndexConfig> list = new ArrayList<IndexConfig>();
		IndexConfig h1 = new IndexConfig();
		h1.setGoodsId(10003l);
		list.add(h1);
		return insertIndexConfigMapper.insertIndexConfigByGoodsId(list);

		

}
}
