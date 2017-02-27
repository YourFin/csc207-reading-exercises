public class LnkList implements List {
	private static class Node {
		public Object oo;
		public node next;
		public Node(Object oo, Node nn) {
			this.oo = oo;
			this.next = next;
		}
		public Node(Object oo) {
			this.oo = oo;
			this.next = null;
		}
	}

	private Node firstNode;
	public LnkList (Object oo) {
		firstNode = new Node(oo);
	}

	public LnkList () {
		firstNode = null;
	}

	public Object get(int index) {

	}
	public void addFirst (Object oo) {
		firstNode = new Node(oo, firstNode);
	}

	public int size() {
		return sizeRec(this.firstNode, 0);
	}

	private int sizeRec(Node nn, int current) {
		if(nn == null) {
			return current;
		} else {
			return sizeRec(nn.next, current + 1);
		}
	}

	public void addLast(Object object) {
		if( firstNode == null) {
			firstNode = new Node(object);
			return;
		}
		addLastRec(object, firstNode);
	}

	private void addLastRec(Object object, Node nn) {
		if(nn.next == null)
		{
			nn.next = new Node(object);
		} else {
			addLastRec(object, nn.next);
		}
	}
}
