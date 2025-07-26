package Raj;
import java.util.*;
public class NonEmptySubString {
	public static void main(String[] args) {
		String str="212";
		List<Character>l=new ArrayList<>();
		List<String>p=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			l.add(c);
		}
		for(int i=0;i<l.size();i++) {
			for(int j=i+1;j<=l.size();j++) {
				p.add(str.substring(i,j));
			}
		}System.out.println(p);
	}}