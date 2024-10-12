/*Input
The first input line contains a single integer n (1 ≤ n ≤ 1000) — the number of problems in the contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.

Output
Print a single integer — the number of problems the friends will implement on the contest.*/
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
