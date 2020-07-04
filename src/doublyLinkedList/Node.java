package doublyLinkedList;

public class Node {
	
	int data;
	Node next;
	Node prev;
	 Node(int data){
		 this.data = data;
		 this.next = this.prev = null;
	 }
}
