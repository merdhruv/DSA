package in.cdac.blr.day6;

import java.util.Scanner;

public class TheSinglyLinkedList {

	// let us assume the following is the linked list
	//  ||34| || -> ||46| || -> ||57| || -> ||32|null||
	// every linked list is a chain of nodes, where each node consists of minimum 2 fields namely, 
	// the data field and a pointer field. 
	// The end of the linked list is identified using the null reference in the last node, it implies 
	// your traversal of a linked list comes to an end when you find a null reference.
	
	// head node which points to the first node of the list
	static SinglyLinkedListNode head;
	
	// traverse the list and print it
	public void traverseList() {
		// make use of a temporary local variable for traversal by assigning it the head reference
		SinglyLinkedListNode n = head;
		// verify for the existence of the list at first place
		if(head == null) {
			System.out.println("EMPTY LIST!");
		} else {
			// iterate node-by-node till you reach the last node
			while(n != null) {
				System.out.print(n.data+" -> ");
				n = n.next;  // hop to the next node
			}
			System.out.println();
		}
	}
	
	// Operations on a linked list: 
	// Insertion (at the start, at the end, before a given node, after a given node), 
	// Deletion and Fetching (traversal)
	
	
	// performing insertion of an element at the start of the list
	// procedure: (a) create a new node, 
	// (b) link the new node to the first(head) node, 
	// (c) let head be refers the new node
	public void insertBeginning(int data) {
		// new node is created for the data to be stored
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		newnode.next = head;
		head = newnode;
	}
	
	// performing insertion of an element at the end of the list
	// procedure: (a) create a new node,
	// (b) traverse till the last node (meaning till null reference)
	// (c) assign the new node as the next node of the last node (last.next = newnode)
	public void insertEnd(int data) {
		// new node is created for the data to be stored
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		SinglyLinkedListNode temp = head;
		// the loop completes only upon reaching the last node of the list
		while(temp.next != null) {
			temp = temp.next;
		}
		// the new node is made as the next node of the (present) last node and so the new node becomes
		// the current new node
		temp.next = newnode;
	}
	
	// performing insertion of an element after a given element (data)
	// procedure: (a) create a new node,
	// (b) traverse till the data of node matched the data searched for using a temp variable
	// (c) next of the new node will be temp's next node
	// (d) and new node becomes the temp's next node
	public void insertAfter(int data, int afterdata) {
		// new node is created for the data to be stored
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		SinglyLinkedListNode temp = head;
		// this loop iterates either till the "afterdata" is found or till the end of the list
		while(temp.next != null && temp.data != afterdata) {
			temp = temp.next;
		} // at the end of this loop, either the afterdata would have been found or else afterdata is not 
		// found and the iteration reached the end of the list
		
		 // meaning you have reached the end of list, meaning you have 2 cases: (a) the afterdata
		// was not found or (b) the afterdata is present in the last node
		if(temp.next == null) { 
			temp.next = newnode;  // hence your new node becomes the last node
		} else {
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}
	
	
	// performing insertion of an element before a given element (data)
	// procedure: (a) create a new node,
	// (b) traverse till the data of node matched the data searched for using a temp.next variable
	// (c) next of the new node will be temp's next node
	// (d) and new node becomes the temp's next node
	public void insertBefore(int data, int beforedata) {
		// new node is created for the data to be stored
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		SinglyLinkedListNode temp = head;
		// if the new node is to be inserted before the first node, 
		// ie. the "beforedata" is the data of the first node itself
		if(temp.data == beforedata) {
			insertBeginning(data);
		} else {
			while(temp.next != null && temp.next.data != beforedata) {
				temp = temp.next;
			} // at the end of this loop, either the beforedata would have been found or else beforedata is not 
			// found and the iteration reached the end of the list
			// at the end of this loop, you would be at the node previous to the node containing "beforedata"
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}
	
	// Deletion of a node
	// (a) if the node to be deleted is the head node, then head is to be made head.next
	// (b) if the node to be deleted is an in-between node, then references need to be
	// re-aligned, and the same will do even if the node to be deleted is the last node
	public void deleteNode(int key) {   // key is the data of the node which is to be deleted
		SinglyLinkedListNode temp = head;
		// check if the list exists at the first place
		if(head == null) {
			System.out.println("EMPTY LIST! and so nothing to delete");
			return;
		}
		
		// suppose the node to be deleted is the head node itself
		if(temp.data == key) {
			head = head.next;
			return;
		}
		// if this method's execution reaches here then it implies that the node to be deleted can be
		// any node leaving the first/head node.
		// the following loop iterates till (a) it locates the node containing "key" or (b) it reaches the 
		// last node exhausting the list
		while(temp.next != null && temp.next.data != key) {
			temp = temp.next;
		}
		if(temp.next.data == key) {
			temp.next = temp.next.next;
		} else {
			System.out.println("KEY element not found");
		}
		return;
	}
	
	
	
	public static void main(String[] args) {
		TheSinglyLinkedList llist = new TheSinglyLinkedList();
		System.out.println("enter data to be stored in the node: ");
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		head = new SinglyLinkedListNode(data);
		System.out.println("head node or the first node created with data value: "+head.data);
		
		
		
	}
}


// class representing a node of the list
class SinglyLinkedListNode {
	int data;  // the data part of the node which stores the value
	SinglyLinkedListNode next;
	
	// constructor creating a fresh node such that the new node created has the data element and null reference
	public SinglyLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}  //     || 101 | null || a logical representation of a newly created node
}

















