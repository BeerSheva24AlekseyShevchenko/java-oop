package telran.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CanvasTest {
    @Test()
    void testPerimeter() {
        Canvas canvas = new Canvas();
        assertEquals(0, canvas.perimeter());
        canvas.addShape(new Rectangle(10, 20));
        canvas.addShape(new Square(10));
        assertEquals(100, canvas.perimeter());
    }

    @Test()
    void testSquare() {
        Canvas canvas = new Canvas();
        assertEquals(0, canvas.square());
        canvas.addShape(new Rectangle(10, 20));
        canvas.addShape(new Square(10));
        assertEquals(300, canvas.square());
    }

    @Test()
    void countTest() {
        Canvas innerCanvas = new Canvas();
        innerCanvas.addShape(new Square(10));
        innerCanvas.addShape(new Square(10));

        Canvas canvas = new Canvas();
        canvas.addShape(innerCanvas);
        canvas.addShape(new Square(10));
        canvas.addShape(new Rectangle(10, 20));

        assertEquals(5, canvas.count());
    }
}
