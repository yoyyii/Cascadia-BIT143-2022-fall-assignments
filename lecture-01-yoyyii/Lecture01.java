import java.util.Scanner;
class Lecture01 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 01");
        //Yoyi Liao BIT143 2022fall

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        // Hello from lecture 01

        // Copy and paste the output from when you first cloned (downloaded) and ran
        // this program
        // (in other words, when you run this program, what does it print?
        // Copy that output into this file, right here, in a comment
            

        // Where in the textbook are the main topics for this question covered?
            // chapter 1.2 And Now—Java section System.out.println

        // Put your answer for #2 here:
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(i);
        }
        // I used a single for loop because this is the easiest way to do it

        // Where in the textbook are the main topics for this question covered?
        // chapter 2.3 The for Loop


        // Put your answer for #3 here:
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // Where in the textbook are the main topics for this question covered?
            // chapter 2.3 The for Loop section Nested for Loops


        // Put your answer for #4 here:
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows would you like to print? ");
        int rows = input.nextInt();
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        } 
        // Where in the textbook are the main topics for this question covered?
            // // chapter 2.3 The for Loop section Nested for Loops


        // Put your answer for #5 here:
        System.out.print("How many grades would you like to store? ");
        int arraySize = input.nextInt();
        double[] grades = new double[arraySize];
        double sum = 0; 

        for (int i = 0; i < arraySize; i++)
        {
            System.out.print("Next grade? ");
            grades[i] = input.nextDouble();
            sum = sum + grades[i]; 
        }
        double average = sum / arraySize; 
        System.out.println("The average of your grades is " + average);
        // Where in the textbook are the main topics for this question covered?
            // chapter 7.1 Array Basics


        // Put your answer for #6 here:
        
        Food f1 = new Food("Sandwich", 450, 2);
        f1.print();
        f1.setName("candy");
        System.out.println(f1.getName());
        f1.print();

        Food f2 = new Food("Cake", 100, 3);
        f2.print();
        f2.setName("peach");
        System.out.println(f2.getName());
        f2.print();
        // Where in the textbook are the main topics for this question covered?
            // Chapter 8 Classes
            
        // NOTE: The definition of the Food class should go OUTSIDE the Lecture01
        // class. A good place to put this is at the end of the file.
        // NOTE 2: Make sure that you create a couple of Food objects here in main()
    }
}

// Placing the Food class below this line is a good place for it

class Food 
{
    // Food options = new Food(String foodNmae, int calories, double rating 0-5)
    
    String foodName;
    int calories;
    double rating; 


    public Food (String FoodName, int Calories, double Rating)
    {
        foodName = FoodName;
        calories = Calories; 
        rating = Rating; 
    }

    public void setName(String FoodName)
    {
        foodName = FoodName;
    }

    public String getName()
    {
        return foodName; 
    }

    public void print()
    {
        System.out.println("Food name: " + foodName);
        System.out.println("Calories: " + calories);
        System.out.println("Rating: " + rating);
    }
}