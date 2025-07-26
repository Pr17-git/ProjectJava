package Raj;
import java.util.*;
class substring {
	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	int arr[]= {};
	List<Integer>l=new ArrayList<>();
	int n=arr.length;
	int m=1;
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
			 int h=m*arr[j];
			 m=h;
			 l.add(m);
		}
		m=1;
		}int g=Collections.max(l);
		int s=1;
		int e=0;
		int w=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int y=s*arr[j];
				 s=y;
				 if(g==s) {
					 e=i;
					 w=j;
				 }
			}
			s=1;
		}
		for(int i=e;i<=w;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	}
