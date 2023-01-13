package OOPs;

//POJO class

public class Point<x> {
    private double x, y;
    //Parameterized constructor
    public Point(double x, double y) {
        this.y = y;
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
    
}
