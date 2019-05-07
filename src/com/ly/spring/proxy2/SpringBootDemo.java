package com.ly.spring.proxy2;

public class SpringBootDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		UserRepostory dao = new UserRepostory();
		// dao.save(new User("judy", 12));

		StaticAgent agent = new StaticAgent(dao);
		agent.doSave(new User("judy", 12));

		// Class<?> cl =
		// User.class.getClassLoader().loadClass(User.class.getInterfaces().getClass());
		//
		// Field[] fields = cl.getDeclaredFields();
		// for (Field field : fields) {
		// System.out.println(field.getName());
		// }

	}
}
