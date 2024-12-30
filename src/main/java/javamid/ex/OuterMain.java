package javamid.ex;

public class OuterMain {
    public static void main(String[] args) {
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
        OuterClassMain2.InnerClass innerClass = new OuterClassMain2.InnerClass();
        innerClass.hello();
        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.myMethod();
    }
}
