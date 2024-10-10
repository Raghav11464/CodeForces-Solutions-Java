import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int c1=0;
        for(int i=0;i<n;i++){
            int c2=0;
            for(int j=0;j<3;j++){
                if(arr[i][j]==1){
                    c2++;
                }
            }
            if(c2>=2){
                c1++;
            }
        }
        System.out.println(c1);
        
    }  
}
