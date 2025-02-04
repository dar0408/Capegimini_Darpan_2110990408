 // W.A.P to remove duplicate element form an array:-
// Using HashSet and LinkedListSet:- 
//	import java.util.Scanner;
//	import java.util.*;
//	public class DuplicateElements{
//		public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		int arr[] =  new int[input];
//			for(int i=0;i<input;i++){
//			arr[i] = sc.nextInt();
//			}
//			Set<Integer> ans = new HashSet<>();
//			Set<Integer> ans = new LinkedHashSet()<>;
//			for(int num : arr){
//			ans.add(num);
//			}
//			System.out.println(ans);
//			
//		}
//	}



// using Sorting and 2Pointer approach:- 
import java.util.Arrays;
public class DuplicateElements{
	public static void main(String args[]){
	int arr[] = {1,2,3,3,2,1,4};
	Arrays.sort(arr);
	int j=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i] != arr[j]){
				j++;
				arr[j] = arr[i];
			}
		}
		for(int i=0;i<=j;i++){
		System.out.print(arr[i] + " ");
		}
	}
}
