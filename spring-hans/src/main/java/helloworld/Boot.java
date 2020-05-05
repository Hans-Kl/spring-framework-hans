package helloworld;

import helloworld.dao.UserDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 2020/5/5 19:53
 *
 * @author konglinghan
 * @version 1.0
 */
public class Boot {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(UserDAO.class);
		context.refresh();
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		userDAO.query();
	}
}
