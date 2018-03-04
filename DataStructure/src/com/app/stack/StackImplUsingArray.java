package com.app.stack;
/**
 * 
 * @author Mahindra
 * Stack is abstract data type which demonstrates Last in first out (LIFO) behavior. We will implement same behavior using Array.Array implementation of Stack is not dynamic in nature.
 *
 */
public class StackImplUsingArray {

	int size;
	int top;
	int arr[];
	public StackImplUsingArray(int size) {
		super();
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}

	public void push(int pushedElement){
		if(!isFull()){
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed Element :"+pushedElement);
		}else{
			System.out.println("Stack is Full...");  
		}
	}

	public int pop(){
		if(!isEmpty()){
			int returnedTop = top;
			top--;
			System.out.println("Popped Element .."+arr[returnedTop]);
			return arr[returnedTop];
		}else{
			System.out.println("Stack is Empty..");
			return -1;
		}
	}
	public int peek(){
		System.out.println("Peek Element :"+arr[top]);
		return arr[top];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		return (size-1==top);
	}
	public static void main(String[] args) {
		StackImplUsingArray stackImplUsingArray = new StackImplUsingArray(10);

		stackImplUsingArray.pop();

		System.out.println("=================");
		stackImplUsingArray.push(10);
		stackImplUsingArray.push(30);
		stackImplUsingArray.push(50);
		stackImplUsingArray.push(40);
		System.out.println("=================");
		stackImplUsingArray.pop();
		stackImplUsingArray.pop();
		stackImplUsingArray.peek();
		

	}
}
