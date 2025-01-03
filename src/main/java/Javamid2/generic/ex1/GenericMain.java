package Javamid2.generic.ex1;

public class GenericMain {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>();
        integerGenericBox.set(10);
        Integer item = integerGenericBox.getItem();
        System.out.println(item);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("test");
        String item2 = stringGenericBox.getItem();
        System.out.println(item2);
    }
}
