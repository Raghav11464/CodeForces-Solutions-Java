//Problem 1950A
/*
You are given three digits 𝑎, 𝑏, and 𝑐. Determine whether they form a stair, a peak, or neither.

A stair satisfies the condition 𝑎<𝑏<𝑐.
A peak satisfies the condition 𝑎<𝑏>𝑐.
Input
The first line contains a single integer 𝑡 (1≤𝑡≤1000) — the number of test cases.

The only line of each test case contains three digits 𝑎, 𝑏, 𝑐 (0≤𝑎, 𝑏, 𝑐≤9).

Output
For each test case, output "STAIR" if the digits form a stair, "PEAK" if the digits form a peak, and "NONE" otherwise (output the strings without quotes).*/

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
