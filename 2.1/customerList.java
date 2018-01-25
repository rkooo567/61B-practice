public class IntList {
	public int first;
	public intList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	public int get(int index) {
		IntList p = this;
		for (int i = 0; i < index; i++){
			p = p.rest;
		}
		return p.first;
	}
}

public class main {
	public static void main(String[] args) {
		IntList i = new IntList(15, null);
		IntLIst i = new IntList(10, i);
		IntLIst i = new IntList(5, i);

		// 5
		System.out.print(i.get(0));
		// 10
		System.out.print(i.get(1));
		// 15
		System.out.print(i.get(2));
		// 3
		System.out.print(i.iterativeSize());
	}
}

