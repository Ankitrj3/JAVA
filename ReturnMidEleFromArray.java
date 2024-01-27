public class ReturnMidEleFromArray {
    public static void main(String[] args) {
        // if array length is even then return two values from mid
        // if array length is odd then return one value from mid

        int arr[] = {12,34,45,57,13,67,238,967,675};

        if (arr.length % 2 == 0) {
            int mid1 = arr[arr.length / 2 - 1];
            int mid2 = arr[arr.length / 2];
            System.out.println(mid1);
            System.out.println(mid2);
        } else {
            int mid = arr[arr.length / 2];
            System.out.println(mid);
        }
    }
}
