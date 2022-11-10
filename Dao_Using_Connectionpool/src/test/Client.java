package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;

public class Client {

	public static void main(String[] args) throws Exception{
	
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		StudentDao dao=(StudentDao)cap.getBean("dao");
		int i=dao.save(222, "lmn", "lmn@gmail.com", "hyd");
		if(i!=0)
			System.out.println("success");
		else
			System.out.println("failed");
		
		cap.close();
	}
}
