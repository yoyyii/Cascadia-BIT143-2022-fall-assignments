import java.lang.reflect.Array;

class Lecture14 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 14");
        // Yoyi Liao BIT143 fall 2022

        // Self-Check Problems:
        // Section 15.3: Advanced Features
        // 14. When this new version of the class fills to its capacity, it resizes.
        // How much does it grow? Why choose this growth rate, rather than increasing
        // the capacity by a single element or other constant amount?
            /*
             * it double the original size. It chose this growth rate so it allows us to store more elements
             * before we need to resize it again. If we only increase the capaciy by one, then we need to 
             * resize it and shift the element more often and it's a lot more work
             */


        // 15. What is the benefit of adding an iterator to the list class?
            // it provides a standard way of examining the elements of a collection


        // 16. What state does the array list iterator store?
            /*
             * The iterator keeps track of the list to examine, the current index in the list, 
             * and whether it is safe to remove an element from the list
             */


        // 17. How does the array list iterator know if there are more elements left to
        // examine?
        // What does it do if the client tries to examine a next element but there are
        // none left to examine?
            /*
             * the iterator compares the current index and the size of the array. There's more element left to
             * examine if the current index is less than the size of the array. It throws an exception when there's 
             * no more elements but the user still call next
             */


        // 18. What is a precondition of the iterator’s remove method?
        // How does the iterator enforce this precondition, and what does it do if the
        // precondition is violated?
            /*
             * the method next has been called before any other call to remove. The precondition is enforced 
             * by a boolean flag in the iterator whose value is changed on every call to next or remove. 
             * If the precondition is violated, an exception is thrown.
             */
            

        // 19. Write a method called sum that returns the sum of all values in the list.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.sum() should return 63. If the list is empty, sum should return
        // 0.
            ArrayIntList array = new ArrayIntList();
            array.add(11);
            array.add(-7);
            array.add(3);
            array.add(42);
            array.add(0);
            array.add(14);
            
            int sum = array.sum();
            System.out.println(sum);


        // 20. Write a method called average that returns the average of the values in
        // the list as a real number.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.average() should return 10.5. If the list is empty, average
        // should return 0.0.
            double average = array.average();
            System.out.println(average);


        // Section 15.4: ArrayList<E>
        // 21. What problem do we encounter when we try to construct an array of type E?
        // How do we resolve this problem?
            /*
             * Java does not allow the construction of arrays of generic types. We need to create an 
             * array of Object[] and cast it to type E[].
             */


        // 22. Since our list stores an unfilled array, the empty elements were filled
        // with the value 0 when our array was full of integers.
        // What value occupies the empty cells when our list stores values of type E?
            // null


        // 23. What changes need to be made to the indexOf method to search for objects
        // of type E in the new list class, and why are these changes necessary?
            // we need to use "equals" instead of "==" because == does not work for objects


        // 24. What is an annotation? How are annotations useful in writing our
        // ArrayList<E> class?
            /*
             * An annotation is a special directive to the compiler with additional information about a class, 
             * method, or other structure. It's useful because we can tell the compiler not to warn us 
             * about potentially unsafe casting operations.
             */


            // 25. Why is it important to set empty elements to null when we are clearing or
            // removing from the list of type E, when we didn’t need to clear out these
            // elements in the previous ArrayIntList?
                // so Java's garbage collector can potentially reclaim their memory


        // 26. What is one benefit of making the list iterator into an inner class?
            /*
             * it can directly access the fields of the enclosing list object, which makes it 
             * easier for the iterator to do its work without keeping track of as much state.
             */


        // Exercises:
        // None

    }
}

class ArrayIntList {
    private int size = 0;
    private int[] elementData = new int[6];


    public int sum() {
        if (size == 0) {
            return 0;
        }
        int total = 0; 

        for (int i = 0; i < size; i++) {
            total += elementData[i];
        }

        return total;
    }

    public void add(int num) {
        if (size < elementData.length) {
            elementData[size] = num;
            size++;
        }
    }

    public boolean isEmpty() { 
        return size == 0;
    }

    public double average() {
        if (isEmpty()) {
            return 0.0;
        } else {
            double avg = (double) sum() / size;
            return avg;
        }
    }
}
