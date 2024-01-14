public class CommandLineSwitch {
    public static void main(String args[]) {
        
            switch (args[0]) {
                case "1":
                    System.out.println("hello ankit ranjan");
                    break;

                case "3":
                    System.out.println("hi ankit");
                    break;

                case "4":
                    System.out.println("bye bye ankit ranjan");
                    break;

                default:
                    System.out.println("invalid");
            }
        } 
    }

