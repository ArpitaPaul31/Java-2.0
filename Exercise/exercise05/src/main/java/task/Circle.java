package task;

public class Circle extends AbstractShape
{
    double radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }
    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateScope()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String describe() {
        return "This is a circle of Radius " + radius;
    }
}


