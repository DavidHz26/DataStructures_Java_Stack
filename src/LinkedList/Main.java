package LinkedList;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.traverse();

        stack.pop();
        stack.pop();
        stack.pop();

        stack.traverse();

        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.traverse();

        stack.peek();
        stack.pop();
        stack.peek();

        stack.delete();

        stack.traverse();
    }


}
