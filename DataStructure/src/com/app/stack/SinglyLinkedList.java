package com.app.stack;

class Node{
	public int data;
	public Node next;

	public void displayNodeData(){
		System.out.println("{"+data+"}");
	}


}

public class SinglyLinkedList {
	private Node head;

	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		System.out.println("Head in insertMethod:"+head);
	}

	public void printNodeData(){
		Node current = head;
		System.out.println("Head in printMethod:"+head);
		while(current!=null){
			current.displayNodeData();
			current = current.next;
			System.out.println("Current :"+current);
		}
	}

	public void insertLast(int data){
		Node current = head;
		while(current.next!=null){
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	public void printNodeData(Node head){
		Node current = head;
		System.out.println("Head in printMethod:"+head);
		while(current!=null){
			current.displayNodeData();
			current = current.next;
			System.out.println("Current :"+current);
		}
	}
	public Node reverseLinkedList(){
		Node previousNode = null;
		Node currentNode = head;
		Node nextNode;
		while(currentNode!=null){
			nextNode = currentNode.next;
			// reversing the link
			currentNode.next=previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		System.out.println("previousNode:"+previousNode);
		return previousNode;
	}

	public void insertAtGivenIndex(int index, int data) {
		Node previous = head;
		int count = 1;
		while(count<index-1){
			previous = previous.next;
			count++;
		}
		Node current = previous.next;
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = current;
		previous.next = newNode;
	}
	public static void main(String[] args) {
		SinglyLinkedList mylist = new SinglyLinkedList();
		System.out.println("*** insert First element ****");
		mylist.insertFirst(20);
		mylist.insertFirst(21);
		mylist.insertFirst(22);
		mylist.insertAtGivenIndex(4,25);
		mylist.insertLast(30);
		System.out.println("*** Print the Elements ***");
		mylist.printNodeData();
		System.out.println("*** Reverse the Elements ***");
		Node reversehead = mylist.reverseLinkedList();	
		System.out.println("After Reversing");
		mylist.printNodeData(reversehead);



	}


}
