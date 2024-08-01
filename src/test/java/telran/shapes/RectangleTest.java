package telran.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test()
    void testPerimeter() {
        assertEquals(0, new Rectangle(0, 0).perimeter());
        assertEquals(60, new Rectangle(10, 20).perimeter());
        assertEquals(60, new Rectangle(-10, 20).perimeter());
    }

    @Test()
    void testSquare() {
        assertEquals(0, new Rectangle(0, 0).square());
        assertEquals(200, new Rectangle(10, 20).square());
        assertEquals(200, new Rectangle(-10, 20).square());

    }
}
