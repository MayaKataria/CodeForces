import java.util.*;
public class Team{
  
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[3];
        int b[]=new int[1000];
        int sum=0;
        int count=0;
        for(int j=0;j<n;j++){
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
            sum=a[0]+a[1]+a[2];
}
b[j]=sum;
if(b[j]>=2)
    count++;
 
 
        }
    
        System.out.println(count);
 
 }
    }
