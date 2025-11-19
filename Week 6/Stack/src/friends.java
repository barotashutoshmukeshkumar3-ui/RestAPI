import java.util.*;
public class friends
{
    public static void main(String[] args)
    {
        // Creating a Stack
        Stack<String> myFriends = new Stack<>();
        // Pushing new items to the Stack
        myFriends.push("Rashmi");
        myFriends.push("Navya");
        myFriends.push("Zia");
        myFriends.push("Nikki");
        myFriends.push("Madhumitha");
        System.out.println("Stack => " + myFriends);
        System.out.println();
        // Popping items from the Stack
        String friendAtTop = myFriends.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + friendAtTop);
        System.out.println("Current Stack => " + myFriends);
        System.out.println();
        // Get the item at the top of the stack without removing it
        friendAtTop = myFriends.peek();
        System.out.println("Stack.peek() => " + friendAtTop);
        System.out.println("Current Stack => " + myFriends);
    }
}