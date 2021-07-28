class Print{
	public String delimiter;
	public  void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	
	}
}
	
public class staticMethod {
	
	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");

		//Instance(t1 = Print라는 클래스의 Instance)
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		Print.c("$");
		
//method(a && b)가 instance(t1 && t2)의 소속일 때는 static을 빼야한다;
//method(a && b)가 class(Print)의 소속일 때는 static 포함  		
//		Print.a("*");
//		Print.b("*");

		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
		
	}


}
