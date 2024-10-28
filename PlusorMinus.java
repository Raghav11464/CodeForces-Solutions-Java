import java.util.*;
public class PlusorMinus {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=s.nextInt();

            }
        }
        for(int i=0;i<n;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            int c=arr[i][2];
            if((a+b)==c)
                System.out.println('+');
            else if((a-b)==c)
                System.out.println('-');
        }

    }
}
