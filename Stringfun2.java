public class Stringfun2 {
    public static void main(String args[]){
        String str = "ankit/robin/aj/rj/sumit/sahin/anit";

        String arr[] = str.split("/");

        for(String val : arr){
            System.out.println(val.trim());
        }
    }
}
