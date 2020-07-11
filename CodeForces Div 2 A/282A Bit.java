import java.util.Scanner;
 
public class Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        String a="X++";
        String b="++X";
        String s[]= new String[n];
        for(int i=0;i<n;i++){
            String y= sc.next();
            s[i]=y;
        }
        for(int i=0;i<n;i++){
            if(s[i].equals(a)||s[i].equals(b))
            x++;
            else
            x--;
        }
        System.out.println(x);
    }
}