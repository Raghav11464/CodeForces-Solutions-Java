import java.util.*;
public class StairPeak {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            if(a[i][2]>a[i][1] && a[i][1]>a[i][0]){
                System.out.println("STAIR");
            }
            else if(a[i][1]>a[i][0] && a[i][1]>a[i][2]){
                System.out.println("PEAK");
            }
            else{
                System.out.println("NONE");
            }

        }
        
        

        

    }
}
