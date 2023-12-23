import java.util.*;

class quicksort{
     public int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int j = low-1;
         for(int i =low;i<high;i++){
             if(arr[i]<pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
             }
         }
         int temp = arr[j+1];
         arr[j+1] = arr[high];
         arr[high] = temp;
         return j+1;
     }
     public void qp(int arr[],int low ,int high){
        if(low<high){
            int pi = partition(arr, low, high);
            qp(arr,low,pi-1);
            qp(arr,pi+1,high);
        }
     }
}

class quick{
    public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int n = sc.nextInt();
    int arr [] = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    quicksort q = new quicksort();
    q.qp(arr,0,n-1);
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }

}
}