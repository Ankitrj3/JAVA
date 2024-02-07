import java.util.*;
public class ClassGrade {
    public String mark(int marks){
        if(marks>=90 && marks<=100){
            return "A+";
        }
        else if(marks>=80 && marks<=89){
            return "A";
        }
        else if(marks>=70 && marks<=79){
            return "B";
        }
        else if(marks>=60 && marks<=69){
            return "C";
        }
        else if(marks>=50 && marks<=59){
            return "D";
        }else{
            return "E";
        }
    }
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        int marks = ank.nextInt();

        ClassGrade c = new ClassGrade();
        String a =c.mark(marks);
        System.out.println("the grade of student according to marks "+a);
    }
}
