package LinkedList;

import java.util.Scanner;

public class Search {
	private static int findElement(Node head, int key) {
		Node curr = head;
		for(int position = 1; curr != null; position++) {
			if(curr.data == key) {
				return position;
			}
			curr = curr.next;
		}
		return -1;
	}
	
	private static int findElement(Node node, int key, int count) {
		if(node == null) {
			return -1;
		}
		if(node.data == key) {
			return  ++count;
		}else {
			node = node.next;
			count++;
			return findElement(node, key, count);
		}
	}
	
	private static Node findNthNode(Node head, int position) {
		Node curr = head;
		if(position == 1) {
			return curr;
		}else {
			for(int i = 0; i< position -1; i++) {
				if(curr != null)
					curr = curr.next;
				else
					return null;
			}
		}
		return curr;
	}
	
	public static Node findNthNodeFromReverse(Node head, int position) {
		Node fastPtr = head, slowPtr = head;
		for(int i = 0; i< position; i++) {
			fastPtr = fastPtr.next;
		}
		while(fastPtr != null) {
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;
		}
		return slowPtr;
	}
	
	public static void main(String[] args) {
		Node head = null, nthNode;
		int noOfElements, element, position;
		Scanner in = new Scanner(System.in);
		LinkedList list = new LinkedList();
		
		System.out.println("Enter the number of elements");
		noOfElements = in.nextInt();
		head = list.CreateLinkList(head, noOfElements);
		
		System.out.println("Enter the element to be found");
		element = in.nextInt();
		
		position = findElement(head, element);
		System.out.println("Element found at position:" + position);
		
		System.out.println("Enter the element to be found recursively");
		element = in.nextInt();
		
		position = findElement(head, element, 0);
		System.out.println("Element found at position:" + position);
		
		System.out.println("Enter the nth node to be founed");
		element = in.nextInt();
		
		nthNode = findNthNode(head, element);
		System.out.println("The nth node is"+ nthNode.data);
		
		System.out.println("Enter the nth node from last to be founed");
		element = in.nextInt();
		
		Node result = findNthNodeFromReverse(head, element);
		System.out.println("nth reverse node" + result.data);
		
		in.close();
	}
	
	
}
