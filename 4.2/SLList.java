public class SLList<T> {
	public class Node {
		public T item;
		public Node next;

		public Node(T i, Node n) {
			item = i;
			next = n;
		}
	}

	private Node sentinel;
	private int size;

	public SLList() {
		sentinel = new Node(null, null);
		this.size = 0;
	}

	public SLList(T x) {
		sentinel = new Node(null, null);
		sentinel.next = new Node(x, null);
		this.size = 1;
	}

	// Add an item to the front of the list
	public void addFirst(T item) {
		sentinel.next = new Node(item, sentinel.next);
		this.size++;
	}

	public T getFirst() {
		if (this.size == 0) {
			return null;
		} else {
			return sentinel.next.item;
		}
	}

	public void addLast(T item) {
		Node last = new Node(item, null);
		Node firstCopy = sentinel;
		while (firstCopy.next != null) {
			firstCopy = firstCopy.next;
		}
		firstCopy.next = last;
		this.size++;
	}

	public int size() {
		return this.size;
	}

	public void show() {
		for (Node firstCopy = sentinel.next; firstCopy != null; firstCopy = firstCopy.next) {
			System.out.println(firstCopy.item);
		}		
	}

	public T removeLast() {
		if (sentinel.next == null) {
			return null;
		} else {
			Node ptr = sentinel.next;
			while (ptr.next.next != null) {
				ptr = ptr.next;
			}
			Node last = ptr.next;
			ptr.next = null;
			size -= 1;
			return last.item;
		}
	}

	public static void main(String[] args){
		SLList<Integer> x = new SLList<>(3);
		System.out.println("ha");
		x.addFirst(5);
		x.addLast(1);
		// 5 3 1
		x.show();
		System.out.println(x.size());
		SLList<Integer> y = new SLList<>();
		y.addLast(2);
		System.out.println("y: " + y.getFirst());
	}
}