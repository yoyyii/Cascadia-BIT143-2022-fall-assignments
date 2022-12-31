class Lecture06 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 06");
        //Yoyi Liao BIT143 fall 2022

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        // 1. What is recursion? How does a recursive method differ from a standard iterative method?
            /*
             * Recursion is programming technique in which you describe actions to be repeated using a 
             * method that calls itself. Recursion and iteration are different in ways to execute a set 
             * of instructions repeatedly.Recursion uses function calls to execute the statements repeatedly 
             * inside the function body, while in iteration, we use loops like “for” and “while” to do the same.
             */


        // Put your answer for #2 here:
        // 2. What are base cases and recursive cases? Why does a recursive method need to have both?
            /*
             * Base Case is a case within a recursive solution that is so simple that it can be solved 
             * directly without a recursive call. Recursive Case is a case within a recursive solution that 
             * involves reducing the overall problem to a simpler problem of the same kind that can be solved 
             * by a recursive call. Both base and recursive case are needed so the program can "step down" and
             * stop when it reach the "ground." Without it, the program will be like an infinite loop. 
             */


        // Put your answer for #3 here:
        /* code for Q3
        public static void mystery1(int n) {
            if (n <= 1) {
                System.out.print(n);
            } else {
                mystery1(n / 2);
                System.out.print(", " + n);
            }
        }        
         */

        // Part A:
            // 1

        // Part B:
            // 1, 2

        // Part C:
            // 1, 3

        // Part D:
            // 1, 2, 4

        // Part E:
            // 1, 2, 4, 8, 16

        // Part F:
            // 1, 3, 7, 15, 30

        // Part G:
            // 1, 3, 6, 12, 25, 50, 100

        // Put your answer for #5 here:
        /* code for Q5
            public static void mystery3(int n) {
                if (n <= 0) {
                    System.out.print("*");
                } else if (n % 2 == 0) {
                    System.out.print("(");
                    mystery3(n – 1);
                    System.out.print(")");
                } else {
                    System.out.print("[");
                    mystery3(n – 1);
                    System.out.print("]");
                }
            }
         */

        // Part A:
            // *

        // Part B:
            // [*]

        // Part C:
            // ([*])

        // Part D:
            // ([([*])])

        // Part E:
            // [([([*])])]


        // Put your answer for #6 here:
        /*code for Q6
            public void mysteryXY(int x, int y) {
                if (y == 1) {
                    System.out.print(x);
                } else {
                    System.out.print(x * y + ", ");
                    mysteryXY(x, y - 1);
                    System.out.print(", " + x * y);
                }
            }
         */
        
        // Part A:
            // 4

        // Part B:
            // 8, 4, 8

        // Part C:
            // 16, 8, 16

        // Part D:
            // 12, 8, 4, 8, 12

        // Part E:
            // 12, 9, 6, 3, 6, 9, 12

    }
}
