import java.util.*;
import java.util.ArrayList;

class arrayList{
    public static void main(String args[]){
        List <Integer> arr = new ArrayList<>();
        
        Scanner ank = new Scanner(System.in);
        
            System.out.println("enter the value to enter in array list");
            while(ank.hasNextInt()){
            int a = ank.nextInt();
            arr.add(a);
}
System.out.println("the value enter by the user");
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        
    int sum = 0;
    for(int i=0;i<arr.size();i++){
        sum+=arr.get(i);
    }
    System.out.println("sum of the array : "+sum);
    }
}