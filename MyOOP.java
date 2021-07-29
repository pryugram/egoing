public class MyOOP{
	public static void main(String[] args) {
		delimiter = "----"; // method 안에서 정의된 변수는 그 method 안에서만 사용 가능 : 유효범위
		printA();
		printA();
		printB();
		printB();
		
		delimiter = "****";
		printA();
		printA();
		printB();
		printB();
		
			}
	
	
	public static String delimiter = "";
	public static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
		
	}
	
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");

	}
	
	
	
	
	
	
	
	
	
	
}