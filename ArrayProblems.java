import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayProblems {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

   
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

 
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        System.arraycopy(temp, 0, arr, 0, n);
    }

  
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

   
    public static void removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                arr[i] = Integer.MIN_VALUE; 
            }
        }
    }

    public static void main(String[] args) {
      
        int[] arr = {5, 8, 3, 2, 9, 7, 3};

     
        int max = findMax(arr);
        System.out.println("Maximum element: " + max);

    
        int target = 9;
        int index = search(arr, target);
        System.out.println("Index of " + target + ": " + index);

       
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

       
        rotateArray(arr, 2);
        System.out.println("Rotated array: " + Arrays.toString(arr));

       
        int sum = sumArray(arr);
        System.out.println("Sum of array elements: " + sum);

     
        removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
    }
}
