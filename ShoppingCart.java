import java.util.*;
public class ShoppingCart {
    private List<ItemOrder> list;
    private boolean discount;

    public static final double DISCOUNT_PERCENT = 0.9;

    /**
     * this constructor creates an empty list of item orders.
     */
    public ShoppingCart() {
        list = new ArrayList<ItemOrder>();
        discount = false;
    }

    /**
     * this method adds an item order to the list, replacing any previous order for this item with the new order.
     * @param next, be of type ItemOrder
     */
    public void add(ItemOrder next) {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getItem() == next.getItem()) {
                  list.remove(i);
            }
        list.add(next);
    }

    /**
     *this method sets whether or not this order gets a discount
     *  (true means there is a discount, false means no discount).
     * @param discount
     */
    public void setDiscount(boolean discount) {
            this.discount = discount;
    }

    /**
     * this method returns the total cost of the shopping cart.
     * @return  the total cost of the shopping cart.
     */
    public double getTotal() {
       double x = 0;
       for(ItemOrder item:list){
               x += item.getPrice();
       }
       if(discount==true){
           return x*DISCOUNT_PERCENT;
       }
           return x;

    }

}
