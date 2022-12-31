/*
 * this class creates an order that describe the item and the quantity purchase 
 */
public class ItemOrder {
    private Item item;
    private int quantity;

    /*
     * this is a constructor that defines item and quantity
     */
    public ItemOrder(Item item, int quantity) {
        this.item = item; 
        this.quantity = quantity;
    }

    /*
     * this method return the price this order by calling priceFor method in Item class 
     */
    public double getPrice() {
        
        return item.priceFor(quantity);
    }

    /*
     * this method return item
     */
    public Item getItem() {
        
        return item;
    }
}
