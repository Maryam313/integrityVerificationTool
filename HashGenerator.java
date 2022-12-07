

import java.security.MessageDigest;
import java.util.Scanner;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 This class can be used to Generate hashes of files and strings..
 *
 */
public class HashGenerator {

	/**
	 * @param args: List of arguments received from the CLI.
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		
			// Create a Scanner objects
			Scanner input = new Scanner(System.in);  
			Scanner Input=new Scanner(System.in);
	
			//Ask the user to enter num>>
			System.out.println("Select an Action:");
			System.out.println("----------------------");
			System.out.println("1)-Generate HASH");
			System.out.println("2)-Compare HASH");
			System.out.println("3)-Re-compute");
			boolean valid=false;

	
			// Read user input
				do {
			System.out.println("Please Enter the input:");
			int action = input.nextInt();  

			//System.out.println("action is:" +action);        
			if (action==1) { 
			System.out.println("Please Enter the Text:");
			String st = Input.nextLine();
			System.out.println("1)-Generate HASH");
			System.out.println(toHexString(getSHA(st)));
			valid=true;
			break;
			
			}else if (action==2) {
			System.out.println("2)-Compare HASH");
			valid=true;
			break;
			
			}else if(action==3) {
			System.out.println("3)-Re-compute");
			valid=true;
			break;
			
			}else {
			System.out.println("Nothing");
			valid=false;
			break;
			}
			
		}while(valid!=true);
	}
	
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			return md.digest(input.getBytes(StandardCharsets.UTF_8));
		}

	public static String toHexString(byte[] hash) {
			BigInteger number = new BigInteger(1, hash);
			StringBuilder hexString = new StringBuilder(number.toString(16));
			while (hexString.length() < 64) {
			hexString.insert(0, '0');
			}
			return hexString.toString();
		}
	public void CompHash() {}
	public void ReComp() {}

	
}

