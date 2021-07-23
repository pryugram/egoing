import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	
	
	public static void main(String[] args) throws IOException {

									//"a" : 인자(함수에 대입한 값), argument
				System.out.println(twoTimes("a", "-"));
				writeFileTwoTimes("a", "*");
				FileWriter fw = new FileWriter("out.txt");
				fw.write(twoTimes("a", "*"));						//?
				fw.close();

		//		Email.send("egoing@a.com", "two times a", twoTimes("a", "&"));
															
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
	
	public static void printTwoTimes(String text, String delimiter) { 						//(메소드 밖에서 안으로)매개(하는)변수, parameter 				
		System.out.println(delimiter);																	//delimiter: 구분자
		System.out.println(text);
		System.out.println(text);
	}
	
	
	public static void writeFileTwoTimes(String text, String delimiter) { 				 
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
 
	
}



// method: 입력값과 출력값 return
// return의 데이터 타입을 정해야한다 
