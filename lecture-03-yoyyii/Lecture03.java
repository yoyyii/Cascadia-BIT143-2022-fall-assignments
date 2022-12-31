import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Comparator;
class Lecture03 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 03");
        //Yoyi Liao BIT143 2022fall

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 21. Consider the following variable declarations:
        // Integer n1 = 15;
        // Integer n2 = 7;
        // Integer n3 = 15;
        // String s1 = "computer";
        // String s2 = "soda";
        // String s3 = "pencil";

        // Indicate whether the result of each of the following comparisons is positive,
        // negative, or 0:

        // A:
        // n1.compareTo(n2) --> positive
        // B:
        // n3.compareTo(n1) --> 0
        // C:
        // n2.compareTo(n1) --> negative  
        // D:
        // s1.compareTo(s2) --> negative
        // E:
        // s3.compareTo(s1) --> positive

        // F:
        // s2.compareTo(s2) --> 0


        // 22. Use the compareTo method to write code that reads two names from the
        // console and prints the one that comes first in alphabetical order. For
        // example, the program’s output might look like the following:

        // Type a name: Tyler Durden
        // Type a name: Marla Singer
        // Marla Singer goes before Tyler Durden
        
        Scanner input = new Scanner(System.in);
        System.out.println("Type a name: ");
        String first_name = input.nextLine();
        System.out.println("Type a name: ");
        String second_name = input.nextLine();

        if(first_name.compareTo(second_name) < 0){
            System.out.println(first_name + " goes before " + second_name);
        } else if (first_name.compareTo(second_name) == 0){
            System.out.println(first_name + " is the same as " + second_name);
        } else {
            System.out.println(second_name + " goes before " + first_name);
        } 


        // 23. Write code to read a line of input from the user and print the words of
        // that line in sorted order, without removing duplicates. For example, the
        // program output might look like the following:

        // Type a message to sort:  to be or not to be that is the question
        // Your message sorted: be be is not or question that the to to

        System.out.println("Type a message to sort: ");
        ArrayList<String> message = new ArrayList<>();
        if (input.hasNextLine()){
            String line = input.nextLine();
            Scanner token = new Scanner(line);
            while (token.hasNext()) {
                String next = token.next();
                message.add(next);
            }   
        }

        message.sort(Comparator.naturalOrder());
        System.out.println("Your message sorted: " + message);



        // EXERCISES:
        CalendarDate calendar1 = new CalendarDate(2,3,2022); 
        CalendarDate calendar2 = new CalendarDate(5,3,2022); 
        if (calendar1.compareTo(calendar2) < 0){
            System.out.println(calendar1 + " is earlier than " + calendar2);
        } else if (calendar1.compareTo(calendar2) == 0){
            System.out.println(calendar1 + " is same day as " + calendar2);
        } else{
            System.out.println(calendar1 + " is later than " + calendar2);
        }
        // None,
    }
}

class CalendarDate implements Comparable<CalendarDate>{
    private int month;
    private int day;
    private int year;

    public CalendarDate (int tempMonth, int day, int year){
        this.month = tempMonth;
        this.day = day;
        this.year = year; 
    }

    public int compareTo (CalendarDate other){
        if (year != other.year){
            return year - other.year;
        } else if (month != other.month){
            return month - other.month;
        } else {
            return day - other.day;
        }
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return month + "/" + day + "/" + year;
    
}