package Raj;
import java.util.*;
public class FancyNo {
	public static void main(String[] args) {
		            Scanner sc=new Scanner(System.in);
		            int n=155;
		            List<Integer>l=new ArrayList<>();
		            List<Integer>m=new ArrayList<>();
		            List<Integer> nums = new ArrayList<>();
		            for(int i=1;i<10;i++){
		                nums.add(i);
		            }System.out.println(nums);
		           for(int i=0;i<3;i++){
		               int s=n;
		               s*=(i+1);    
		               l.add(s);
		            }System.out.println(l);
		            for (int num : l) {  
		                String ss=String.valueOf(num);
		                //System.out.print(ss);
		            for (char ch : ss.toCharArray()) {  
		                m.add(Character.getNumericValue(ch));
		               // System.out.print(ch);
		            }}System.out.print(m);
		            Collections.sort(m);
		            System.out.println(m);
		            if((m.equals(nums))==true){
		                System.out.println("Fancy");
		            }else{
		                System.out.println("not fancy");
		            }
		        }
		        
		    }
