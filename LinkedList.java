package List;

public class LinkedList<T> implements List<T> {
	
	//inner class node inside of Linked List
	class Node {
		//constructur for class Node
		public Node(T e, Node next) {
			// TODO Auto-generated constructor stub
			this.e = e;
			this.next = next;
		}
		//class variables
		T e; //value of node
		Node next; //node that is being pointed to, null if the end of the list
		
	};

	Node first = null;
	
	@Override
	public void addFirst(T e) { //better to add to the beginning of add
		// TODO Auto-generated method stub
		first = new Node(e, first); //adding a node and updating value of first node in the list 
		
	}

	public String toString() {
		String s = "";
		Node n = first;
		while (n != null)
		{
			s += ((n == first ? "": ", ") + n.e); //if n is equal to first node, use "". If not equal to first use ", "
			n = n.next; //go to the next node in the list
		}
		return s;
	}

}
