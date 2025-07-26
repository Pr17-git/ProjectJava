package Raj;
import java.util.*;
public class kamal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=2;
        int cpy[]= {0,1,1,1,0,1,1,1,1,0};
        int arr1[]={0,0,0,0,0,0,0,0,0,0};
        int[] arr = Arrays.copyOf(cpy, cpy.length);
        for(int j=0;j<n;j++){
            for(int i=1;i<9;i++){
                int y=arr[i];
                if(y==0){
                if((arr[i-1]==1&&arr[i+1]==0)||(arr[i-1]==0&&arr[i+1]==1)||(arr[i-1]==0&&arr[i+1]==0)){
                    arr1[i]=1;
                }else if(arr[i-1]==1&&arr[i+1]==1) {
                    		arr1[i]=0;
                    }
               
                } else if(y==1){
                    if((arr[i-1]==0&&arr[i+1]==0)||(arr[i-1]==1&&arr[i+1]==1)){
                        arr1[i]=0;
                    }else if((arr[i-1]==1&&arr[i+1]==0)||(arr[i-1]==0&&arr[i+1]==1)){
                        arr1[i]=1;
                    }
                    }
            }  arr=Arrays.copyOf(arr1, arr1.length);
        }
        arr1=Arrays.copyOfRange(arr, 1, arr.length-1);
        System.out.print(Arrays.toString(arr1));
		
    }
}