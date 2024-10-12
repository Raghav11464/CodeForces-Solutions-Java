import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        char temp;
        str=s.nextLine();
        char[] ch=str.toCharArray();        //String converted to array of characters
        for(int i=0;i<ch.length;i+=2){
            for(int j=0;j<ch.length-i-1;j+=2){
                if(ch[j]>ch[j+2]){
                    temp=ch[j];        //Using Bubble Sort algorithm
                    ch[j]=ch[j+2];
                    ch[j+2]=temp;
                }
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
