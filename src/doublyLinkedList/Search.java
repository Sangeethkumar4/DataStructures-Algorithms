package doublyLinkedList;

import java.util.Scanner;

public class Search {
	
	  
	   private static int search(Node doublyLinkedList, int data) {
		   int position = 0;
		   boolean flag = false;
		   while(doublyLinkedList != null) {
			   position++;
			   if(doublyLinkedList.data == data) {
				   flag = true;
				   break;
			   }
			   doublyLinkedList = doublyLinkedList.next;
		   }
		   return flag == true ? position : -1;
	   }
	   

	public static void main(String[] args) {
		int data;
		Node doublyLinkedList = null;
		Scanner in = new Scanner(System.in);
		doublyLinkedList = DoublyLinkedList.createLinkedList();
		DoublyLinkedList.printDoublyLinkedList(doublyLinkedList);
		System.out.println("Enter the data to be searched:");
		data = in.nextInt();
		System.out.println(search(doublyLinkedList, data));
	}
}
