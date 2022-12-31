import java.text.*;

//this class create an instance that represent an object on the catalog 
public class Item {

    private double price;
    private double bulkPrice;
    private NumberFormat formatter;
    private String name; 
    private int bulkQuantity;

    /*
     * this is the constructor if the item does not have bulk quantity
     * it define price, name, bulk price, bulk quantity, and formatter
     * set bulk price equal to price and bulk quantity to 1 so we could treat each item as a bulk
     * so we don't have to worry about having two separate variables and thus make the overall calculation easier 
     
     * it also prevent the price from being negative by throwing in an exception when it happen 
     */
    public Item(String name, double price) {

        if (price < 0)
        {
            throw new IllegalArgumentException();
        }

        this.price = price;
        this.name = name;
        bulkPrice = price;
        bulkQuantity = 1; 
        formatter = NumberFormat.getCurrencyInstance();
    }

    /*
     * this is the constructor if the item does have bulk quantity
     * it call price and name using this() method, and define bulk price and bulk quantity
     * it also prevent the bulk quantity and bulk price from being negative by throwing in an exception when it happen 
     */
    public Item(String name, double price, int bulkQuantity, double bulkPrice) {

        this(name, price);
        
        if (bulkQuantity < 0 || bulkPrice < 0)
        {
            throw new IllegalArgumentException();
        }
        
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    /*
     * this method calculate the price of the item given the quantity and return it 
     * it also prevent the quantity from being negative by throwing in an exception when it happen 
     */
    public double priceFor(int quantity) {

        if (quantity < 0)
        {
            throw new IllegalArgumentException();
        }
        
        int bulks = quantity / bulkQuantity;
        int leftQuantity = quantity % bulkQuantity;
        double totalBulkPrice = bulks * bulkPrice;
        double totalLeftPrice = leftQuantity * price;
        double totalPrice = totalBulkPrice + totalLeftPrice;
        
        return totalPrice;
    }

    /*
     * this method returns a string that describe the item's name, price
     * if the bulk quantity is more than 1, it then also return bulk quantity and bulk price 
     */
    public String toString() {
        
        String returnItem = name + ", " + formatter.format(price);
        if (bulkQuantity > 1)
        {
            returnItem = returnItem + " (" + bulkQuantity + " for " + formatter.format(bulkPrice) + ")"; 
        }
        
        return returnItem;
    }
}
