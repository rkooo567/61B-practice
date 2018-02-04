/** Array based list.
 *  @author Josh Hug
 */

public class AList<T> {
    private T[] items;
    private int size;
    private int RFACTOR

    /** Creates an empty list. */
    public AList() {
        items = new T[100];
        size = 0;
        REFACTOR = 2;
    }

    /* Resizing the underlying array to the target capacity
    */
    private void resize(int capacity) {
        T[] newItem = new T[capacity];
        System.arraycopy(items, 0, newItem, 0, size);
        items = newItem;       
    } 

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if (size == item.length) {
            resize(size * RFACTOR);
        }
        a[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public T getLast() {
        return items[size - 1];      
    }
    /** Gets the ith item in the list (0 is the front). */
    public T get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public T removeLast() {
        T x = getLast();
        itme[size - 1] = 0;
        size -= 1;
        return x;
    }
} 