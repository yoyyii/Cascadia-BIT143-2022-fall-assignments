import java.util.*;
class Lecture12 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 12");
        // Yoyi Liao BIT142 fall 2022

        // Self-Check Problems:
        // Section 14.1: Stack/Queue Basics

        // 1. Which of the following statements about stacks and queues is true?

        // A. Stacks and queues can store only integers as their data.
        // B. A stack returns elements in the same order as they were added (first-in,
        // first-out).
        // C. A queue’s remove method removes and returns the element at the front of
        // the
        // queue.
        // D. Stacks and queues are similar to lists, but less efficient.
        // E. The peek method allows access to the element at the bottom of a stack.

        //ans: C 


        // 2. What is a real-world example of data that could be modeled using a stack?
        // Using a queue?
            // stack example: the plates in a cafeteria 
            // queue example: waiting in line in the drive-through lane


        // 3. When you call push on a stack, where is the new element placed relative to
        // the other elements in the stack?
        // When you call pop, which element from the stack is returned?
            /*
             * When you push onto a stack, the new element is added to the top. 
             * When you pop from a stack, the top element is removed and returned.
             */


        // 4. When you call add on a queue, where is the new element placed relative to
        // the other elements in the queue?
        // When you call remove, which element from the queue is returned?
            /*
             * When you add to a queue, the new element is added to the back. 
             * When you remove from a queue, the front element is removed and returned.
             */


        // 5. If you create a new empty stack and push the values 1, 2, and 3 in that
        // order, and call pop on the stack once, what value will be returned?
            // 3

            
        // 6. If you create a new empty queue and add the values 1, 2, and 3 in that
        // order, and call remove on the queue once, what value will be returned?
            // 1


        // Section 14.2: Common Stack/Queue Operations

        // 12. Stacks and queues have less functionality than other similar collections
        // like lists and maps.
        // Why are they still useful despite lacking functionality? What possible
        // advantages are there of using a less powerful collection?
            // because they are more efficient to execute and operate for their task. They're also easier to use.


        // 13. What is the output of the following code?
        // Do this by hand to make sure that you understand stacks and queues
            // you, are, how


        // 14. What is the output of the following code?
        // Do this by hand to make sure that you understand stacks and queues
            /*
             * 10
             * 7
             * 5
             * false
             * 2
             * 3
             * 8
             * 3
             */

        // 22. Write a piece of code that prints the elements of a queue of integers,
        // one per line.
        // When your code is done running, the queue should still contain the same
        // contents as it had at the start. In other words, don’t destroy the queue as
        // you print it. If you like, put your code into a method called print that
        // accepts the queue as a parameter.

        Queue<Integer> queue = new LinkedList<Integer>(List.of(1, 2, 3, 4, 5));
        for (int i = 0; i < queue.size(); i++) {
            int n = queue.remove();
            System.out.println(n);
            queue.add(n);
        }


        // 23. Write a piece of code that finds and prints the longest string in a stack
        // of strings.

        // For example, in the stack [hello, hi, goodbye, howdy], the longest string is
        // "goodbye". When your code is done running, the stack should still contain the
        // same contents as it had at the start. In other words, if you destroy the
        // stack as you examine it, restore its state afterward. If you like, put your
        // code into a method called printLongest that accepts the stack as a parameter.

        Stack<String> s = new Stack<String>();
        s.push("hello");
        s.push("hi");
        s.push("goodbye");
        s.push("howdy");
        
        Stack<String> backup = new Stack<String>();
        String longest = s.pop();
        backup.push(longest);
        while (!s.isEmpty()) {
            String pop = s.pop();
            if (pop.length() > longest.length()) {
                longest = pop;
            }
            backup.push(pop);
        }
        System.out.println(longest);

        while (!backup.isEmpty()) {   
            s.push(backup.pop());
        }


        // Exercises:

        // None

    }
}
