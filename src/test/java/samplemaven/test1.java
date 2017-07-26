package samplemaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Users;
import mapper.usersMapper;

public class test1 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		usersMapper um=(usersMapper)ac.getBean("usersMapper");
		Users u1=new Users(1, "admin", "12345", 20, "男");
		Users u=um.selectOne(u1);
		System.out.println(u.getName());
	}
}
