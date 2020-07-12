import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int res;
       if(x%5==0){
           res=x/5;
       }
       else
       res=(x/5)+1;
       System.out.println(res);
        sc.close();
    }
    
}