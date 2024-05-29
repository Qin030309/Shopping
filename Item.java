import java.text.*;
public class Item {
    private String name;
    private double price;
    private boolean hasBulk;
    private int bulkQuantity;
    private double bulkPrice;
    private NumberFormat formatter;

    /**
     * @param name
     * @param price
     * The name will be a String and the price will be a double
     * this constructor will throw an illegalArgumentException is price is negative
     */
    public Item(String name, double price) {
        if (price < 0)
            throw new IllegalArgumentException();
        this.name = name;
        this.price = price;
        formatter = NumberFormat.getCurrencyInstance();
    }

    /**
     * @param name
     * @param price
     * @param bulkQuantity
     * @param bulkPrice
     * The name will be a String and the quantity will be an integer and the prices will be doubles
     * this method should throws an IllegalArgumentException if any number is negative.
     */
    public Item(String name, double price, int bulkQuantity,
                double bulkPrice) {
        if(price<0||bulkQuantity<0||bulkPrice<0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.hasBulk = true;
        this.bulkPrice = bulkPrice;
        formatter = NumberFormat.getCurrencyInstance();
    }

    /**
     * @param quantity
     * @return the price for the given quantity of the item
     * this method returns the price for a given quantity of the item (taking into account bulk price, if applicable).
     * this method should throw an IllegalArgumentException if quantity is negative.
     */
    public double priceFor(int quantity) {
        if(quantity<0){
            throw new IllegalArgumentException();
        }
        if(hasBulk == false){
            return price*quantity;
        }
        int bundleAmount = quantity/bulkQuantity;
        int individualAmount = quantity%bulkQuantity;
        double total =  bulkPrice*bundleAmount + individualAmount*price;
        return total;

    }
    @Override
    /**
     * this method returns a String representation of this item.  If this has a bulk price, then
     * the method returns parenthesized description of the bulk pricing that has the bulk quantity,
     * the word “for” and the bulk price.
     */
    public String toString() {
         String s = "";
         if(this.hasBulk==false){
             s = this.name + ", "+formatter.format(price);
         }
         else if(this.hasBulk==true){
             s = this.name + ", "+ formatter.format(price) + " "+ "("+ bulkQuantity+ " for "+ formatter.format(bulkPrice)+")";
         }
         return s;
    }



}
