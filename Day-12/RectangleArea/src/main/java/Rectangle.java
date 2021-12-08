public class Rectangle {
    private double length, breadth;
    public Rectangle(double length, double breadth){
        setLength(length);
        setBreadth(breadth);
    }
    public Rectangle(){
        setLength(length);
        setBreadth(breadth);
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

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        if(breadth>0) {
            this.breadth = breadth;
        }
        else{
            throw new IllegalArgumentException("Breadth should be greater than zero");
        }
    }

    public double area()  {
        return length * breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
