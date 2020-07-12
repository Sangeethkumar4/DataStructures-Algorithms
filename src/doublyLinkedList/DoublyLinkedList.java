package doublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedList {


   public static Node insert(Node doublyLinkedList, int data) {
	   Node head = doublyLinkedList; 
	   if(doublyLinkedList == null) {
		   return new Node(data);
	   }
	   while(doublyLinkedList.next != null) {
		   doublyLinkedList = doublyLinkedList.next;
	   }
	   Node node = new Node(data);
	   doublyLinkedList.next = node;
	   node.prev = doublyLinkedList;
	   
	   return head;
   }
   
   public static void printDoublyLinkedList(Node doublyLinkedList) {
	   while(doublyLinkedList != null) {
		   System.out.println(doublyLinkedList.data);
		   doublyLinkedList = doublyLinkedList.next;
	   }
   }
   
   	public static Node createLinkedList() {
   		Node doublyLinkedList = null;
   		int no;
		Scanner in = new Scanner(System.in);
		no = in.nextInt();
		
		for(int i=0; i<no; i++) {
			int data = in.nextInt();
			doublyLinkedList = insert(doublyLinkedList, data);
		}
		return doublyLinkedList;
   	}
   	
   	public static int length(Node doublyLinkedList) {
   		int position = 0;
   		while(doublyLinkedList!=null) {
   			position++;
   			doublyLinkedList = doublyLinkedList.next;
   		}
   		return position++;
   	}
	
	
	public static void main(String[] args) {
		Node doublyLinkedList = null;	
		doublyLinkedList = createLinkedList();
		printDoublyLinkedList(doublyLinkedList);
	}
}
