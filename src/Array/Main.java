package Array;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(10);

        stack.traverse();

        stack.push(10);

        stack.traverse();

        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);

        stack.traverse();

        stack.push(110);

        stack.peek();

        stack.pop();

        stack.traverse();

        stack.peek();

        stack.push(120);

        stack.traverse();

        stack.pop();

        stack.traverse();

        stack.delete();

        stack.traverse();

        stack.push(130);

        stack.pop();

        stack.peek();



    }
}
