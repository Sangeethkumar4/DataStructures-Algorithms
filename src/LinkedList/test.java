package LinkedList;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int no;
		Node head = null;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		
		head = new LinkedList().CreateLinkList(head, no);
		new LinkedList().PrintLinkedList(head);
	}
}
