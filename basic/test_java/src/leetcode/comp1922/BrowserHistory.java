package leetcode.comp1922;

import java.util.Stack;

public class BrowserHistory {

    Stack<String> backward;
    Stack<String> forward;

    public BrowserHistory(String homepage) {
        backward = new Stack<>();
        forward = new Stack<>();
        forward.push(homepage);
    }

    public void visit(String url) {
        forward.push(url);
        backward = new Stack<>();
    }

    public String forward(int steps) {
        String back = forward.peek();
        while (forward.size() > 0 && steps > 0) {
            back = forward.pop();
            backward.push(back);
            steps--;
        }
        return back;

    }

    public String back(int steps) {
        String back = backward.peek();
        while (backward.size() > 0 && steps > 0) {
            back = backward.pop();
            forward.push(back);
            steps--;
        }
        return back;
    }
}