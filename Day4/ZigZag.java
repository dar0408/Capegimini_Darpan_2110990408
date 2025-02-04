public class ZigZag {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {7,8,9,10,11,12};
        int arr3[] = new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j< arr2.length){
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }
        while(i < arr1.length){
            arr3[k++] = arr1[i++];
        }
        while(j < arr2.length){
            arr3[k++] = arr2[j++];
        }
       for(int l=0;l<arr3.length;l++){
        System.out.print(arr3[l] + " ");
       }
    }
}


