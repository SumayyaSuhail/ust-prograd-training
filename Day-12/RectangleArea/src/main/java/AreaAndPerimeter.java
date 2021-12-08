public class AreaAndPerimeter {
    private double length, breadth, side;
    public AreaAndPerimeter(double length, double breadth){
        setLength(length);
        setBreadth(breadth);
    }
    public AreaAndPerimeter(double side){
        setSide(side);
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0) {
            this.length = length;
        }
        else{
            throw new IllegalArgumentException("Length should be greater than zero");
        }
    }

    public double getBreadth() { return breadth;}

    public void setBreadth(double breadth) {
        if(breadth>0) {
            this.breadth = breadth;
        }
        else{
            throw new IllegalArgumentException("Breadth should be greater than zero");
        }
    }
    public double getSide(){return side;}
    public void setSide(double side){
        if(side>0){
            this.side=side;
        }
        else{
            throw new IllegalArgumentException("Side of a square should be greater than zero");
        }
    }

    public double areaOfRectangle()  {
        return getLength() * getBreadth();
    }
    public double perimeterOfRectangle(){
        return 2*(getLength() + getBreadth());
    }
    public double areaOfSquare(){
        return getSide()*getSide();
    }
    public double perimeterOfSquare(){
        return 4*getSide();
    }
}
