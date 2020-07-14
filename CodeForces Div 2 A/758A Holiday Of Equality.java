import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0;
        int total=0;
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
            max=a[0];
            if(a[i]>max)
            max=a[i];

        }
        for(int i=0;i<n;i++){
            total=total+Math.abs(max-a[i]);
        }
        System.out.println(total);

    }
    
}