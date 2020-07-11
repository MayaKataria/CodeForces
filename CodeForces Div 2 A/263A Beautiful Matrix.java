import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[5][5];
    int m=0;
    int n=0;
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
          arr[i][j]=sc.nextInt();
          if(arr[i][j]==1){
           m=i;
           n=j;
          }
        }
    }
    int res=Math.abs(m-2)+Math.abs(n-2);
    System.out.println(res);
}
}