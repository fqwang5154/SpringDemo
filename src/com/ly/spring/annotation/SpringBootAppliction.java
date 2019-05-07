package com.ly.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ly.spring.annotation.service.RoleService;
import com.ly.spring.annotation.service.UserService;

public class SpringBootAppliction {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
//		UserController controller=(UserController)ctx.getBean("userController");
//		controller.add();
//		
//		UserService service=(UserService)ctx.getBean("userService");
//		System.out.println(service);
//		
//		UserRepository repository=(UserRepository)ctx.getBean("userRepository");
//		System.out.println(repository);
//		
//		User user=(User)ctx.getBean("user");
//		System.out.println(user);
		
		UserService service=(UserService)ctx.getBean("userService");
		service.add();
		
		RoleService service2=(RoleService)ctx.getBean("roleService");
		service2.add();
		
	}
}
