package Raj;
import java.util.*;
public class BalancedArray {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8};
		int u=0;
		if(arr[0]%2==0) {
			u+=1;
		for(int i=1;i<arr.length-1;i++) {
			if(i%2!=0&&arr[i]%2!=0&&(i+1)%2==0&&arr[i+1]%2==0) {
				u+=1;
			}i++;
		}}else if(arr[0]%2!=0) {
			u+=1;
			for(int i=1;i<arr.length-1;i++) {
				if(i%2!=0&&arr[i]%2==0&&(i+1)%2==0&&arr[i+1]%2!=0) {
					u+=1;
				}i++;
		}}
		System.out.println(u);
		System.out.println((arr.length+1)/2);
		if(((arr.length+1)/2)==u) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}

}
