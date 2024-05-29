import java.util.*;
public class Catalog {
    private String name;
    private ArrayList<Item> items;

    /**
     * this constructor takes the name of this catalog as a parameter. The name will be a String.
     * @param name
     */
    public Catalog(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }

    /**
     * this method adds an Item at the end of this list.
     * @param next
     */
    public void add(Item next) {
          items.add(next);
    }
    /**
     * this method returns the number of items in this list.
     */
    public int size() {
          return items.size();
    }

    /**
     * this method returns the Item with the given index (0-based).
     * @param index
     * @return the Item with the given index
     */
    public Item get(int index) {
          return items.get(index);
    }

    /**
     * this method returns the name of this catalog.
     * @return name of catalog
     */
    public String getName() {
           return this.name;
    }
}
