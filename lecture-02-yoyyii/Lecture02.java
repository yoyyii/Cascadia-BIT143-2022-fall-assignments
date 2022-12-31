import java.util.ArrayList;
class Lecture02 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 02");
        //Yoyi Liao BIT143 2022fall

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        // 1. What is an ArrayList? In what cases should you use an ArrayList rather
        // than an array?
            //ArrayList is an array that is resizable


        // Put your answer for #3 here:
        // 3. Write the code to declare an ArrayList containing these elements. What is
        // the size of the list? What is its type?
        ArrayList<String> sentence = new ArrayList<String>();
        sentence.add("It ");
        sentence.add("was ");
        sentence.add("a ");
        sentence.add("stormy ");
        sentence.add("night.");
        //the size of this ArrayList is 5 and the type is String 


        // Put your answer for #4 here:
        // 4. Write code to insert two additional elements, "dark" and "and", at the
        // proper places in the list to produce the following ArrayList as the result:
        // ["It", "was", "a", "dark", "and", "stormy", "night"]
        sentence.add(3, "dark");
        sentence.add(4, "and");


        // Put your answer for #5 here:
        // 5. Write code to change the second element’s value to "IS", producing the
        // following ArrayList as the result:
        // ["It", "IS", "a", "dark", "and", "stormy", "night"]
        sentence.set(1, "is ");


        // Put your answer for #7 here:
        // 7. Write code to declare an ArrayList holding the first 10 multiples of 2: 0,
        // 2, 4,..., 18. Use a loop to fill the list with the proper elements.
        ArrayList<Integer> multiplesOf2 = new ArrayList<>();
        int j = 0; 
        for (int i = 0; i < 10; i = i + 2)
        {
            multiplesOf2.add(j);
            j = j + 2; 
        }


        // Put your answer for #9 here:
        // 9. Write code to print out whether or not a list of Strings contains the
        // value "IS". Do not use a loop.
        if (sentence.contains("IS"))
        {
            System.out.print("this list of Strings contains the value IS");
        }
        else
        {
            System.out.print("this list of Strings does not contains the value IS");
        }


        // Put your answer for #14 here:
        // 14. What is a wrapper class? Describe the difference between an int and an
        // Integer.
            /*
             wrapper class is a class that stores primitive as an object
             int is a primitive data type while Integer is a Wrapper class when storing integer
             */


        // Put your answer for #13 here:
        // 13. The code that follows does not compile. Why not? Explain how to fix it.
        // ArrayList<int> numbers = new ArrayList<>();
        // numbers.add(7);
        // numbers.add(19);
        // System.out.println(numbers);

        /*
        because the code does not box int to Integer. After boxing it, the code 
        will be fix
        */


        // Put your answer for #15 here:
        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // A. [2, 6, 1, 8]--> [1, 2, 6, 8]
        // B. [30, 20, 10, 60, 50, 40]--> [10, 30, 40, 20, 60, 50]
        // C. [-4, 16, 9, 1, 64, 25, 36, 4, 49]--> [-4, 1, 25, 4, 16, 9, 64, 36, 49]
    }
}
