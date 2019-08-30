public class Hello {

	private String id;
	
	public String getId() {
		return id;
	}
	
	public String setId(String id) {
		this.id = id;
	}
	
	public String sayHello() {
		System.out.println("hello, nice to meet you.");
	}

	public static void main(String[] args) {
		System.out.println("hello world");
	}
}