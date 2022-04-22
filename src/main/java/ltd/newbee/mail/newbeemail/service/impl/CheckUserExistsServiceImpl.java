package ltd.newbee.mail.newbeemail.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import ltd.newbee.mail.newbeemail.dao.UserMapper;
import ltd.newbee.mail.newbeemail.entity.MallUser;
import ltd.newbee.mail.newbeemail.service.CheckUserExistsService;
@Service
public class CheckUserExistsServiceImpl implements CheckUserExistsService {
	@Resource
	private UserMapper userMapper;
	
	@Override
	public MallUser findUserById(long userid) {
	
		return userMapper.findUserById(userid);
	}

	@Override
	public int findUserByIdCount(long userid) {
		
		return userMapper.findUserByIdCount(userid);

}
}
