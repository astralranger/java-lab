

## File: `Shape.java`

### `Shape.java`
This abstract class serves as the base class for all shapes.

- **Class**: `Shape` (Abstract)
  - **Fields**:
    - `protected String shapeName`: Stores the name of the shape (e.g., "Circle").
  - **Constructor**: `Shape(String shapeName)`
    - **Purpose**: Initializes the shape with a name.
    - **Parameters**: `String shapeName` - The name of the shape.
  - **Abstract Methods**:
    - `void calculateArea()`: To be implemented by subclasses to compute the area.
    - `void calculatePerimeter()`: To be implemented by subclasses to compute the perimeter.
    - `void inputValues()`: To be implemented by subclasses to collect shape-specific input.

---

## File: `Volume.java`

### `Volume.java`
This interface defines a method for 3D shapes to calculate their volume.

- **Interface**: `Volume`
  - **Method**: `void calculateVolume()`
    - **Purpose**: Must be implemented by classes representing 3D shapes to compute their volume.

---

## File: `Circle.java`

### `Circle.java`
This class represents a 2D circle shape.

- **Class**: `Circle` (extends `Shape`)
  - **Fields**:
    - `private double radius`: The radius of the circle.
  - **Constructor**: `Circle()`
    - **Purpose**: Initializes the shape with the name "Circle".
  - **Method**: `inputValues()`
    - **Purpose**: Prompts the user to enter the radius.
    - **Implementation**: Uses `Scanner` to read the radius from the user.
  - **Method**: `calculateArea()`
    - **Purpose**: Calculates and prints the area of the circle (π * r²).
  - **Method**: `calculatePerimeter()`
    - **Purpose**: Calculates and prints the circumference (2 * π * r).

---

## File: `Rectangle.java`

### `Rectangle.java`
This class represents a 2D rectangle shape.

- **Class**: `Rectangle` (extends `Shape`)
  - **Fields**:
    - `private double length`: The length of the rectangle.
    - `private double width`: The width of the rectangle.
  - **Constructor**: `Rectangle()`
    - **Purpose**: Initializes the shape with the name "Rectangle".
  - **Method**: `inputValues()`
    - **Purpose**: Prompts the user to enter the length and width.
    - **Implementation**: Uses `Scanner` to read both values.
  - **Method**: `calculateArea()`
    - **Purpose**: Calculates and prints the area (length * width).
  - **Method**: `calculatePerimeter()`
    - **Purpose**: Calculates and prints the perimeter (2 * (length + width)).

---

## File: `Square.java`

### `Square.java`
This class represents a 2D square shape.

- **Class**: `Square` (extends `Shape`)
  - **Fields**:
    - `private double side`: The side length of the square.
  - **Constructor**: `Square()`
    - **Purpose**: Initializes the shape with the name "Square".
  - **Method**: `inputValues()`
    - **Purpose**: Prompts the user to enter the side length.
    - **Implementation**: Uses `Scanner` to read the side length.
  - **Method**: `calculateArea()`
    - **Purpose**: Calculates and prints the area (side²).
  - **Method**: `calculatePerimeter()`
    - **Purpose**: Calculates and prints the perimeter (4 * side).

---

## File: `Cylinder.java`

### `Cylinder.java`
This class represents a 3D cylinder shape.

- **Class**: `Cylinder` (extends `Shape`, implements `Volume`)
  - **Fields**:
    - `double radius`: The radius of the cylinder's base.
    - `double height`: The height of the cylinder.
  - **Constructor**: `Cylinder(double radius, double height)`
    - **Purpose**: Initializes the shape with the name "Cylinder" and given dimensions.
    - **Parameters**: `radius`, `height` - Dimensions of the cylinder.
  - **Method**: `calculateArea()`
    - **Purpose**: Calculates and prints the surface area (2 * π * r * (r + h)).
  - **Method**: `calculatePerimeter()`
    - **Purpose**: Indicates that a cylinder does not have a perimeter in the traditional sense.
  - **Method**: `calculateVolume()`
    - **Purpose**: Calculates and prints the volume (π * r² * h).

---

## File: `Sphere.java`

### `Sphere.java`
This class represents a 3D sphere shape.

- **Class**: `Sphere` (extends `Shape`, implements `Volume`)
  - **Fields**:
    - `private double radius`: The radius of the sphere.
  - **Constructor**: `Sphere()`
    - **Purpose**: Initializes the shape with the name "Sphere".
  - **Method**: `inputValues()`
    - **Purpose**: Prompts the user to enter the radius.
    - **Implementation**: Uses `Scanner` to read the radius.
  - **Method**: `calculateArea()`
    - **Purpose**: Calculates and prints the surface area (4 * π * r²).
  - **Method**: `calculatePerimeter()`
    - **Purpose**: Indicates that a sphere has no perimeter.
  - **Method**: `calculateVolume()`
    - **Purpose**: Calculates and prints the volume (4/3 * π * r³).

---

## File: `EquilateralPyramid.java`

### `EquilateralPyramid.java`
This class represents a 3D equilateral pyramid (tetrahedron-like with a square base).

- **Class**: `EquilateralPyramid` (extends `Shape`, implements `Volume`)
  - **Fields**:
    - `private double base`: The length of the base square.
    - `private double height`: The height of the pyramid.
  - **Constructor**: `EquilateralPyramid()`
    - **Purpose**: Initializes the shape with the name "Equilateral Pyramid".
  - **Method**: `inputValues()`
    - **Purpose**: Prompts the user to enter the base length and height.
    - **Implementation**: Uses `Scanner` to read both values.
  - **Method**: `calculateArea()`
    - **Purpose**: Calculates and prints the surface area (base area + lateral area).
    - **Implementation**: Base area = base²; lateral area uses the slant height formula.
  - **Method**: `calculatePerimeter()`
    - **Purpose**: Calculates and prints the perimeter of the base (4 * base).
  - **Method**: `calculateVolume()`
    - **Purpose**: Calculates and prints the volume (1/3 * base² * height).

---

## File: `ShapeCalculator.java`

### `ShapeCalculator.java`
This class serves as the main entry point, providing a menu-driven interface to interact with shapes.

- **Class**: `ShapeCalculator`
  - **Method**: `main(String[] args)`
    - **Purpose**: Executes a loop displaying a menu and processing user input to calculate shape properties.
    - **Implementation**: 
      - Uses a `Scanner` for input.
      - Displays a menu with 7 options:
        1. Circle
        2. Rectangle
        3. Square
        4. Sphere
        5. Cylinder
        6. Equilateral Pyramid
        7. Exit
      - Creates appropriate `Shape` or `Volume` objects based on user choice.
      - Calls `inputValues()`, `calculateArea()`, `calculatePerimeter()`, and (if applicable) `calculateVolume()`.
      - Loops until the user selects option 7 (Exit).
    - **Additional Notes**: Includes student information (name, ID, batch) as comments.

---


The program uses `Scanner` for user input and `Math.PI` for precise calculations, making it a robust tool for shape computations.
