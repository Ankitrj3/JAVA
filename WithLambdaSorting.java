interface sort{
    public void bubblesort(int arr[],int size);
}
public class WithLambdaSorting {
    public static void main(String[] args) {
        int arr[] = {12,33,44,1,2,67,88,944,5,9};
        int n = arr.length;

        sort so = (ar,s)->{
             for(int i=0;i<s;i++){
                for(int j=0;j<s-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
             }
        };
        so.bubblesort(arr, n);
        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
