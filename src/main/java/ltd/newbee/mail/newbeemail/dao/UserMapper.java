package ltd.newbee.mail.newbeemail.dao;


import ltd.newbee.mail.newbeemail.entity.MallUser;

public interface UserMapper {
	MallUser findUserById(long userid);
	int findUserByIdCount(long userid);
	
	
	
}
