class Lecture07 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 07");
        // Yoyi Liao BIT143 2022 fall 

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #8 here:
            /*
             * call stack is the internal structure that keeps track of the sequence of methods that 
             * have been called. The function of recursion was built upon on call stack. The function
             * keep call it self repetively until it reaches the base class, then started to produce
             * then execute the code back to the top 
            */ 



        // Put your answer for #9 here:
            // The new code shown would print the lines in their original order, not reversed.


        // Put your answer for #10 here:
            /*
             * The new code shown would cause infinite recursion, because each recursive call just 
             * makes another recursive call and doesn't progress toward the base case.
            */


        // Put your answer for #11 here:
            /*
             * there's no base case to tell the function when to stop so it'll ended up being an 
             * infinite recursion. To fix it, simply add in a base case such as "if y equals to 0, return 1"
             */

        // Put your answer for #17 here:
            /*
             * the base class should be n < 10 instead of n > 10 in order to funciton correctly.
             */

        // EXERCISES:

        // Put your answer for #1 here:
        int n = 4;
        System.out.println(starString(n));


        // Put your answer for #2 here:
        writeNums(5);
        System.out.println(); // to complete the line of output
        writeNums(12);
        System.out.println(); // to complete the line of output


        // Put your answer for #3 here: 
        int n1 = 10;
        System.out.print("writeSequence(" + n1 + "): ");
        writeSequence(n1);
        System.out.println(" ");

        // Put your answer for #10 here:
        System.out.println(digitMatch(1072503891, 62530841));

        // Put your answer for #12 here:
        System.out.println(isReverse("hello", "oLLeH"));
    }

    public static String starString(int n) {
    
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return "*";
        } else {
            return starString(n - 1) + starString(n - 1);
        }
    }

    public static void writeNums(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 1){
            System.out.print(n);
        }
        else {
            writeNums(n - 1);
            System.out.print(", " + n);
        }
    }

    public static boolean isReverse(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return true;
        } else if (a.length() != b.length()) {
            return false; 
        } else {
            if (Character.toLowerCase(a.charAt(0)) == Character.toLowerCase(b.charAt(b.length() - 1))) {
                return isReverse(a.substring(1), b.substring(0, b.length() - 1));
            }
        }

        return false;
    }

    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } 
        
        if (n == 1) {
            System.out.print("1 ");
            return;
        } else if (n == 2) {
            System.out.print("1 1 ");
            return;
        } else {
            System.out.print(n / 2 + n % 2 + " ");
            writeSequence(n - 2);
            System.out.print(n / 2 + n % 2 + " ");
        }
    }

    public static int digitMatch(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        } else if (a == 0 && b == 0) {
            return 1;
        } else if ((a == 0 && b != 0) || (b == 0 && a != 0)) {
            return 0;
        } else {
            int match = 0;
            if (a % 10 == b % 10) {
                match++; 
            }
            return match + digitMatch(a / 10, b / 10);
        }
    }
}
