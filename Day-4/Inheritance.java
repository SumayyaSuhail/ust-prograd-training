public class Inheritance {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.length=2;
        cuboid.breadth=3;
        cuboid.height=4;
        System.out.println(cuboid.area());
        System.out.println(cuboid.volume());
    }
}
class Rectangle {
    public double length, breadth;
    public double area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    public double height;
    public double volume(){
        return area()*height;
    }
}