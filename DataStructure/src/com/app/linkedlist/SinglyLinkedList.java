package com.app.linkedlist;

class Node{
	static int addr = 100;
	public int data;
	public Node next;

	public void displayNodeData(){
		System.out.println("{"+data+"}");
	}

}

public class SinglyLinkedList {

	private Node head;

	// used to insert a node at the start of linked list
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;	
		System.out.println("First Head:"+head);
	}

	// For printing Linked List
	public void printLinkedList(){
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while(current !=null){
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}

	// used to insert a node at the start of linked list
	public void insertLast(int data){
		Node current = head;
		System.out.println("insertLast:"+head);
		while(current.next!=null){
			System.out.println("Current.Next:"+current.next);
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode; 
	}

	// used to delete node from start of linked list
	public void deleteFirst(){
		Node temp = head;
		System.out.println("Delete Operation :"+temp);
		head = head.next;
		System.out.println("Delete Operation head:"+head);
	}

	// used to delete node from start of linked list
	public Node deleteFirst(Node node) {
		Node temp = head;		
		head = head.next;
		return temp;
	}

	// Use to delete node after particular node
	public void deleteAfter(Node after){
		Node temp = head;
		System.out.println("Delete After :"+temp);
		while(temp.next!=null && temp.data!=after.data){
			System.out.println("Delete Next :"+temp.next);
			temp = temp.next;
		}
		if(temp.next != null){
			temp.next = temp.next.next;
		}


	}



	public static void main(String[] args) {
		SinglyLinkedList myLikedList = new SinglyLinkedList();
		myLikedList.insertFirst(10);
		myLikedList.insertFirst(5);
		myLikedList.insertFirst(23);
		myLikedList.insertFirst(29);
		myLikedList.insertFirst(4);
		myLikedList.insertFirst(12);
		myLikedList.insertLast(3);
		myLikedList.deleteFirst();
		Node node = new Node();
		node.data = 4;
		myLikedList.deleteAfter(node);
		myLikedList.printLinkedList();
	}

}
