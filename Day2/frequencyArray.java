import java.util.Arrays;

public class frequencyArray{
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 45, 5, 45, 3, 3, 22, 2, 2};
        int frequency[] = new int[arr.length];
        Arrays.fill(frequency, -1); 

        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] == -1) { 
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        frequency[j] = 0; 
                    }
                }
                frequency[i] = count;
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] != 0) {
                System.out.println("the Element " + arr[i] + " is repeated " + frequency[i] + " times");
            }
        }
    }
}
