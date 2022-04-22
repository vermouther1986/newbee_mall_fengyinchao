package ltd.newbee.mail.newbeemail.service;



import ltd.newbee.mail.newbeemail.entity.MallUser;

public interface CheckUserExistsService {
MallUser findUserById(long userid);
	int findUserByIdCount(long userid);
	
}
