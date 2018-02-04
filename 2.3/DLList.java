public public class DLList {
	// Int node class
	public static class IntNode {
		public int item;
		public IntNode next;
		public IntNode prev;

		public IntNode(int i, IntNode p, IntNode n) {
			item = i;
			next = n;
			prev = p;
		}
	}

	private IntNode sentinel;
	private IntNode last;
	private int size;

	public SLList() {
		sentinel = new IntNode(-532323, null);		
		this.size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(-532323, null);		
		sentinel.next = new IntNode(x, null);
		this.size++;
	}

	// Add an item to the front of the list
	public void addFirst(int item) {
		sentinel.next = new IntNode(item, sentinel.next);
		this.size++;
	}

	public int getFirst() {
		return sentinel.next.item;
	}

	public void addLast(int item) {
		last.next = new IntNode(item, null);
		last = last.next;
		size += 1;
	}

	public int size() {
		return this.size;
	}

	public void show() {
		for (IntNode firstCopy = sentinel.next; firstCopy != null; firstCopy = firstCopy.next) {
			System.out.println(firstCopy.item);
		}		
	}

	public static void main(String[] args){
		SLList x = new SLList(3);
		x.addFirst(5);
		x.addLast(1);
		// 5 3 1
		x.show();
		System.out.println(x.size());
		SLList y = new SLList();
		y.addLast(2);
		System.out.println("y: " + y.getFirst());
	}
}