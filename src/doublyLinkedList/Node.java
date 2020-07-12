package doublyLinkedList;

public class Node {
	
	int data;
	Node next;
	Node prev;
	Node child;
	 Node(int data){
		 this.data = data;
		 this.next = this.prev = this.child = null;
	 }
}
