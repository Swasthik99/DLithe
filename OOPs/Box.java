package OOPs;

public class Box {
    //dimensions of the Box
    double width, height, depth;
    //parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double volume(){
        return width * height *depth;
    }
    }   
    
