package LinkedList;

import java.util.LinkedList;

public class Stack {

    private LinkedList<Node> list;

    public Stack() {
        list = new LinkedList<Node>();
    }

    public void traverse() {

        if(isEmpty()) {
            System.out.println("Failed! List is empty.");
            return;
        }

        System.out.print("Traverse: ");

        for (Node node : list) {
            System.out.print(node.toString());
        }

        System.out.println();
    }

    public void push(int data) {

        Node node = new Node(data);
        System.out.print("Push: " + data);

        list.addFirst(node);

        System.out.println("\nDone!");


    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Failed! List is empty.");
            return;
        }

        System.out.println("Pop: " + list.getFirst().toString());
        list.removeFirst();

        System.out.println("Done!");
    }

    public void peek() {
        if(isEmpty()) {
            System.out.println("Failed! List is empty.");
            return;
        }

        System.out.println("Peek: " + list.peekFirst());
    }

    private boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }

        return false;
    }

    public void delete() {
        System.out.println("Delete: ");
        list.clear();
        System.out.println("Done!");
    }

 }
