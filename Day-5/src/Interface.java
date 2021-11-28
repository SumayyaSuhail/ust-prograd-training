interface Buiscuits{
    void name();
    void flavors();
}
class Oreo implements Buiscuits{
    public void name(){
        System.out.println("Name: Oreo");
    }
    public void flavors(){
        System.out.println("Flavors: Chocolate, Vanilla");
    }
}
class HidenSeek implements Buiscuits{
    public void name(){
        System.out.println("Name: Hide 'n' Seek");
    }
    public void flavors(){
        System.out.println("Flavors: Chocolate");
    }
}
public class Interface {
    public static void main(String[] args) {
        Oreo oreo = new Oreo();
        HidenSeek hidenseek = new HidenSeek();
        oreo.name();
        oreo.flavors();
        hidenseek.name();
        hidenseek.flavors();
    }
}

