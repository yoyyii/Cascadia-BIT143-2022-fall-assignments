class Recursion_Exercise_1 {
    public static void main(String[] args) {
        int result = foo(3);
        System.out.println("End result: " + result);
    }

    public static int foo(int f) {
        System.out.println("Handed " + f);
        if (f <= 0)
            return f;
        else {
            int result = foo(f - 1);
            System.out.println("Returning " + result);
            result++;
            return result;
        }
    }
}