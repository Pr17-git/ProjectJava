package Raj;
import java.util.*;
public class twopointer {
	public static void main(String[] args) {
		String s="rar";
		int l=0;
        int r=s.length()-1;
        int h=0;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
                h+=1;
            }else {
            	break;
            }
        }
        if(h==s.length()/2) {
        	System.out.println("yes");
        }else {
        	System.out.println("no");
        }
	}
}
