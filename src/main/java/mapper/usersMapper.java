package mapper;

import beans.Users;

public interface usersMapper {
	Users selectOne(Users u);
	int add(Users u);
}
