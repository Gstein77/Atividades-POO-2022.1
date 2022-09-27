package Q2;

public class Rectangle {
    public double width;
    public double height;

    public Object area() {
        return width*height;
    }
    public Object perimeter() {
        return width*2+height*2;
    }
    public Object diagonal() {
        return Math.sqrt(width*width+height*height);
    }
    
}
