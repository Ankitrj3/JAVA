public class MultipleCatch {
    public static void main(String[] args) {
        int i = 3;
        int j =0;
        int nums []= new int [5];
        try
        {
         j = 18/i;
        System.out.println(nums[1]);
        System.out.println(nums[5]);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("stay in your limits");
        }catch(Exception e ){
        System.out.println("something went wrong");
    }
    System.out.println("bye ");
}
}

