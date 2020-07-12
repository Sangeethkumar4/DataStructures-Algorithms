package doublyLinkedList;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no, i, temp;
		Node doublyLinkedList = DoublyLinkedList.createLinkedList();
		DoublyLinkedList.printDoublyLinkedList(doublyLinkedList);
		no = in.nextInt();
		
		Node fastPtr, slowPtr, ptr;
		fastPtr = slowPtr = ptr = doublyLinkedList;
		
		if(no != 0) {
			for(i=0; i<no-1; i++) {
				ptr = ptr.next;
			}
			fastPtr = ptr;
			
			while(fastPtr.next != null) {
				fastPtr = fastPtr.next;
				slowPtr = slowPtr.next;
			}
			
			if(fastPtr  == ptr) {
				slowPtr = ptr;
			}
			
			System.out.println("ptr" + ptr.data + "slowptr" + slowPtr.data);
			
			temp = ptr.data;
			ptr.data = slowPtr.data;
			slowPtr.data = temp;
		}
		
		DoublyLinkedList.printDoublyLinkedList(doublyLinkedList);
	}
}
