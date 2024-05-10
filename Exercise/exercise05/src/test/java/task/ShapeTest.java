package task;

import org.junit.jupiter.api.Assertions;



public class ShapeTest {
    @org.junit.jupiter.api.Test
    public void testCircle() {
        Circle circle = new Circle(5);
        Assertions.assertEquals(78.54, circle.calculateArea(), 0.01);
        Assertions.assertEquals(31.42, circle.calculateScope(), 0.01);
    }

    @org.junit.jupiter.api.Test
    public void testSquare() {
        Square square = new Square(4);
        Assertions.assertEquals(16.0, square.calculateArea(), 0.01);
        Assertions.assertEquals(16.0, square.calculateScope(), 0.01);
    }

    @org.junit.jupiter.api.Test
    public void testTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assertions.assertEquals(6.0, triangle.calculateArea(), 0.01);
        Assertions.assertEquals(12.0, triangle.calculateScope(), 0.01);
    }
}