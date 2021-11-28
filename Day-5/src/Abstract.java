abstract class Fruits{
    abstract void color();
    abstract void name();
    void show(){
        System.out.println("I am a fruit!");
    }
}
class Apple extends Fruits{
    public void color() {
        System.out.println("color: red");
    }
    public void name() {
        System.out.println("name : Apple");
    }
}
class Orange extends Fruits{
    public void color() {
        System.out.println("color: Orange");
    }
    public void name() {
        System.out.println("name : Orange");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Fruits apple = new Apple();
        Fruits orange = new Orange();
        apple.show();
        apple.name();
        apple.color();
        orange.name();
        orange.color();
    }
}
