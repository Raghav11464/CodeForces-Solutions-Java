//Problem 1807A

/*You are given three integers 𝑎, 𝑏, and 𝑐 such that exactly one of these two equations is true:

𝑎+𝑏=𝑐
𝑎−𝑏=𝑐
Output + if the first equation is true, and - otherwise.
Input
The first line contains a single integer 𝑡 (1≤𝑡≤162) — the number of test cases.

The description of each test case consists of three integers 𝑎, 𝑏, 𝑐 (1≤𝑎,𝑏≤9, −8≤𝑐≤18). The additional constraint on the input: it will be generated so that exactly one of the two equations will be true.

Output
For each test case, output either + or - on a new line, representing the correct equation.*/

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
