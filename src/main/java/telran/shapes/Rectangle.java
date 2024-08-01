package telran.shapes;

public class Rectangle implements Shape {
    private int width;
    private int hight;

    public Rectangle (int width, int hight) {
        this.width = Math.abs(width);
        this.hight = Math.abs(hight);
    }

    @Override
    public int perimeter() {
        return (width + hight) * 2;
    }

    @Override
    public int square() {
        return width * hight;
    }

}
