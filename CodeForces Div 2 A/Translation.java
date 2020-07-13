import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        StringBuilder sb=new StringBuilder(b);
        if(a.equals(sb.reverse().toString()))
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
    }
    
}