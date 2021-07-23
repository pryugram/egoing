
public class AuthApp3 {

	public static void main(String[] args) {

		String[] users = {"egoing", "jinhuck", "youbin"};
		String inputId = args[0];
		
		
		boolean isLogined = false;
		for(int i = 0; i <users.length; i++) {
			String currentId = users[i];
			if(currentId.equals(inputId)) {			// check if currentId == inputId
				isLogined = true;
				break; 								// break the Loop
			}
			
			
		}
		
		System.out.println("Hi,");					// and print out "Hi"
		if(isLogined) {								
			System.out.println("Master!!");			// and print out "Master!!"
			
		}	else {									// if isLogined = false, then do not print out "Master!!" and print out "Who are you?"
				System.out.println("Who are you?");
			
		}
		
		
		
	}

}
