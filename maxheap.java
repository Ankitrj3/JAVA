import java.util.*;

class maxheapsort{
     public void maxheapfy(int arr[],int n,int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxheapfy(arr, n, largest);
        }
     }
     public void bheap(int arr [],int n){
        for(int i=n/2-1;i>=0;i--){
            maxheapfy(arr, n, i);
        }
     }
     public void heapsort(int arr[] ,int n){
        bheap(arr, n);
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
      
            maxheapfy(arr,i,0);
        }
     }
}

class maxheap{
    public static void main(String args []){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        maxheapsort m = new maxheapsort();
        m.heapsort(arr,n);
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }


    }
}

