public class Constructor3 {
    // Member variables
    double length;
    double width;

    // Constructor without parameters (default constructor)
    public Constructor3() {
        length = 0.0;
        width = 0.0;
    }

    // Constructor with parameters
    public Constructor3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Creating an instance of Rectangle class using the default constructor
        Constructor3 defaultRect = new Constructor3();
        
        // Creating an instance of Rectangle class using the parameterized constructor
        Constructor3 customRect = new Constructor3(5.0, 3.0);
        
        // Displaying the areas of rectangles
        System.out.println("Area of default rectangle: " + defaultRect.calculateArea());
        System.out.println("Area of custom rectangle: " + customRect.calculateArea());
    }
}
