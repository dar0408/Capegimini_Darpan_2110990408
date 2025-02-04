
import java.util.*;
public class Panagram{
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwwxyz";
        boolean arr[] = new boolean[26];
        String str1 = str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <='z'){
                if(arr[ch - 'a'] == true){
                    break;
                }
                else{
                    arr[ch - 'a'] = true;
                }
            }
        }

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]){
                count++;
            }
        }

        if(count == 26){
            System.out.println("string is pangram");
        }
        else{
            System.out.println("string is not pangram");
        }
        
    }
}