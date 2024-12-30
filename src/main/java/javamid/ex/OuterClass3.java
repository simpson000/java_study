package javamid.ex;

public class OuterClass3 {
    public void myMethod(){
        class LocalClass {
            public void myMethod() {
                System.out.println("LocalClass.myMethod");
            }
        }
        LocalClass local = new LocalClass();
        local.myMethod();
    }
}
