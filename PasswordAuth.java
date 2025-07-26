package Raj;
import java.util.*;
public class PasswordAuth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String un=sc.nextLine();
		String pw=sc.nextLine();
		if(pw.contains(un)==false) {
		if(pw.length()>=8 && pw.matches(".*[a-z].*") && pw.matches(".*[A-Z].*") && pw.matches(".*\\d.*")&&pw.matches(".*[^a-zA-Z0-9].*")) {
			System.out.println("pw accepted");
		}else {
			System.out.println("pw rejected");
		}
	}else {
		System.out.println("pw contains un");
	}sc.close();
		}
}