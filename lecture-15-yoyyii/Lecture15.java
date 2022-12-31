import java.util.*;
// Yoyi Liao fall 2022 BIT143
class Lecture15 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 15");

        // NOTE NOTE NOTE
        // Several problems ask you to draw pictures / images. Here are some ideas for
        // how to do that:
        //
        // Some ideas for how to draw the images:
        // * Draw this out on paper, snap a picture with your phone
        //
        // * Capture a screenshot and then draw on it using MS Paint or MacOS Image
        // Preview, etc
        // (You'll need to Google for how to take the screenshot - it's not hard once
        // you know how, it's just well-hidden)
        //
        // * Use diagram-making software. You can find free online websites that let you
        // do this on the website
        //
        // * If you find other ways please do share! Especially if they're quick and
        // easy! :)

        //
        //
        // Some ideas for how to add the images to this repo:
        //
        // * Add the image files directly to the repo (in which case please name the
        // files
        // Question 5.png, or Answer 6.gif, or 7.jpeg, or whatever)
        //
        // * Embedding them in a Word /.DOC/.DOCX file
        //
        // * Embed them into a .PDF file (this is good for MacOS people - you can create
        // a .pages file, then export to .PDF)
        // (I can't open .pages files reliably on Windows)

        //
        // DO NOT DO THE FOLLOWING:
        //
        // * Do NOT upload to Google Drive / Dropbox / etc and then hand in a link.
        // I want to have copies of the work that you've done even after the quarter
        // ends

        //
        //
        //
        // Self-Check Problems:
        // Section 16.1: Working with Nodes

        // 1. What is the difference between a linked list and an array list? How are
        // they similar?
            /*
             * ArrayList stores all its elements in a inner large array while LinkedList stores it
             * in nodes that are connected to each other by refferences. This made LinkedList not as easy
             * to pop around but easier to add a new element in the middle. Both kind of lists implement same 
             * external operation such as adding and locating elements.
             */


        // 2. What is the difference between a linked node and a linked list? How are
        // they related and connected?
            /*
             * a linked node reference to the object that stores a single elements, while linked list reference 
             * to the storing reference of nodes. The nodes created a chain that connect to other elements
             * of the list
             */


        // 3. What value is stored as the next field of the last node of a list? What
        // value will a node’s next field have if none is specified?
            // null


        // 4. What happens if you or the client try to go past the last element in a
        // linked list? Be specific.
            // java will throw a null pointer exception


        // QUESTIONS 5- 17:
        // Please put these into a separate file(s), as described in this file above

        
        // Section 16.2: A Linked List Class
        // 18. What are the two ways to change the contents of a linked list?
            // change the front reference or the next data field of an existing node.


        // 19. An element can be inserted at or removed from the beginning, middle, or
        // end of a linked list.
        // Which of the three locations is the most computationally expensive, and why?
        // How does this compare against the result for an array list?
            /*
             * the end will be most expensive as it has to traverse through the entire list to reach to the end.
             * This is different than ArrayList where it'll less expensive to modify toward the end of the list. 
             */


        // 20. When you add or remove the element found at index i of a list, you must
        // create a temporary current node reference and advance it through the list.
        // At which index’s node should the loop stop, relative to i?
            // i - 1, so we can adjust the node's next reference to the element we want to modify. 


        // 21. In an array list, it is possible to overrun the capacity of the array, at
        // which point the list must be resized to fit.
        // Is resizing necessary on a linked list? What limits the number of elements
        // that a linked list can have?
            /*
             * linkedlist don't need resizing since it's connected by each individual nodes. The only limit 
             * on the number of elements is the amount of memory available.
             */


        // QUESTIONS 21-24:
        // Please put these into a separate file(s), as described in this file above

        // Exercises:
        // None

    }
}
