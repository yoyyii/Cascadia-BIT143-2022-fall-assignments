// This program creates a list of students and allows the user to 
// lookup information about a student given the ID number.
// This is meant to loosely simulate what happens at the Student
// Services desk (Kodiak Corner here at Cascadia College).
//
// In real life when a student scans their Student ID card
// the computer reads their Student ID Number from the bar code
// The computer then looks up the information about the student
// and allows the employee to look and and modify the information.
//

// Yoyi Liao BIT143 fall 2022

import java.util.*;

public class Student_Services_Desk {

    private static int nextSID = 22; // must be greater than any of the Students' IDs that we pre-load

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Map<Integer, Student> studentInfo = new TreeMap<Integer, Student>();
        studentInfo.put(21, new Student(21, "Zog", "TheDestroyer",
                new ArrayList<String>(List.of("BIT 143", "MATH 411", "ENG 120"))));
        studentInfo.put(20, new Student(20, "Mary", "Sue", 
                new ArrayList<String>(List.of("BIT 142", "MATH 142", "ENG 100"))));
        studentInfo.put(1, new Student(1, "Joe", "Bloggs", 
                new ArrayList<String>(List.of("BIT 115", "MATH 141", "ENG 101"))));

        
        char choice = 'L'; // anything but 'q' is fine
        while (choice != 'q') {
            System.out.println("\nWhat would you like to do next? ");
            System.out.println("F - Find a specific student");
            System.out.println("L - List all the students (for debugging purposes)");
            System.out.println("A - Add a new student");
            System.out.println("D - Delete an existing student");
            System.out.println("M - Modify an existing student");
            System.out.println("Q - Quit (exit) the program");
            System.out.print("What is your choice?\n(type in the letter & then the enter/return key) ");
            choice = keyboard.nextLine().trim().toLowerCase().charAt(0);
            System.out.println();

            switch (choice) {
                case 'f': 
                    System.out.println("Find a student (based on their ID number):\n");
                    // IMPORTANT NOTE: If you call keyboard.nextInt() (or .next(), or anything except nextLine() )
                    // then you should call keyboard.nextLine() to remove the newline (enter/return key) that nextInt()
                    // left on the input stream
                    // More info:
                    //  https://hyunjileetech.github.io/java/2019/02/27/scan-nextLine()-after-scan-nextInt().html 
                    //  https://stackoverflow.com/a/11465208/250610 
                    //  

                    // find SID
                    System.out.print("What is the ID number of the student to find? ");
                    int SID = keyboard.nextInt();
                    keyboard.nextLine();
                    
                    // if SID was not found
                    if (studentInfo.get(SID) == null) {
                        System.out.println("Didn't find a student with ID # " + SID);
                        break;
                    } else { // else if SID was found 
                        List<String> studentClass = new ArrayList<>(studentInfo.get(SID).getClasses());
                        System.out.printf("%s, %s (SID=%d)\nClasses:\n", studentInfo.get(SID).getLastName(), studentInfo.get(SID).getFirstName(), SID);
                        for(int i = 0; i < studentClass.size(); i++) {
                            System.out.println("\t" + studentClass.get(i));
                        }
                    }
                    
                    break;

                case 'l':
                    System.out.println("The following students are registered:");
                    for (Student registeredStudent : studentInfo.values()) {
                        System.out.println(registeredStudent);
                    }
                    break;

                case 'a':
                    System.out.println("Adding a new student\n");

                    // give new student SID and add him into map
                    nextSID = nextSID + 1;
                    SID = nextSID;

                    System.out.println("Please provide the following information:");

                    System.out.print("Student's first name? ");
                    String firstName = keyboard.nextLine();
                    
                    System.out.print("Student's last name? ");
                    String lastName = keyboard.nextLine();
                    
                    System.out.println("Type the name of class, or leave empty to stop.  Press enter/return regardless");
                    String nameOfClass = keyboard.nextLine();
                    ArrayList<String> className = new ArrayList<>(); 
                    while (!nameOfClass.equals("")) {
                        className.add(nameOfClass);
                        System.out.println("Type the name of class, or leave empty to stop.  Press enter/return regardless");
                        nameOfClass = keyboard.nextLine();
                    } 

                    // add new student's information into list
                    studentInfo.put(SID, new Student(SID, firstName, lastName, className));
                    break;

                case 'd': 
                    System.out.println("Deleting an existing student\n");
                    System.out.print("What is the ID number of the student to delete? ");
                    SID = keyboard.nextInt();
                    keyboard.nextLine();

                    if (studentInfo.get(SID) == null) {                   
                        System.out.println("Didn't find a student with ID # " + SID);
                        break;
                    } else {
                        studentInfo.remove(SID);
                        System.out.println("Student account found and removed from the system!");
                    }
                    break;

                case 'm': 
                    System.out.println("Modifying an existing student\n");

                    System.out.print("What is the ID number of the student to modify? ");
                    SID = keyboard.nextInt();
                    keyboard.nextLine();

                    if (studentInfo.get(SID) == null) {                   
                        System.out.println("Didn't find a student with ID # " + SID);
                        break;
                    } else {
                        // modify student's name
                        System.out.println("Student account found!\nFor each of the following type in the new info or leave empty to keep the existing info.  Press enter/return in both cases.");
                        System.out.print("Student's first name: " + studentInfo.get(SID).getFirstName() + " New first name? ");
                        firstName = keyboard.nextLine();
                        if (!firstName.equals("")) {
                            studentInfo.get(SID).setFirstName(firstName);
                        }
                        
                        System.out.print("Student's last name: " + studentInfo.get(SID).getLastName() + " New last name? ");
                        lastName = keyboard.nextLine();
                        if (!lastName.equals("")) {
                            studentInfo.get(SID).setLastName(lastName);
                        }

                        // delete current class
                        System.out.println("Updating class list");
                        System.out.println("Here are the current classes: " + studentInfo.get(SID).getClasses());
                        System.out.println("First, are there any classes you'd like to remove?");
                        List<String> modifyClass = new ArrayList<>(studentInfo.get(SID).getClasses());
                        for (int i = 0; i < modifyClass.size(); i++) {
                            System.out.println(modifyClass.get(i) + "\nType d<enter/return> to remove, or just <enter/return> to keep ");                  
                            String deleteOrNot = keyboard.nextLine();
                            if (deleteOrNot.equals("")) {
                                System.out.println("Keeping " + modifyClass.get(i) + "\n");
                            } else if (deleteOrNot.equals("d")) {
                                System.out.println("Removing " + modifyClass.get(i) + "\n");
                                modifyClass.remove(i);
                                i -= 1;
                            }
                        }
                        
                        // add new class
                        System.out.println("Type the name of the class you'd like to add, or leave empty to stop.  Press enter/return regardless");
                        String newClass = keyboard.next();
                        keyboard.nextLine();
                        while(!newClass.equals("")) {
                            modifyClass.add(newClass);
                            System.out.println("Type the name of the class you'd like to add, or leave empty to stop.  Press enter/return regardless");
                            newClass = keyboard.nextLine();
                        }

                        studentInfo.get(SID).setClasses(modifyClass);
                        System.out.println("Here's the student's new, updated info: " + studentInfo.get(SID));
                    }
                    break;

                case 'q':
                    System.out.println("Thanks for using the program - goodbye!\n");
                    break;

                default:
                    System.out.println("Sorry, but I didn't recognize the option " + choice);
                    break;
            }

        }
    }
}
