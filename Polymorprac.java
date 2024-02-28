class student {
    void profile(){
        System.out.println("student profile on github");
    }
}
class emp extends student{
    void profile(){
        System.out.println("Employee profile on github");
    }
}
class workfromhome extends student{
    void profile(){
        System.out.println("Employee profile on github for work from home");
    }
}


class Polymorprac{
    public static void main(String args[]){
         workfromhome a = new workfromhome();
        a.profile();
    }
}