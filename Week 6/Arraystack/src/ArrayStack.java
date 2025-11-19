public class ArrayStack
{
    static int[] stack = new int[5];
    static int top = -1;

    public static void main(String[] args)
    {
        // Push elements
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        // Peek top element
        System.out.println("Top element: " + peek());

        // Pop one element
        System.out.println("Popped element: " + pop());

        // Current size
        System.out.println("Stack size: " + size());
    }

    // Push operation
    static void push(int value) {
        if (top < stack.length - 1) {
            stack[++top] = value;
        }
        else
        {
            System.out.println("Stack is full!");
        }
    }

    // Pop operation
    static int pop()
    {
        if (top >= 0)
        {
            return stack[top--];
        } else
        {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    // Peek operation
    static int peek()
    {
        if (top >= 0)
        {
            return stack[top];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    // Size operation
    static int size()
    {
        return top + 1;
    }
}