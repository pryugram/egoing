
public class AuthApp3 {

	public static void main(String[] args) {

		//String[] users = {"egoing", "jinhuck", "youbin"};
		String [] [] users = {											// elements of users : array, array = string
				{"egoing", "1111"},
				{"jinhuck", "2222"},								// dont miss ','			
				{"youbin", "3333"}
		};																	
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i = 0; i <users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputId)	&& 
					current[1].equals(inputPass)
				) {										// check if currentId == inputId
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
