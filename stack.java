public class stack {
    private int[] stackArray;
    private int top;
    private int maxSize;
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; 
    }
    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack overflow. Cannot push " + value);
            return;
        }
        stackArray[++top] = value; 
    }
    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow. No element to pop.");
            return -1; 
        }
        return stackArray[top--];
    }
    public void traverse() {
        if (top < 0) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.traverse();  
        System.out.println("Popped element: " + stack.pop()); 
        stack.traverse();
    }
}