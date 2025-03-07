# Shape
# Shape Calculator

## Description
This Java program is a **menu-driven application** that calculates the **area, perimeter, and volume** of various geometric shapes. It follows **OOP principles** by implementing an **abstract class (`Shape`)** and an **interface (`Volume`)**.

## Features
- Calculates **area** and **perimeter** for 2D shapes.
- Calculates **surface area** and **volume** for 3D shapes.
- Uses **separate Java files** for each shape.
- Implements **inheritance, abstraction, and interfaces**.
- **Follows proper coding guidelines** with comments and structured code.

## Shapes Implemented
- **Circle**
- **Rectangle**
- **Square**
- **Sphere** (implements `Volume`)
- **Cylinder** (implements `Volume`)
- **Equilateral Pyramid (Square Base)** (implements `Volume`)

## File Structure
```
ShapeCalculatorProject/
│── Shape.java              # Abstract class for all shapes
│── Volume.java             # Interface for volume calculation
│── Circle.java             # Implements Shape
│── Rectangle.java          # Implements Shape
│── Square.java             # Implements Shape
│── Sphere.java             # Implements Shape, Volume
│── Cylinder.java           # Implements Shape, Volume
│── EquilateralPyramid.java # Implements Shape, Volume
│── ShapeCalculator.java    # Main menu-driven program
│── README.md               # Documentation for the project
```

## Class & Method Details
### `Shape.java` (Abstract Class)
- **Fields:** `shapeName`
- **Constructor:** Initializes `shapeName`.
- **Methods:**
  - `calculateArea()` (Abstract) - To be implemented in subclasses.
  - `calculatePerimeter()` (Abstract) - To be implemented in subclasses.

### `Volume.java` (Interface)
- **Method:** `calculateVolume()` (Abstract) - Implemented by 3D shapes.

### `Circle.java`
- **Implements:** `Shape`
- **Methods:**
  - `calculateArea()` = π * r²
  - `calculatePerimeter()` = 2 * π * r

### `Rectangle.java`
- **Implements:** `Shape`
- **Methods:**
  - `calculateArea()` = length * width
  - `calculatePerimeter()` = 2 * (length + width)

### `Square.java`
- **Implements:** `Shape`
- **Methods:**
  - `calculateArea()` = side²
  - `calculatePerimeter()` = 4 * side

### `Sphere.java`
- **Implements:** `Shape`, `Volume`
- **Methods:**
  - `calculateArea()` = 4 * π * r²
  - `calculateVolume()` = (4/3) * π * r³

### `Cylinder.java`
- **Implements:** `Shape`, `Volume`
- **Methods:**
  - `calculateArea()` = 2 * π * r * (r + h)
  - `calculateVolume()` = π * r² * h

### `EquilateralPyramid.java`
- **Implements:** `Shape`, `Volume`
- **Methods:**
  - `calculateArea()` = Base area + Lateral area
  - `calculateVolume()` = (1/3) * baseSide² * height

### `ShapeCalculator.java`
- **Main Menu-Driven Program**
- Allows user to select a shape and enter dimensions.
- Calls appropriate methods to compute and display results.
- Uses `Scanner` to take user input.



