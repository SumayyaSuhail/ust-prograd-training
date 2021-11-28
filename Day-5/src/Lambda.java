public class Lambda {
    public static void main(String[] args) {
        Addition addition=(int a, int b) -> {
            return a+b;
        };
        System.out.println(addition.add(3,2));
        Subtraction subtraction=(int a, int b) -> {
            return a-b;
        };
        System.out.println(subtraction.sub(3,2));
        Multiply multiply=(int a, int b)->{
            return a*b;
        };
        System.out.println(multiply.mul(3,2));
    }
}
interface Addition{
    public int add(int a, int b);
}
interface Subtraction{
    public int sub(int a, int b);
}
interface Multiply{
    public int mul(int a, int b);
}
