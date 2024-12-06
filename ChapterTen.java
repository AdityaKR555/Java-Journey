class Circle {
    int radius;

    // Constructor for Circle
    Circle(int r) {
        this.radius = r;
    }

    // Method to calculate circumference
    void Circumference() {
        System.out.println(2 * 3.14f * radius);
    }

    // Method to calculate area
    void Area() {
        System.out.println(3.14f * radius * radius);
    }
}

class Cylinder extends Circle {
    int height;

    // Constructor for Cylinder, adding height as a parameter
    Cylinder(int r, int h) {
       super(r);  // Call the Circle constructor
       this.radius = r;
        this.height = h;
    }

    // Method to calculate volume of the cylinder
    void Volume() {
        float volume = 3.14f * radius * radius * height;
        System.out.println(volume);
    }
    @Override
    void Area(){
        System.out.println(2*3.14f*radius*(radius+height));
    }
    @Override
    void Circumference(){
        System.out.println(2*3.14f*radius*height);
    }
}

public class ChapterTen {
    public static void main(String[] args) {
        // Create a cylinder with radius 7 and height 10
        Cylinder cyl = new Cylinder(10, 10);
        cyl.Volume();         // Calculate volume
        cyl.Circumference();  // Calculate circumference
        cyl.Area();           // Calculate area
        Circle cir = new Circle(5);
        cir.Circumference();
        cir.Area();
    }
}
