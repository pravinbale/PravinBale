package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExample {

	public static void main(String[] args) {
		String configPath="./src/main/resources/spring-config.xml";
		ApplicationContext context=new FileSystemXmlApplicationContext(configPath);
		
		Object obj1=context.getBean("myBean");
		GreetingService gs1=(GreetingService)obj1;
		String reply1=gs1.sayGreeting();
		System.out.println(reply1); 
		
		System.out.println("-------------------");
		
		Object obj=context.getBean("myBean1");
		GreetingService gs=(GreetingService)obj;
		String reply=gs.sayGreeting();
		System.out.println(reply);
		
		System.out.println("-------------------");
		
		Object obj2=context.getBean("myBean2");
		GreetingService gs2=(GreetingService)obj2;
		String reply2=gs2.sayGreeting();
		System.out.println(reply2);
		
		System.out.println("-------------------");
		
		Object obj3=context.getBean("myBean3");
		GreetingService gs3=(GreetingService)obj3;
		String reply3=gs3.sayGreeting();
		System.out.println(reply3);
		
		System.out.println("-------------------");
		
		Object obj4=context.getBean("myBean4");
		GreetingService gs4=(GreetingService)obj4;
		String reply4=gs4.sayGreeting();
		System.out.println(reply4);
	}

}
