package task;

public class Square extends AbstractShape
{
    double side;

    public Square(int side)
    {
        this.side = side;

    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculateScope()
    {
        return 4 * side;
    }

    @Override
    public String describe() {
        return "This is a square if side: " + side;
    }

}
