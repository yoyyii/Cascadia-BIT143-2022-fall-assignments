import java.util.*;

/*
 * this class create a catalog that contains all the items avaliable 
 */
public class Catalog 
{

    private ArrayList<Item> items;
    private String name;

    /*
     * this is a constructor that define name and items
     */
    public Catalog(String name) {

        this.name = name;
        this.items = new ArrayList<Item>();          
    }

    /*
     * this method add item into the list
     */
    public void add(Item next) {

        items.add(next);
    }

    /*
     * this method return the list's size 
     */
    public int size() {

        return items.size(); 
    }

    /*
     * this method get the item at the specific index 
     */
    public Item get(int index) {

        return items.get(index);
    }

    /*
     * this method return name
     */
    public String getName() {
   
        return name;
    }
}
