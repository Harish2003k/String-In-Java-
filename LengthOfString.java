import java.util.*;
public class LengthOfString {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Name:");
		String firstName=sc.next();
		System.out.println("Enter the Last Name:");
		String lastname=sc.next();
		String Fullname=firstName+lastname;
		System.out.println("the concatination of string is:"+Fullname);
		System.out.println("The number of character in string :"+Fullname.length());
		for (int i=0;i<Fullname.length();i++) { // this work on print every character in string
			System.out.println(Fullname.charAt(2));
		}
		
	}
}
