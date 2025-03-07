// EquilateralPyramid.java - Concrete class extending Shape and implementing Volume
class EquilateralPyramid extends Shape implements Volume {
    private double baseSide, height;

    // Constructor to initialize equilateral pyramid with base side and height
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

}
