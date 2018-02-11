public class VengefulSLList<Item> extends SLList<Item> {
    SLList<Item> deletedItems;

    public VengefulSLList() {
    	super();
        deletedItems = new SLList<Item>();
    }

    public VengefulSLList(Item i) {
    	super(i);
        deletedI	tems = new SLList<Item>();
    }

    @Override
    public Item removeLast() {
		Item last = super.removeLast();
		deletedItems.addLast(last);
		return last;    		
    }

    public void printLostItems() {
        deletedItems.show();
    }	
}