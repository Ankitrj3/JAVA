public class Constructor2 {
    
    String make;
    String model;
    int year;

    
    public Constructor2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
      
        Constructor2 myCar = new Constructor2("Toyota", "Corolla", 2022);
   
        myCar.displayDetails();
    }
}
