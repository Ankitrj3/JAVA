public class Armstrongnumber {
    public static void main(String args []){
        if (args.length == 0) {
            return;
        }
        int n = Integer.parseInt(args[0]);
        int temp =n;
        int r ,sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum = sum + (r*r*r);
        }
        if(temp == sum){
            System.out.println("armstrong number");
        }else{
            System.out.println("not an armstrong number");
        }
    }
}
