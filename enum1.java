// here enum contains objects
enum status{
    Running,Failed,Pending,Success;
}


public class enum1 {
     public static void main(String args []){
        // in this status will work as datatype
        status i = status.Running;
        System.out.println(i);

        status k = status.Failed;
        System.out.println(k);
     }    
}
