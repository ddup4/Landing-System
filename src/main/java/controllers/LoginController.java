package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Users;
import mapper.usersMapper;

@Controller
public class LoginController {
	@Autowired
	usersMapper usermapper;

	@RequestMapping("/login")
	public String hello(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		Users u = new Users(name, password);

		Users uu = this.usermapper.selectOne(u);
		if (uu != null) {
			return "hello";
		} else {
			return "index1";
		}

	}

	@RequestMapping("/add")
	public String add(HttpServletRequest request, HttpServletResponse response, Users u) {

		int r = this.usermapper.add(u);
		if (r > 0) {
			return "index";
		} else {
			return "reg";
		}

	}
}
