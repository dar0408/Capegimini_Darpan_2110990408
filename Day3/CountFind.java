// import java.util.*;
// public class CountFind {
//     public static void main(String[] args) {
//         String str = "jndndfSfsdf@@32@4ew324";
//         char ch[] = str.toCharArray();
//         int dCount = 0; 
//         int aCount = 0;
//         int sCount = 0;

//         for(int i=0;i<ch.length;i++){
//             if(Character.isDigit(ch[i])){
//                 dCount++;
//             }
//             else if(Character.isAlphabetic(ch[i])){
//                aCount++;
//             }
//             else{
//                 sCount++;
//             }
//         }
//         System.out.println("The number of digits in the string is: "+dCount);
//         System.out.println("The number of alphabets in the string is: "+aCount);
//         System.out.println("The number of special characters in the string is: "+sCount);


//     }
// }



//Using Stream:- 

import java.util.stream.*;
public class CountFind{
    public static void main(String[] args) {
        String str = "hdks713bh23#@4#$2mnfSDFSD";
        long dCount = str.chars().filter(Character::isDigit).count();
        long uCount = str.chars().filter(Character::isUpperCase).count();
        long lCount = str.chars().filter(Character::isLowerCase).count();
        long sCount = str.chars().filter(ch -> ! Character.isLetterOrDigit(ch)).count();

        System.out.println(dCount);
        System.out.println(uCount);
        System.out.println(lCount);
        System.out.println(sCount);
    }
}