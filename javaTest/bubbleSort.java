public class bubbleSort {
    public static void main(String[] args) {
        int[]arr={45,3,54,3,5,8,9,56,4,3,3,33333};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void bubbleSort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
