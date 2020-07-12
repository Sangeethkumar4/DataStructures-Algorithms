package doublyLinkedList;

public class MultiLevel {

	public static void main(String[] args) {		
		Node head = createLinkedList();
		Node temp = head, nextNode, childStart;
		while(temp != null) {
			if(temp.child == null)
				temp = temp.next;
			else {
				childStart = temp.child;
				nextNode = temp.next;
				temp.next = temp.child;
				temp.child.prev = temp;
				temp.child = null;
				for(; temp.next != null; temp = temp.next);
				temp.next = nextNode;
				if(nextNode != null)
					nextNode.prev = temp;
				temp = childStart;
			}
		}
		System.out.println(head);
		DoublyLinkedList.printDoublyLinkedList(head);
	}

	private static Node createLinkedList() {
		Node dList = DoublyLinkedList.createLinkedList();
		Node dList1 = DoublyLinkedList.createLinkedList();
		Node dList2 = DoublyLinkedList.createLinkedList();
		Node temp1 = dList, temp2 = dList1; 
		
		dList.child = dList1;
		dList1.child = dList2;
		
		return dList;		
	}
}
