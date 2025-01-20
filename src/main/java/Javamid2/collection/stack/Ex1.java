package Javamid2.collection.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex1 {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        stack.push("yahoo.com");
        stack.push("google.com");
        stack.push("facebook.com");
        for (String s : stack) {
            System.out.println(stack.pop());
        }

    }
}
