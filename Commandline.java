public class Commandline {
    public static void main(String args[]){
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        int a = Integer.parseInt(args[2]);
        int b = Integer.parseInt(args[3]);
        System.out.println(a+b);
    }
}
