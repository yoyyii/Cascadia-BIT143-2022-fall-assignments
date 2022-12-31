// This program reads an input file of preferences and find a stable marriage
// scenario. The algorithm gives preference to either men or women depending
// upon whether this call is made from main:
//      makeMatches(men, women);
// or whether this call is made:
//      makeMatches(women, men);

//Yoyi Liao BIT143 2022 fall A2.2

import java.io.*;
import java.util.*;

public class StableMarriage {
    public static final String LIST_END = "END";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("What is the input file? ");
        String fileName = console.nextLine();
        Scanner input = new Scanner(new File(fileName));
        System.out.println();

        List<Person> men = readHalf(input);
        List<Person> women = readHalf(input);
        makeMatches(men, women);
        writeList(men, women, "Matches for men");
        writeList(women, men, "Matches for women");
    }

    public static Person readPerson(String line) {
        int index = line.indexOf(":");
        Person result = new Person(line.substring(0, index));
        Scanner data = new Scanner(line.substring(index + 1));
        while (data.hasNextInt()) {
            result.addChoice(data.nextInt());
        }
        return result;
    }

    public static List<Person> readHalf(Scanner input) {
        List<Person> result = new ArrayList<Person>();
        String line = input.nextLine();
        while (!line.equals(LIST_END)) {
            result.add(readPerson(line));
            line = input.nextLine();
        }
        return result;
    }

    public static void makeMatches(List<Person> list1, List<Person> list2) {
        // FILL THIS METHOD IN WITH YOUR CODE

        int noPartnerIndex = whoDoesNotHavePartner(list1);
        while(noPartnerIndex != -1) {
            Person noPartner = list1.get(noPartnerIndex);
            int womenNum = noPartner.getFirstChoice();
            Person women = list2.get(womenNum);
            List<Integer> womenPartnerRank = women.getChoices();
            int noPartnerRank = womenPartnerRank.indexOf(noPartnerIndex);

            if (women.hasPartner()) {
                int womenCurrentPartner = women.getPartner();
                int womenCurrentPartnerRank = womenPartnerRank.indexOf(womenCurrentPartner);
                
                if (womenCurrentPartnerRank > noPartnerRank) {
                    Person womenEx = list1.get(womenCurrentPartner);
                    women.setPartner(noPartnerIndex);
                    noPartner.setPartner(womenNum);
                    womenEx.erasePartner();
                }
            } else {
                women.setPartner(noPartnerIndex);
                noPartner.setPartner(womenNum);
            }
            

            for (int i = womenPartnerRank.size() - 1; i > noPartnerRank; i--) {
                int menWhoGetReject = womenPartnerRank.get(i);    
                womenPartnerRank.remove(i);
                Person bioOfMenWhoGetReject= list1.get(menWhoGetReject);
                List<Integer> menPartnerRank = bioOfMenWhoGetReject.getChoices();
                int womenIndex = menPartnerRank.indexOf(womenNum);
                menPartnerRank.remove(womenIndex);
            }

            noPartnerIndex = whoDoesNotHavePartner(list1);
        }
    }

    public static void writeList(List<Person> list1, List<Person> list2, String title) {
        System.out.println(title);
        System.out.printf("Name%17s","Choice");
        System.out.printf("%9s%n","Partner");
        System.out.println("--------------------------------------");
        int sum = 0;
        int count = 0;

        // FILL THIS IN WITH YOUR CODE
        for (int i = 0; i < list1.size(); i++) {
            Person men = list1.get(i);
            String menName = men.getName();

            if (men.hasPartner()) {
                int womenIndex = men.getPartner();
                Person women = list2.get(womenIndex);
                String womenName = women.getName();
                int choice = men.getPartnerRank();
                sum += choice;
                count++;

                System.out.printf("%-17s", menName);
                System.out.printf("%-6s", choice);
                System.out.println(womenName);
            } else {
                System.out.println(menName);
            }          
        }

        System.out.println("Mean choice = " + (double) sum / count);
        System.out.println();
    }

    private static int whoDoesNotHavePartner(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {           
            if (!list.get(i).hasPartner() && !list.get(i).getChoices().isEmpty()) {
                return i;
            }
        }
        
        return -1;
    }
}
