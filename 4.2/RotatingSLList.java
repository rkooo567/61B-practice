public class RotatingSLList<T> extends SLList<T> {
	public void rotateRight() {
		T lastItem = this.removeLast();
		this.addFirst(lastItem);
	}

	public static void main(String[] args) {
		RotatingSLList<Integer> rlst = new RotatingSLList<>();
		rlst.addFirst(4);
		rlst.addFirst(5);
		rlst.addLast(1);
		rlst.addFirst(10);
		System.out.println("This is suposed to be");
		System.out.println("10 -> 5 -> 4 -> 1");
		rlst.show();
		rlst.rotateRight();
		System.out.println("1 -> 10 -> 5 -> 4");
		rlst.show();
	}
}