
public class WhyMethod {
	
	
	public static void main(String[] args) {

									//"a" : 인자(함수에 대입한 값), argument
		printTwoTimes("a", "-");
		// 100000000
		printTwoTimes("a", "*");
		// 100000000
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
		
															
	
	
	}
																	//(메소드 밖에서 안으로)매개(하는)변수, parameter
	public static void printTwoTimes(String text, String delimiter) { 				//delimiter: 구분자 
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
 
	
}
