package com.datastructure.reverselinklist;

public class ReverseLinkList {
	
	static Node1 head;



	/* Function to reverse the linked list */
	Node1 reverse(Node1 node) {
		Node1 prev = null;
		Node1 current = node;
		Node1 next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	// prints content of double linked list
	void printList(Node1 node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkList list = new ReverseLinkList();
		list.head = new Node1(85);
		list.head.next = new Node1(15);
		list.head.next.next = new Node1(4);
		list.head.next.next.next = new Node1(20);
		list.head.next.next.next.next = new Node1(120);
		
		System.out.println("Original Linked list is :");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list : ");
		list.printList(head);
	}

}
