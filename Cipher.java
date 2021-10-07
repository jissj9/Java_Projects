
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Cipher {
	
	static char[] cipherArray = new char[27];
	static String createdString = "newString ";
	static char[] charArray = createdString.toCharArray();
	
	public static void main(String args[]) {
		
		boolean scanning = true;
		while(scanning) {
		System.out.println("Please input the characters you would like have encrypted (or type 'exit' to end the program) :");
		
		Scanner inputChar = new Scanner(System.in);
		String userInput = inputChar.nextLine();
		
		if(userInput.equalsIgnoreCase("exit")) {
			
			scanning=false;
			System.out.println("Goodbye!");
			break;
		}
		
		createCipher();
		
		System.out.print("Decrypted Text: ");
		System.out.println(decrypt(encrypt(userInput)));
		
		System.out.print("Encrypted Text: ");
		System.out.println(encrypt(userInput));
		
		}
	}
	public static char[] decrypt(char[] encrytpedUserInputArray) {
		
		char[] decryptedArray = new char[encrytpedUserInputArray.length];
		int givenValue = 0;
		
		for(int x=0; x<encrytpedUserInputArray.length; x++) {
			for(int i=0; i<27; i++) {
				if(cipherArray[i] == encrytpedUserInputArray[x]) {
					decryptedArray[givenValue] = charArray[i];
					givenValue++;
				}
			}
		}
		
		return decryptedArray;
	}
	
	
	public static void createCipher() {
		
		
		Random  random = new Random();
		int x=0;
		ArrayList<Integer> numbersUsed = new ArrayList<Integer>();
		
		while (x < 27) {
			
			int randomNumber = random.nextInt(27);
			
			if(!numbersUsed.contains(randomNumber)) {
				cipherArray[x] = charArray[randomNumber];
				numbersUsed.add(randomNumber);
				x++;
			}
		}
		System.out.print("Encryption Pattern");
		
		System.out.println(cipherArray);
	}
	
	public static char[] encrypt(String userInput) {
		
		
		char[] userInputArray = userInput.toCharArray();
		char[] encryptedArray = new char[userInput.length()];
		int givenValue = 0;
		
			for(int x=0; x<userInput.length(); x++) {
				for(int i=0; i<27; i++) {
					if(charArray[i] == userInputArray[x]) {
						encryptedArray[givenValue] = cipherArray[i];
						givenValue++;
					}
				}
			}
		
		return encryptedArray;
	}
	
	
}

/*
  import java.util.*;

import java.util.Scanner;

class JavaExample{
	
	
   public static void main(String args[]){
 
      ArrayList<String> alist=new ArrayList<String>(); 
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Jack");
      alist.add("Tom");
      
      Scanner input = new Scanner( System.in ); 
      //Displaying elements
      System.out.println("The names on the list are : " + alist + "There are " + alist.size() +
    		             " names");
      System.out.println("Enter the name you want to add to the list.");
      String namesEntered = input.next();
      
      System.out.println("Enter the postion you want to place the name.");
      int numberEntered = input.nextInt();
      
      alist.add(numberEntered - 1, namesEntered);
      System.out.println("The names are now: " + alist + "There are now " + alist.size() + 
    		                " names on the list." );
      
      //Removing elements
      System.out.println("What name do you name do you want to remove from the list?" );
      String removeName = input.next();
      
      alist.remove(removeName);
      System.out.println("The names on the list are : " + alist + "There are " + alist.size() +
	                     " names");
     
      

      
   }
   
}
*/