public class ItemOrder {
    private Item item;
    private int quantity;

    /**
     * @param item
     * @param quantity
     * this constructor that creates an item order for the given item and given quantity. The quantity will be an integer.
     */
    public ItemOrder(Item item, int quantity) {
        if (quantity < 0)
            throw new IllegalArgumentException();
        this.item = item;
        this.quantity = quantity;
    }
    /**
     *this method returns the cost for this item order.
     * @return the cost for this item order
     */
    public double getPrice() {
       double price = item.priceFor(quantity);
       return price;
    }

    /**
     * this method returns a reference to the item in this order.
     * @return: a reference to the item in this order.
     */
    public Item getItem() {
         return item;
    }


}
