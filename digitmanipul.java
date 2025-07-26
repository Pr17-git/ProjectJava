package Raj;
import java.util.*;
public class digitmanipul {
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
			return true;
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			String str=Integer.toString(n);
			int d=0;
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i<=str.length();i++) {
				if(isPrime(i)==true) {
					list.add(i-1);
				}
			}
			for(char i=0;i<str.length();i++) {
				for(int j=0;j<list.size();j++) {
					if(i==list.get(j)) {
						d =d+Character.getNumericValue(str.charAt(i));
					}
				}
	}System.out.println(d);
	 System.out.println(d%3==0?"prime":"not prime");
	} 
	}
