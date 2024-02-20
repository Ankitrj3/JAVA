public class palindrome3 {
    public static void main(String[] args) {
        String a = args[0];

        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(a);
        sb.reverse();

        if(a.equals(sb.toString())){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}
