public class RemoveStringCharAccordingToInput {
    public static void main(String args[]){
        String str = args[0];
        char key = args[1].charAt(0);
        
        java.lang.StringBuilder SB = new java.lang.StringBuilder();
        for(char c : str.toCharArray()){
            if(c != key){
                SB.append(c);
            }
        }
        System.out.println(SB);
    }
}
