import java.util.*;
public class EmailToUsername {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email id :");
		String email=sc.next();
		String Username="";
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
				break;
			}
			else {
				Username=Username+email.charAt(i);
			}
		}
		System.out.println("The username of email is:"+Username);
	}

}
