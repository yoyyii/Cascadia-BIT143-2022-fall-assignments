public class Recursion_Exercise_2 {
    public static void main(String[] args) {
        System.out.println("End result: " + foo(5));
    }

    public static int foo(int f) {
        if (f >= 8)
            return f;
        System.out.println("Handed " + f);
        int i;
        if (f % 2 == 0)
            i = foo(f + 2);
        else
            i = foo(f + 1);

        System.out.println("Return value: " + i);
        return i;
    }
}