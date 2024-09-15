import java.util.ArrayList;

public class stack {
    private ArrayList<Integer> stack;

    // Default constructor to initialize the stack
    public Stack() {
        stack = new ArrayList<>();
    }

    // Method to push an integer onto the stack
    public void push(int value) {
        stack.add(value);
    }

    // Method to pop an integer from the stack
    // Throws an exception if the stack is empty
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    // Method to traverse and print the elements of the stack
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Method to get the size of the stack
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push some values onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Traverse and print the stack
        stack.traverse();

        // Pop a value from the stack
        System.out.println("Popped value: " + stack.pop());

        // Traverse and print the stack again
        stack.traverse();
    }
}
