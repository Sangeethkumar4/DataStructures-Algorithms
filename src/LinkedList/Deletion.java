package LinkedList;

import java.util.Scanner;

public class Deletion {
	
	private static Node deleteAtPosition(Node head, int position) {
		Node current = head, node;
		
		if(position == 1) {
			if(head != null)
				head = current.next;
			else
				System.out.println("invalid position");
		}else {
			for(int i =0; i< position -2; i++) {
				if(current !=null && current.next != null) {
					current = current.next;
				}else {
					System.out.println("position exceeded");
					return head;
				}
			}
			if(current != null) {
				node = current.next;			
				current.next = current.next.next;
				node.next = null;
			}else {
				System.out.println("invalid position");
			}
		}
		return head;
	}
	
	private static Node deleteByKey(int key, Node head) {
		Node prev = head, curr = head, temp;
		if(head !=null && head.data == key) {			
			head = curr.next;
			curr.next = null;
			return head;
		}
		
			while(curr != null && curr.data != key) {
				prev = curr;
				curr = curr.next;
			}
			if(curr != null) {
				temp = curr.next;
				prev.next = temp;
				curr.next = null;
			}else {
				System.out.println("Invalid number");
			}	
		return head;
	}

	public static void main(String[] args) {
		int noOfElements, key, option;
		Node head = null;
		LinkedList list = new LinkedList();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		noOfElements = in.nextInt();
				
		head = list.CreateLinkList(head, noOfElements);
		list.PrintLinkedList(head);
		
		System.out.println("Enter the option 1. Delete By position 2. Delete By Key");
		option = in.nextInt();
		
		if(option == 1) {
		
			System.out.println("Enter the position in which the number has to be deleted");
			key = in.nextInt();
			
			while(key !=  -1) {				
				head = deleteAtPosition(head, key);		
				list.PrintLinkedList(head);
				System.out.println("Enter the position in which the number has to be deleted");
				key = in.nextInt();
			}
		}else {
			System.out.println("Enter the number which has to be deleted");
			key = in.nextInt();
			while(key != -1) {
				head = deleteByKey(key, head);
				list.PrintLinkedList(head);
				System.out.println("Enter the number which has to be deleted");
				key = in.nextInt();
			}
		}
		in.close();
	}
}
