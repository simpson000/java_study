package javamid.hello;

public class Hello {
        public static void hello(String subject) {
            System.out.println("프로그램 시작");
            System.out.println("Hello "+subject);
            System.out.println("프로그램 종료");
        }

        public static void main(String[] args) {
            hello("java");
            hello("spring");

        }

}
