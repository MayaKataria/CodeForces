import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=1;i<=m;i++){
            if(i%4==2){
               for(int j=1;j<n;j++){
               
                    System.out.print(".");
         }
        System.out.println("#");
        }
        else if(i%4==0){
            System.out.print("#");
            for(int j=1;j<n;j++)
            System.out.print(".");
            System.out.println("");
        }
        else{
            for(int j=1;j<=n;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    
}
}