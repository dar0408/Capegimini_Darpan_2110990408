// public class sum2DArray {
//     public static void main(String[] args) {
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         int sum =0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 sum += arr[i][j];
//             }
//         }
//         System.out.println(sum);
//     }
// }



import java.util.*;
public class sum2DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int arr1[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int arr2[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        // int arr1[][] = {{1,2,3},{4,5,6}};
        // int arr2[][] = {{7,8,9},{10,11,12}};
        int arr3[][] = new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}