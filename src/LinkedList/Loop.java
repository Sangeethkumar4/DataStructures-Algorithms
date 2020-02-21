package LinkedList;

import java.util.Scanner;

public class Loop {

	public static void findMiddleElement(Node head) {
		Node fastPtr = head, slowPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
			if (fastPtr != null) {
				fastPtr = fastPtr.next;
			} else {
				break;
			}
			System.out.println("slowPtr" + slowPtr.data);
		}

		System.out.println("The middle element is " + slowPtr.data);
	}
	
	public static Node reverse(Node head) {
		Node prev = null, curr= head, fut = head;
		while(curr != null) {
			fut = fut.next;
			curr.next = prev;
			prev = curr;
			curr = fut;

			//System.out.println("values  are prev" + prev.data + "curr" + curr.data + "fut" + fut.data);
			
		}
		System.out.println("current value is" + curr);
		return prev;
	}

	public static void main(String[] args) {
		Node head = null;
		int no;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();

		LinkedList list = new LinkedList();
		head = list.CreateLinkList(head, no);
		list.PrintLinkedList(head);

		findMiddleElement(head);
		
		head = reverse(head);
		list.PrintLinkedList(head);
	}
}
