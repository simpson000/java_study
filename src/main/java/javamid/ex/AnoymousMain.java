package javamid.ex;

public class AnoymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        hello.hello();
    }
}
