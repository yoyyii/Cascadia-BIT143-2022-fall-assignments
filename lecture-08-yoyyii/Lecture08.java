class Lecture08 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 08");
        // Yoyi Liao BIT143 fall 2022

        // SELF-CHECK PROBLEMS:
        // Section 13.1: Searching and Sorting in the Java Class Libraries
        // 3. Should you use a sequential or binary search on an array of Point objects,
        // and why?
            /*
             * sequential, since there is no natural ordering of Points that makes sense
             * in the general case. In order to perform binary search, the Point array needed 
             * to be sort first, which required us to create a separate comparator class 
             */


        // 4. Under what circumstances can the Arrays.binarySearch and
        // Collections.binarySearch methods be used successfully?
            /*
             * the array/list needed to be in the sorted order 
             */


        // 5. In what order does the Collections.sort method arrange a list of strings?
        // How could you arrange them into a different order?
            /*
             * the elements are in case-sensitive alphabetical ordering, with all the uppercase 
             * strings placed before the lowercase ones. By creating our own comparator, we could
             * arrange them into case-insensitive alphabetical ordering. 
             */


        // Section 13.2: Program Complexity
        // 9. Approximate the runtime of the following code fragment listed in Canvas
            //O(1)


        // 10. Approximate the runtime of the following code fragment listed in Canvas
            // O(N) 


        // 11. Approximate the runtime of the following code fragment listed in Canvas
            // O(N^2) + O(N)

        // Section 13.3: Implementing Searching and Sorting Algorithms
        // 16. What is the runtime complexity class of a sequential search on an
        // unsorted array?
        // What is the runtime complexity class of the modified sequential search on a
        // sorted array?
            /*
             * O(N) for both cases 
             */


        // 17. Why does the binary search algorithm require the input to be sorted?
            /*
             * In Binary Search, the array is repeatedly divided into two halves and the element 
             * is searched in that half whose last element is greater than or equal to the element 
             * being searched. If the input is not sorted, it can't perform the operation.
             */

        // 18. How many elements (at most) does a binary search examine if the array
        // contains 60 elements?
            // 5

        // 19. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input arrays?
        // What value will the binary search algorithm return?

        // A. int[] numbers = {1, 3, 6, 7, 8, 10, 15, 20, 30}; --> index: 4 return: 8 
        // B. int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10}; --> index: 4, 6 return: 8 
        // C. int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; --> index: 4, 6, 7 return: 8 
        // D. int[] numbers = {8, 9, 12, 14, 15, 17, 19, 25, 31}; --> index: 4, 2, 1, 0 return: 8

        // 20. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input array?
        // Notice that the input array isn’t in sorted order. What can you say about the
        // binary search algorithm’s result?

        // int[] numbers = {6, 5, 8, 19, 7, 35, 22, 11, 9};
            /*
             * It will examin 7 the first time, however, because the array is not sorted, the searching of 
             * target value won't be working as intended because noe the algorithm can't accureatly
             * eliminate the array to find the target
             */  


        // 23. What modifications would you have to make to the selectionSort method to
        // cause it to sort an array of double values rather than one of integer values?
            /*
             * The array type should be changed to doublr and a new swap method that accepts
             * double[] as the parameter will be needed. 
             */

        // 24. Consider the following array:

        // int[] numbers = {29, 17, 3, 94, 46, 8, –4, 12};
        // After a single pass of the selection sort algorithm (a single swap), what
        // would be the state of the array?

        // A. {–4, 29, 17, 3, 94, 46, 8, 12} --> –4, 3, 17, 29, 94, 46, 8, 12
        // B. {29, 17, 3, 94, 46, 8, 12} --> 3, 17, 29, 94, 46, 8, 12
        // C. {–4, 29, 17, 3, 94, 46, 8, –4, 12} --> –4, -4, 17, 3, 94, 46, 8, 29, 12
        // D. {–4, 17, 3, 94, 46, 8, 29, 12} --> –4, 3, 17, 94, 46, 8, 29, 12
        // E. {3, 17, 29, 94, –4, 8, 46, 12} --> -4, 17, 29, 94, 3, 8, 46, 12

        // 25. Trace the execution of the selection sort algorithm as shown in this
        // section when run on the following input arrays.
        // Show each element that will be selected by the algorithm and where it will be
        // moved, until the array is fully sorted.

        // A. {29, 17, 3, 94, 46, 8, –4, 12} 
            /*
             * --> -4, 17, 3, 94, 46, 8, 29, 12
             * --> -4, 3, 17, 94, 46, 8, 29, 12
             * --> -4, 3, 8, 94, 46, 17, 29, 12
             * --> -4, 3, 8, 12, 46, 17, 29, 94
             * --> -4, 3, 8, 12, 17, 46, 29, 94
             * --> -4, 3, 8, 12, 17, 29, 46, 94
             */

        // B. {33, 14, 3, 95, 47, 9, –42, 13}
            /*
             * --> -42, 14, 3, 95, 47, 9, 33, 13 
             * --> -42, 3, 14, 95, 47, 9, 33, 13
             * --> -42, 3, 9, 95, 47, 14, 33, 13
             * --> -42, 3, 9, 13, 47, 14, 33, 95
             * --> -42, 3, 9, 13, 14, 47, 33, 95
             * --> -42, 3, 9, 13, 14, 33, 47, 95
             */
            
        // C. {7, 1, 6, 12, –3, 8, 4, 21, 2, 30, –1, 9}
            /*
             * --> -3, 1, 6, 12, 7, 8, 4, 21, 2, 30, –1, 9
             * --> -3, -1, 6, 12, 7, 8, 4, 21, 2, 30, 1, 9
             * --> -3, -1, 1, 12, 7, 8, 4, 21, 2, 30, 6, 9
             * --> -3, -1, 1, 2, 7, 8, 4, 21, 12, 30, 6, 9
             * --> -3, -1, 1, 2, 4, 8, 7, 21, 12, 30, 6, 9
             * --> -3, -1, 1, 2, 4, 6, 7, 21, 12, 30, 8, 9
             * --> -3, -1, 1, 2, 4, 6, 7, 8, 12, 30, 21, 9
             * --> -3, -1, 1, 2, 4, 6, 7, 8, 9, 12, 21, 30
             */

        // D. {6, 7, 4, 8, 11, 1, 10, 3, 5, 9}
            /*
             * --> 1, 7, 4, 8, 11, 6, 10, 3, 5, 9
             * --> 1, 3, 4, 8, 11, 6, 10, 7, 5, 9
             * --> 1, 3, 4, 5, 11, 6, 10, 7, 8, 9
             * --> 1, 3, 4, 5, 6, 11, 10, 7, 8, 9
             * --> 1, 3, 4, 5, 6, 7, 10, 11, 8, 9
             * --> 1, 3, 4, 5, 6, 7, 8, 11, 10, 9
             * --> 1, 3, 4, 5, 6, 7, 8, 9, 10, 11
             */


        // Exercises: (no need to do it, 20 was removed)
        // 20. Write a recursive method called waysToClimb that takes a positive integer
        // value representing a number of stairs and prints each unique way to climb a
        // staircase of that height, taking strides of one or two stairs at a time.

        // EXERCISES:

        // Put your answer for #20 here:
        // (You may need to define other class(es) and method(s) elsewhere, but
        // make sure to check that your solution works by calling it from here)

        // (no #22)
        // Put your answer for #22 here:

        // no #23
        // Put your answer for #23 here:

    }
}
