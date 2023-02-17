public class CharStack {
    // CLASS DEFINES A STACK OF CHARACTERS

    // Class member variables
    private char[] stack;
    private int top;
    private int size;

    // Constructor
    public CharStack(int size) {
        this.size = size;
        stack = new char[size];
        top = -1;// top is the index of the top element in the stack
    }

    // Methods
    /**
     * Checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * Checks if the stack is full
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return (top == size - 1);
    }

    /**
     * Pushes a character onto the stack
     * @param c character to be pushed onto the stack
     */
    public void push(char c) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            stack[top] = c;
        }
    }

    /**
     * Pops a character off the stack
     * @return character popped off the stack
     */
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return ' ';
        } else {
            char c = stack[top];
            top--;
            return c;
        }
    }


    
}