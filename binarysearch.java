import java.util.*;
class binary{
    public int fun(int arr[],int low,int high,int key){
        while(low<=high){
            int mid = low+high/2;
            if(arr[mid]==key){
               return mid;
            }else if(arr[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }


        }
        return -1;
    }
}
class binarysearch{
    public static void main(String args []){
        binary f = new binary();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key = sc.nextInt();

        int s=f.fun(arr,0,n-1,key);
        
        if(s==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found");
        }
    }
}