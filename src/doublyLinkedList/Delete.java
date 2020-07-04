package doublyLinkedList;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		Node doublyLinkedList = DoublyLinkedList.createLinkedList();
		DoublyLinkedList.printDoublyLinkedList(doublyLinkedList);
		int data;
		Scanner in = new Scanner(System.in);		
		while(true) {
			data = in.nextInt();
			if(data == -1)
				break;
			doublyLinkedList = deleteNode(doublyLinkedList, data);
			DoublyLinkedList.printDoublyLinkedList(doublyLinkedList);
		}
	}

	private static Node deleteNode(Node doublyLinkedList, int data) {
		Node head = doublyLinkedList;
		Node nodeToBeDeleted = head;
		
		while(nodeToBeDeleted != null && nodeToBeDeleted.data != data) {
			nodeToBeDeleted = nodeToBeDeleted.next;
		}
		
		if(nodeToBeDeleted == null)
			return head;
		
		if(nodeToBeDeleted == head) {
			head = nodeToBeDeleted.next;
		}

		if(nodeToBeDeleted.prev != null)
			nodeToBeDeleted.prev.next = nodeToBeDeleted.next;
		
		if(nodeToBeDeleted.next != null)
			nodeToBeDeleted.next.prev = nodeToBeDeleted.prev;
		
		return head;
	}
}
