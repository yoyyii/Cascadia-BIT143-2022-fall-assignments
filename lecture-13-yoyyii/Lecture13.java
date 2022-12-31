import java.util.*;
class Lecture13 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 13");
        // Yoyi Liao BIT143 fall 2022

        // Self-Check Problems:
        // Section 15.1: Simple ArrayIntList

        // 1. What is the difference between an array list’s size and its capacity?
        // What is the relationship between the two values? (Is one always larger or
        // smaller than the other, for instance?)
            /*
             * An array list's size is the number of elements that have been added to it. 
             * Its capacity is the length of its internal array. The size is always less than or 
             * equal to the capacity.
             */


        // 2. What fields must be included in the ArrayIntList class, and why is each
        // field important? Would the class still work correctly if we removed any of
        // these fields?
            /*
             * The ArrayIntList class keeps at least two fields: an array of elements and a size. 
             * The array is necessary because it is where we store the data inside the collection. 
             * The size is necessary because some of the elements at the end of the array may not 
             * be meaningful values. If we removed the size field, we would not know how many elements 
             * were meaningful.
             */


        // 3. Why does the list class use a toString method rather than a print method?
            /*
             * We use a toString method because this is the standard way of printing objects in Java. 
             * Also, it can print the text representation of the list to any target.
             */

             
        // 4. We wrote the class to have public methods called size (to read the number
        // of elements of the list) and get (to access the element value at a specific
        // index).
        // Why is this approach better than declaring the fields (such as size) public?
            // because it improves the cleanliness and allow us to change the implement if we want
             

        // 7. An element can be inserted at the beginning, middle, or end of an array
        // list.
        // Which of the three insertion points is the most computationally expensive,
        // and why? Which is the most expensive location to remove an element from the
        // list?
            /*
             * most expensive insertion points: the beginning because it requires the shifting of the 
             * entire array to the right. 
             * most expensive removal points: still the beginning because it requires the shifting of the 
             * entire array to the left
             */


        // 8. Write methods called min and max that return the smallest and largest
        // values in the list respectively.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.min() should return –7 and the call of list.max() should return
        // 42. If the list is empty, the methods should throw an IllegalStateException.

        ArrayList<Integer> list = new ArrayList<>(List.of(11, -7, 3, 42, 0, 14));
        int min = min(list);
        System.out.println(min);

        int max = max(list);
        System.out.println(max);


        // Section 15.2: A More Complete ArrayIntList

        // 9. Describe the overall preconditions placed on the list class in this
        // section.
        // What assumptions do we make about how clients will use the list?
            /*
             * a list can't have negative capacity, and the index passed in can't be negative or outside 
             * the size of the list.
             */


        // 10. What is the purpose of the checkIndex method?
        // Where is it called in the list class? Describe a way that the client can
        // utilize an ArrayIntList that will be caught by checkIndex.
            /*
             * it will tests whether a given index is between 0 and the size of the list. It will throws an 
             * exception if it's not between it. If the client passes an invalid index, the method will 
             * stop the program from executing.
             */


        // 11. What is the purpose of the checkCapacity method?
        // Where is it called in the list class? Describe a way that the client can
        // utilize an ArrayIntList that will be caught by checkCapacity.
            /*
             * tests whether the array's size will be greater than the length of the internal array (capacity). If so, 
             * throws an exception. If the client adds too many elements to the list, the method will stop the 
             * program from executing
             */


        // 12. Once we check thoroughly for preconditions in the code, what data
        // invariants can we now assume about the list?
            /*
             * the size of the list is smaller than or equal to the list's capacity. Once the index parameters 
             * passed the checkIndex test, they are valid to passed to other methods.
             */


        // 13. Why do we bother to add the contains, isEmpty, and remove methods to the
        // list class, when the client can already perform this same functionality with
        // the indexOf, size, and remove methods, respectively?
            // cause it's more convient to use and easier to write and understand the code 
            

        // Exercises:
        // None
    }
    public static int min(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException();
        } else {
            int min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                min = Math.min(min, list.get(i));
            }
            return min;
        }
    }

    public static int max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException();
        } else {
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                max = Math.max(max, list.get(i));
            }
            return max;
        }
    }

}
