package Javamid2.collection.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistyory {

    private Deque<String> browserHistory = new ArrayDeque<String>();

    public void visitPage(String s) {
        browserHistory.push(s);
        System.out.println("방문: " + s);
    }

    public String goBack() {
        return browserHistory.pop();

    }
}
