import java.util.*;
class Lecture04 {

    public static void main(String[] args) {
        System.out.println("Hello from lecture 04");
        //Yoyi Liao BIT143 2022fall

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 1. When should you use a LinkedList instead of an ArrayList?
            // when there's a lot of modification such as addition or subtraction that neeed to be done 


        // 2. Would a LinkedList or an ArrayList perform better when run on the
        // following code? Why?
        // public static int min(List<Integer> list) {
        // int min = list.get(0);
        // for (int i = 1; i < list.size(); i++) {
        // if (list.get(i) < min) {
        // min = list.get(i);
        // }
        // }
        // return min;
        // }

            /* ArrayList would be a better option because it's very inefficient to use
             .get() with LinkedList because of its nodes connected feature.
             To fetch an element, LinkedList needs to be traversed from the beginning 
             and follow each of the nodes' connections until the wanted element is found.*/
        

        // 3. What is an iterator? Why are iterators often used with linked lists?
            /*iterator is an object that allows the efficient retrieval of the
            elements of a list in sequential order.
            
            Linked like doesn't remember its previous position, so it always starts from the front again.
            Iterator help  keeps track of our current position in the list
            not ).
            */


        // 4. Write a piece of code that counts the number of duplicate elements in a
        // linked list.
        // That is, the number of elements whose values are repeated at an earlier index
        // in the list. Assume that all duplicates in the list occur consecutively. For
        // example, the list [1, 1, 3, 5, 5, 5, 5, 7, 7, 11] contains five duplicates:
        // one duplicate of element value 1, three duplicates of element value 5, and
        // one duplicate of element value 7.

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(11);

        Set<Integer> set = new HashSet<>(list);
        int duplicate = list.size() - set.size();
        System.out.println("There are " + duplicate + " duplicate elements in the linked list.");



        // 5. Write a piece of code that inserts a String into an ordered linked list of
        // Strings, maintaining sorted order.
        // For example, for the list ["Alpha", "Baker", "Foxtrot", "Tango", "Whiskey"],
        // inserting "Charlie" in order would produce the list ["Alpha", "Baker",
        // "Charlie", "Foxtrot", "Tango", "Whiskey"].

        LinkedList<String> list2 = new LinkedList<>(List.of("Alpha", "Baker", "Foxtrot", "Tango", "Whiskey"));
        String addNode = "Charlie";
        for (int i = 0; i < list2.size(); i++) {
            if(addNode.compareTo(list2.get(i)) < 0) {
                list2.add(i, addNode);
                break;
            }
        }
        System.out.println(list2);



        // From Section 11.2: Sets
        // 10. A List has every method that a Set has, and more. So why would you use a
        // Set rather than a List?
            //because set will make sure there's no duplicates within it


        // 11. When should you use a TreeSet, and when should you use a HashSet?
            // use TreeSet if we want to keep our entries sorted
            // use HashSet if we want the program to run faster 


        // 12. A Set doesn’t have the get and set methods that an ArrayList has. How do
        // you examine every element of a Set?
            //use iterator to loop over elements of a set 


        // 13. What elements are contained in the following set after this code
        // executes?

        // Set<Integer> set = new HashSet<>();
        // set.add(74);
        // set.add(12);
        // set.add(74);
        // set.add(74);
        // set.add(43);
        // set.remove(74);
        // set.remove(999);
        // set.remove(43);
        // set.add(32);
        // set.add(12);
        // set.add(9);
        // set.add(999);

        //[12, 32, 9, 999]


        // 14. How do you perform a union operation on two sets? An intersection? Try to
        // give an answer that doesn’t require any loops.

            // union: addAll(Collection c);
            // intersection: retainALL(Collection c);


        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // public static void mystery(List<String> list) {
        // Set<String> result = new TreeSet<>();
        // for (String element : list) {
        // if (element.compareTo(list.get(0)) < 0) {
        // result.add(element);
        // } else {
        // result.clear();
        // }
        // }
        // System.out.println(result);
        // }
        // [marty, stuart, helene, jessica, amanda] --> [helene, jessica, amanda]
        // [sara, caitlin, janette, zack, riley] --> [riley]
        // [zorah, alex, tyler, roy, roy, charlie, phil, charlie, tyler] --> [alex, tyler, roy, charlie, phil]


        // Exercises:
        // 2. Write a method called alternate that accepts two Lists as its parameters
        // and returns a new List containing alternating elements from the two lists, in
        // the following order:

        // First element from first list
        // First element from second list
        // Second element from first list
        // Second element from second list
        // Third element from first list
        // Third element from second list
        // . . .
        // If the lists do not contain the same number of elements, the remaining
        // elements from the longer list should be placed consecutively at the end. For
        // example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8,
        // 9, 10, 11, 12], a call of alternate(list1, list2) should return a list
        // containing [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12].

        ArrayList<Object> list3 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Object> list4 = new ArrayList<>(List.of(6, 7, 8, 9, 10, 11, 12));
        
        List<Object> list5 = new ArrayList<>(); 
        list5 = alternate(list3, list4);
        System.out.println(list5);
        


        // 9. Write a method hasOdd that accepts a set of integers as a parameter and
        // returns true if the set contains at least one odd integer and false
        // otherwise.
        // If passed the empty set, your method should return false.
        
        Scanner input = new Scanner(System.in);
        
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(4);
        set1.add(5);
        boolean hasOdd = hasOdd(set1);
        System.out.println(hasOdd);

    }

    public static List<Object> alternate (ArrayList<Object> list3, ArrayList<Object> list4) {
        
        Iterator<Object> itr3 = list3.iterator();
        Iterator<Object> itr4 = list4.iterator();
        List<Object> list5 = new ArrayList<>();
        
        while (itr3.hasNext() || itr4.hasNext()) {
            if (itr3.hasNext()) {
                list5.add(itr3.next());
            }

            if (itr4.hasNext()) {
                list5.add(itr4.next());
            }
        }


        System.out.println(list5);
        
        return list5;
    }

    public static boolean hasOdd(Set<Integer> set1){
        Iterator<Integer> itr = set1.iterator();
        for (Integer element : set1){
            if (itr.next() % 2 != 0){
                return true;
            }
        }
        return false;
    }
}
