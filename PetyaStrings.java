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