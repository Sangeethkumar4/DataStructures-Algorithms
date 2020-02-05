package LinkedList;

import java.util.Scanner;

public class Insertion {
	
	static Scanner scanner = new Scanner(System.in);

	public static Node insertAtBeginning(Node head) {
		Node node;
		System.out.println("Enter the data");
		node = new Node(scanner.nextInt());
		node.next = head;
		head = node;
		return head;
	}
	
	public static Node insertAtPosition(Node head, int position) {
		Node current = head, node;
		if(position == 1) {
			return insertAtBeginning(head);
		}else {
		for(int i=0; i<position-1; i++) {
			if(current.next != null) {
				current = current.next;
			}else {
				System.out.print("Invalid position");
				return head;
			}
		}
			System.out.println("Enter the data");
			node = new Node(scanner.nextInt());
			node.next = current.next;
			current.next = node;
		return head;
		}
	}
	
	public static void main(String[] args) {
		Node head = null;
		int position, numberOfElements;
		System.out.println("Enter the number of elements");
		numberOfElements = scanner.nextInt();
		LinkedList list = new LinkedList();
		
		//create a linked list
		head = list.CreateLinkList(head, numberOfElements);
		list.PrintLinkedList(head);
		System.out.println("Enter the position");
		position = scanner.nextInt();
		while(position!= -1) {
			head = insertAtPosition(head, position);
			list.PrintLinkedList(head);
			System.out.println("Enter the position");
			position = scanner.nextInt();			
		}
		
		System.out.println("final linked list");
		list.PrintLinkedList(head);
	}
}
