package lesson4;

import java.util.Stack;

/* Задание 2
https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class Task2 {
    public static void main(String[] args) {
        //Test cases
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);

        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}

class MyQueue {
    private final Stack<Integer> in;
    private final Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            moveFromInToOut();
        }

        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            moveFromInToOut();
        }

        return out.peek();
    }

    private void moveFromInToOut() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
