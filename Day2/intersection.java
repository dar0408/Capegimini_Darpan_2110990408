import java.util.*;
public class intersection {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int arr1[] = {2,4,6,7,8,9,2};
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i] == arr1[j]){
                    ans.add(arr[i]);
                    arr1[j] = -1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}

