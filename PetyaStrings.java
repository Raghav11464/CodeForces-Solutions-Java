//Problem112A
/*Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

Input
Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

Output
If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.*/
import java.util.*;
public class PetyaStrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1,str2;
        str1=s.nextLine();
        str2=s.nextLine();
        
        String str1l=str1.toLowerCase();
        String str2l=str2.toLowerCase();

        int res=str1l.compareTo(str2l);
        if(res<0){
            System.out.println(-1);
        }else if(res==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }


    }
}
