package LinkedList;

import java.util.Scanner;

public class LinkedList {

	public Node CreateLinkList(Node head, int no) {
		Node current = null;
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i< no; i++) {
			if(head == null) {
				head = new Node(in.nextInt());				
				current = head;
			}else {
				current.next = new Node(in.nextInt());
				current = current.next;
			}
		}
		//in.close();
		return head;
	}
	
	public void PrintLinkedList(Node head) {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public int findLength(Node head) {
		int count = 0;
		Node curr = head;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}
}
