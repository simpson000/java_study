import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (true){
            System.out.println("Enter number (exit: end)");
            int input = sc.nextInt();
            if (input == 0) {
                System.out.println("exit: end: " + result);
                break;
            }
            System.out.println(input);
            result += input;

        }



    }
}
