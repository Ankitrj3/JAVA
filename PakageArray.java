import java.util.Arrays;
public class PakageArray {


    public static void main(String[] args) {
       
        int[] myArray = {5, 2, 9, 1, 6};

        
        Arrays.sort(myArray);

     
        System.out.print("Sorted array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}


