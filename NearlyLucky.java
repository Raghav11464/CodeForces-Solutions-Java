import java.util.*;
public class NearlyLucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num;
        num=sc.nextLine();
        int count=0;
        for(int i=0;i<num.length();i++){
            char digit=num.charAt(i);
            if(digit=='4' || digit=='7'){
                count++;
            }
        }

        if(count==4 || count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
