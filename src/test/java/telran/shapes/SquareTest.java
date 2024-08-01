package telran.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test()
    void testPerimeter() {
        assertEquals(0, new Square(0).perimeter());
        assertEquals(40, new Square(10).perimeter());
        assertEquals(40, new Square(-10).perimeter());
    }

    @Test()
    void testSquare() {
        assertEquals(0, new Square(0).square());
        assertEquals(100, new Square(10).square());
        assertEquals(100, new Square(-10).square());
    }
}
