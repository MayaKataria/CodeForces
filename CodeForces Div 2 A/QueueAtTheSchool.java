import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        StringBuffer st=new StringBuffer(s);
        while(t--!=0){
            for(int i=1;i<n;i++){
                if(st.charAt(i)=='G'&&st.charAt(i-1)=='B'){
                    st.setCharAt(i, 'B');
                    st.setCharAt(i-1, 'G');
                    i++;
                }
            }
           
        }
        System.out.println(st);
        sc.close();
      
    }
    
}