// Sphere.java - Concrete class extending Shape and implementing Volume
class Sphere extends Shape implements Volume {
    private double radius;

    // Constructor to initialize sphere with radius
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Method to calculate surface area of sphere
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Spheres do not have a perimeter
    public double calculatePerimeter() {
        return 0;
    }

    
}
