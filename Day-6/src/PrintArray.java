public class PrintArray {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        String[] strArray = {"Hai","Hello","Bye"};
        Display<Integer> display = new Display<Integer>();
        Display<String> display1=new Display<String>();
        display.printArray(intArray);
        display1.printArray(strArray);
    }
}
class Display<T>{
    public void printArray(T[] array){
        Object[] newArray = new Object[array.length];
        for (int i = 0; i <array.length ; i++) {
            newArray[i]=array[array.length-i-1];
        }
        for (int i = 0; i <newArray.length ; i++) {
            System.out.println(newArray[i]);
        }
    }
}