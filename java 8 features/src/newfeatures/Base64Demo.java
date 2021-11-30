package newfeatures;

import java.util.Base64;
import java.util.Scanner;

// Java program to Encrypt and Decrypt data 
public class Base64Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String userName,password;
		
		System.out.println("************* Coforge Technology ************");
		
		System.out.println("Enter your User Name: ");
		userName=sc.next();
		
		System.out.println("Enter your Password: ");
		password=sc.next();
		
//		Encoding the String to Base64 format
		String encodedPassword=Base64.getEncoder().encodeToString(password.getBytes());
		
		System.out.println("Login Successfull!!!");
		System.out.println("User Name: "+userName);
		System.out.println("Password: "+encodedPassword);

		System.out.println("*********** Decrypt the Password ***********");
		
//		decode Base64 format to byteArray
		String decoderPassword=new String(Base64.getDecoder().decode(encodedPassword));

		System.out.println("The Password is: "+decoderPassword);
		
		System.out.println("************* URL Encoding ***********");
		
		Base64.Encoder encodeURL=Base64.getUrlEncoder();
		String eurl=encodeURL.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());
		System.out.println("Encode URL: "+eurl);
		
	}
	
}
