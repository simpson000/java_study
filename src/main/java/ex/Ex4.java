package ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age (or type 'exit' to quit):");

        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            if (name.equals("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.print("Age: ");
            try {
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Name: " + name + ", Age: " + age);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid age!");
                continue;
            }
        }

        sc.close();
    }
}