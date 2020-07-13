import java.util.Scanner;

public class WayTooLong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            String word=sc.next();
            if(word.length()<=10){
                System.out.println(word);
            }
            else{
                int len=word.length()-2;
                System.out.println(word.substring(0,1)+len+word.substring(word.length()-1));
            }
            
        }
        sc.close();
    }
}