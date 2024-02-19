public class RemoveCharUsingIndex {
    public static void main(String args[]){
        String str = args[0];
        int index = 2;

        System.out.println(str.substring(0,index)+str.substring(index+1));
    }
}
