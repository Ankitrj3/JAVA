
// here enum contains objects
enum status{
    Running,Failed,Pending,Success;
}


public class enumswitch1 {
     public static void main(String args []){
        // in this status will work as datatype
        status i = status.Pending;
        
        switch (i) {
            case Running:
            System.out.println("working fine");
            break;

            case Failed:
            System.out.println("program is fail check your program");
            break;

            case Pending:
            System.out.println("program is in pending state");
            break;

            case Success:
            System.out.println("program is completed");
            break;

            default:
            System.out.println("invalid entry");
            break;

        }
     }    
}
