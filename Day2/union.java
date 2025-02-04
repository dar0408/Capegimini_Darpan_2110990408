import java.util.*;
public class union {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {3,4,5,6};
        int arr3[] = new int[arr1.length + arr2.length];
        for(int i=0;i<arr3.length;i++){
            if(i<arr1.length){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[i-arr1.length];
            }
        }
        Set<Integer> setss = new HashSet<Integer>();
        for(int num : arr3){
            setss.add(num);
        }
        System.out.println(setss);
    }
}
