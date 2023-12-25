import java.util.*;

class serach{
    public static void main(String args []){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr [] = new int[n];

         for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
         }
         int key = sc.nextInt();
         boolean a = false;
          for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("element found in index no. "+i);
                a= true;
            }
         }
        if(a==false){
            System.out.println("element not found. ");
        }
    }
}