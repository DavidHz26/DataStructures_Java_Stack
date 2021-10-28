package Array;

import java.util.Arrays;

public class Stack {

    private int[] array;
    private int topOfStack;

    public Stack(int arraySize) {
        array = new int[arraySize];
        topOfStack = -1;

        Arrays.fill(array, -1);
    }

    public void traverse() {
        try {
            for (int i : array) {
                System.out.print("[" + i + "] ");
            }

            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("Failed! Stack does not exist.");
        }
    }

     boolean isFull() {
        if(topOfStack == array.length - 1) {
            return true;
        }

        return false;
    }

    boolean isEmpty() {
        if(topOfStack == -1) {
            return true;
        }

        return false;
    }

    public void push(int value) {
        try {
            if (isFull()) {
                System.out.println("Failed! Stack is full.");
                return;
            }

            array[++topOfStack] = value;

            System.out.println(topOfStack);
        } catch (NullPointerException e) {
            System.out.println("Failed! Stack does not exist.");
        }
    }

    public void pop() {
        try {
            if (isEmpty()) {
                System.out.println("Failed! List is empty");
                return;
            }

            array[topOfStack] = -1;
            topOfStack--;
        } catch (NullPointerException e) {
            System.out.println("Failed! Stack does not exist.");
        }
    }

    public void peek() {
        try {
            if (isEmpty()) {
                System.out.println("Failed! List is empty");
                return;
            }

            System.out.println(array[topOfStack]);
        } catch (NullPointerException e) {
            System.out.println("Failed! Stack does not exist.");
        }
    }

    public void delete() {
        array = null;
        System.out.println("Deleted");
    }




}
