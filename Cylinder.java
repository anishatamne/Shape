// Cylinder.java - Concrete class extending Shape and implementing Volume
class Cylinder extends Shape implements Volume {
    private double radius, height;

    // Constructor to initialize cylinder with radius and height
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    
}
