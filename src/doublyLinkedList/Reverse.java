package doublyLinkedList;

public class Reverse {

	public static void main(String[] args) {
		Node doublyLinkedList = DoublyLinkedList.createLinkedList(); 
		DoublyLinkedList.printDoublyLinkedList(doublyLinkedList);
		doublyLinkedList = reverse(doublyLinkedList);
		System.out.println("Reversed Linked list");
		DoublyLinkedList.printDoublyLinkedList(doublyLinkedList);
	}

	private static Node reverse(Node doublyLinkedList) {
		Node prev = null;
		
		while(doublyLinkedList != null) {
			Node next = doublyLinkedList.next;
			doublyLinkedList.next = prev;
			doublyLinkedList.prev = next;
			prev = doublyLinkedList;
			doublyLinkedList = next;
		}
		return prev;
	}
}
