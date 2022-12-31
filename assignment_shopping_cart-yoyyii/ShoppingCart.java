// Stuart Reges
// 1/19/00
//

import java.util.*;

/*
 * this class create a new ArrayList that stores ItemOrder
 * then uses the ItemOrders to calculate the final price 
 */
public class ShoppingCart {

    public static final double DISCOUNT_PERCENT = 0.9;
    private ArrayList<ItemOrder> listOfItemOrders;  
    private boolean discount;

    //this is a constructor that define the ArrayList listOfItemOrders
    public ShoppingCart() {
    
    listOfItemOrders = new ArrayList<ItemOrder>();
    }
    
    /*
     * this method test whether this new item has been stored in the ArrayList already or not 
     * if so, it replace the old itemOrder with new itemOrder
     * if not, it append the itemOrder at the end of the ArrayList
     */
    public void add(ItemOrder next) {
    
        Item nextItem = next.getItem(); 
        for (int i = 0; i < listOfItemOrders.size(); i++)
        {
            if (nextItem.equals(listOfItemOrders.get(i).getItem()))
            {
                listOfItemOrders.set(i, next);
                return;
            }
        }
        listOfItemOrders.add(next);
    }

    //this method set discount 
    public void setDiscount(boolean discount) {
    
        this.discount = discount; 
    }

    //this method calculate the total price and return it 
    public double getTotal() {

        double sum = 0;
        
        for (int i = 0; i < listOfItemOrders.size(); i++)
        {
            sum = sum + listOfItemOrders.get(i).getPrice();
        }
        
        if (discount == true)
        {
            sum = sum * DISCOUNT_PERCENT;
        }
        
        return sum;       
    }
}
