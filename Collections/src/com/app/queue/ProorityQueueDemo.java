package com.app.queue;

import java.util.PriorityQueue;

public class ProorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		System.out.println("Poll:"+pq.poll());
		System.out.println("Peek :"+pq.peek());
		for(int i=0;i<10;i++){
			pq.offer(i);
		}
		System.out.println("ADD:"+pq.add(12));
		System.out.println("1st time:"+pq);
		System.out.println("Poll :"+pq.poll());
		System.out.println("2nd time"+pq);
		System.out.println("Peek:"+pq.peek());
		System.out.println("Remove:"+pq.remove());
		System.out.println("3rd time"+pq);
		System.out.println("Element:"+pq.element());
		System.out.println("4th time"+pq);
	}
}
