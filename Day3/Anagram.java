import java.util.*;
public class Anagram{
    public static void main(String[] args) {
        String str = "reho";
        String str1 = "hero";
        char ch[] =str.replace(" ","").toLowerCase().toCharArray();
        char ch1[] = str1.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(Arrays.equals(ch,ch1)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }


    }
}
