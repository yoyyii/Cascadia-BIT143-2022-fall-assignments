public class Recursion_Exercise_4 {
    public static void main(String[] args) {
        System.out.println("End result: "
                + foo(5, -5));
    }

    public static int foo(int f, int r) {
        System.out.println("foo: f: " +
                f + " r: " + r);

        if (f <= 0 || 0 == r % 2)
            return f + r;

        int i = foo(f - 3, r + 2);
        System.out.println("i is now: " + i);
        int j = foo(f - 2, r - 2);
        System.out.println("j is now: " + j);
        int max = (i > j ? i : j);

        System.out.println("i: " + i +
                " j: " + j + " max: "
                + max);
        return max;
    }
}
