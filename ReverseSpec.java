package Raj;
import java.util.*;
public class ReverseSpec {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			List<Integer>l=new ArrayList<>();
			for(int i=0;i<9;i++) {
			int y=sc.nextInt();
			l.add(y);
			}int k=sc.nextInt();
			int h=k-1;
			List<Integer>m=new ArrayList<>();
			int s=l.size();
			while(s!=0) {
				for(int i=h;i>=0;i--) {
					int n=l.get(i);
					m.add(n);
					l.remove(i);
					int u=l.size();
					if(u==3) {
						break;
					}
					s=u;
				}
			}System.out.print(m);
			sc.close();
	}
}