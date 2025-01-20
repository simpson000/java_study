package Javamid2.collection.stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class Ex3 {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();
        q.offer("doc1");
        q.offer("doc2");
        q.offer("doc3");
        System.out.println("출력: "+q.poll());
        System.out.println("출력: "+q.poll());
        System.out.println("출력: "+q.poll());
    }
}
