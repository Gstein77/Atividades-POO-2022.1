package Q4;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area() {
        return this.radius*this.radius*3.1415;
    }
    
}
