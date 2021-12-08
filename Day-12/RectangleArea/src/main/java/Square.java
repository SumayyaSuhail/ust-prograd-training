public class Square {
    private double length, breadth, side;
    public Square(double side){
        setSide(side);
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
    public double area(){
        return getSide()*getSide();
    }
    public double perimeter(){
        return 4*getSide();
    }
}
