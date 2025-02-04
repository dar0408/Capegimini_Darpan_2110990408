import java.util.*;
public class StringFrequency {
    public static void main(String[] args) {
        String str = "aabbsbkdfjksfdnbbdfb";
        char ch[] = str.toCharArray();
        int freq[] = new int[ch.length];
        Arrays.fill(freq, -1);
        for(int i=0;i<ch.length;i++){
            if(freq[i] == -1){
                int count = 1;
                for(int j=i+1;j<ch.length;j++){
                    if(ch[i]==ch[j]){
                        count++;
                        freq[j] = 0;
                    }
                }
                freq[i] = count;
            }
        }
        for(int i=0;i<ch.length;i++){
            if(freq[i]!=0){
                System.out.println("The Element "+ch[i]+" is repeated "+freq[i]+" times");
            }
        }

    }
}
