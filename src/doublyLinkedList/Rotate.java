package doublyLinkedList;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		Node dll = DoublyLinkedList.createLinkedList();
		DoublyLinkedList.printDoublyLinkedList(dll);
		
		Scanner in = new Scanner(System.in);
		int no;
		System.out.println("Enter the position from which it has to be rotated");
		no = in.nextInt();
		System.out.println("length is "+ DoublyLinkedList.length(dll));
		dll = rotate(dll, no);
		DoublyLinkedList.printDoublyLinkedList(dll);
		in.close();
	}

	private static Node rotate(Node dll, int position) {
		if(!(position == 0 ||position >= DoublyLinkedList.length(dll))) {
			
			Node head, temp = dll;
			
			for(int i=0; i<position-1; i++) {
				if(dll!=null) {
					dll = dll.next;
				}
			}
			
			head = dll.next;
			head.prev = null;
			dll.next = null;
			
			for(dll = head; dll.next!=null; dll = dll.next);
			
			dll.next = temp;
			return head;
		}
		return dll;
	}
}
