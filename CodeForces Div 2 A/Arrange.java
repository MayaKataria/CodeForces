import java.util.Arrays;
import java.util.Scanner;

public class Arrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
    
        while(t-->0){
            int n=sc.nextInt();
            int b=sc.nextInt();
            int a[]=new int[n];
            int sum=0,count=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            
            }
            Arrays.sort(a);
            for(int i=0;i<n;i++){
                sum=sum+a[i];
                if(sum<b){
                    count++;
                }
            }
           System.out.println(count); 

        }
    }
}