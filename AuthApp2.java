
public class AuthApp2 {

	public static void main(String[] args) {

		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String pass2 = "2222";
		String inputPass = args[1];
		
		
		
		
		System.out.println("HI.");
//			
//	//	if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)) {
//			System.out.println("Master!");
//			} else {
//				System.out.println("Wrong password!");
//			}
//		}else {
//			System.out.println("Who are you?");
//		}
//	
		boolean isRightPass = inputId.equals(id) && inputPass.equals(pass)  || inputPass.equals(pass2);
		if(isRightPass ) {
			System.out.println("Master!");	
			
		} else {
			System.out.println("Who are you?");
			
		}
		
		
		
		
		
	}

}
