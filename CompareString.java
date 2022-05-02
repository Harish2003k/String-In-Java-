import java.util.*;
public class CompareString {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String :");
		String str1=sc.next();
		System.out.println("Enter the Second String :");
		String str2=sc.next();
		if(str1.compareTo(str2)==0) {
			System.out.println("String are Equal.");
		}
		else {
			System.out.println("String are not Equal.");
		}
	}

}
