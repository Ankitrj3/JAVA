// here enum contains objects
enum status{
    Running,Failed,Pending,Success;
}


public class enumif {
     public static void main(String args []){
        // in this status will work as datatype
        status i = status.Running;
        System.out.println(i);
        
        if(i==status.Running){
            System.out.println("the program is running good");
        }else if(i==status.Failed){
            System.out.println("the is not working check your program");
        }else if(i==status.Pending){
            System.out.println("the program is wait state");
        }else{
            System.out.println("the program is finish u can proceed");
        }
     }    
}
