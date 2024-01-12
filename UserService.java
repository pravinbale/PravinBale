package example.spring.core;

public class UserService implements GreetingService {
	private String name;
	private int age;
	private String message;
	
	public UserService() {
		System.out.println("UserService()");
	}
	
	
	public UserService(String name, int age, String message) {
		System.out.println("UserService(String,int,String)");
		this.name = name;
		this.age = age;
		this.message = message;
	}

	public UserService(int age, String name, String message) {
		System.out.println("UserService(int,String,String)");
		this.age = age;
		this.name = name;
		this.message = message;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Name");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Setting Message");
		this.message = message;
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		String greetingMessage=message+" "+name+" "+"Your age is "+age+" years"; 
		return greetingMessage;
	}

}
