class Lecture11 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 11");
        // Yoyi Liao BIT143 fall 2022

        // Self-Check Problems:
        // Section 13.4: Case Study: Implementing Merge Sort

        // 30. Trace the complete execution of the merge sort algorithm when called on
        // each array below.
        // Show the sub-arrays that are created by the algorithm and show the merging of
        // sub-arrays into larger sorted arrays.

        // A. {29, 17, 3, 94, 46, 8, –4, 12}
            /* [29, 17, 3, 94], [46, 8, -4, 12]
             * [29, 17], [3, 94], [46, 8], [-4, 12]
             * [29], [17], [3], [94], [46], [8], [-4], [12]
             * [17, 29], [3, 94], [8, 46], [-4, 12]
             * [3, 17, 29, 94], [-4, 8, 12, 46]
             * [-4, 3, 8, 12, 17, 29, 46, 94]
             */

        // B. {6, 5, 3, 7, 1, 8, 4, 2}
            /*
             * [6, 5, 3, 7], [1, 8, 4, 2]
             * [6, 5], [3, 7], [1, 8], [4, 2]
             * [6], [5], [3], [7], [1], [8], [4], [2]
             * [5, 6], [3, 7], [1, 8], [2, 4]
             * [3, 5, 6, 7], [1, 2, 4, 8]
             * [1, 2, 3, 4, 5, 6, 7, 8]
             */

        // C. {33, 14, 3, 95, 47, 9, –42, 13}
            /*
             * [33, 14, 3, 95], [47, 9, -42, 13]
             * [33, 14], [3, 95], [47, 9], [-42, 13]
             * [33], [14], [3], [95], [47], [9], [-42], [13]
             * [14, 33], [3, 95], [9, 47], [-42, 13]
             * [14, 33], [3, 95], [9, 47], [-42, 13]
             * [3, 14, 33, 95], [-42, 9, 13, 47]
             * [-42, 3, 9, 13, 14, 33, 47, 95]
             */


        // Exercises:

        // 11. Using the following arrays, trace the complete execution of the merge
        // sort algorithm when called on each array.
        // Show the subarrays that are created by the algorithm and show the merging of
        // subarrays into larger sorted arrays.

        // A. int[] numbers3 = {8, 5, –9, 14, 0, –1, –7, 3};
            /*
             * [8, 5, –9, 14], [0, –1, –7, 3]
             * [8, 5], [–9, 14], [0, –1], [–7, 3]
             * [8], [5], [-9], [14], [0], [-1], [-7], [3]
             * [5, 8], [-9, 14], [-1, 0], [-7, 3]
             * [-9, 5, 8, 14], [-7, -1, 0, 3]
             * [-9, -7, -1, 0, 3, 5, 8, 14]
             */

        // B. int[] numbers4 = {15, 56, 24, 5, 39, –4, 27, 10};
            /*
             * [15, 56, 24, 5], [39, –4, 27, 10]
             * [15, 56], [24, 5], [39, -4], [27, 10]
             * [15], [56], [24], [5], [39], [-4], [27], [10]
             * [15, 56], [5,24], [-4, 39], [10, 27]
             * [5, 15, 24, 56], [-4, 10, 27, 39]
             * [-4, 5, 10, 15, 24, 27, 39, 56]
             */


        // 13. Using the following arrays, trace the complete execution of the merge
        // sort algorithm when called on each array.
        // Show the subarrays that are created by the algorithm and show the merging of
        // subarrays into larger sorted arrays.

        // A. int[] numbers5 = {22, 44, 11, 88, 66, 33, 55, 77};
            /*
             * [22, 44, 11, 88], [66, 33, 55, 77]
             * [22, 44], [11, 88], [66, 33], [55, 77]
             * [22], [44], [11], [88], [66], [33], [55], [77]
             * [22, 44], [11, 88], [33, 66], [55, 77]
             * [22, 11, 44, 88], [33, 55, 66, 77]
             * [22, 11, 44, 88], [33, 55, 66, 77]
             * [11, 22, 33, 44, 55, 66, 77, 88]
             */

        // B. int[] numbers6 = {–3, -6, -1, -5, 0, -2, -4, -7};
            /*
             * [–3, -6, -1, -5], [0, -2, -4, -7]
             * [–3, -6], [-1, -5], [0, -2], [-4, -7]
             * [–3], [-6], [-1], [-5], [0], [-2], [-4], [-7]
             * [–6, -3], [-1, -5], [-2, 0], [-7, -4]
             * [–6, -5, -3, -1], [-7, -4, -2, 0]
             * [-7, –6, -5, -4, -3, -2, -1, 0]
             */
    }
}
