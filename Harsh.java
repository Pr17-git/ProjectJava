package Raj;
import java.util.*;
public class Harsh {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int b=0;
		String a=Integer.toString(n);
		for (int i = 0; i < a.length(); i++) {
		    int d = Character.getNumericValue(a.charAt(i));
		    if(d==0) {
		    	c++;
		    }
		    else {
		    	b++;
		    }
	}System.out.print(c>0?"Harshed":"!Harshed");

	}
}