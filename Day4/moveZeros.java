public class moveZeros {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,0,0,0,0,0,54,6,56,56,87,98,0,0,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            } 
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
