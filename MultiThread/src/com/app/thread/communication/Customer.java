package com.app.thread.communication;

public class Customer {

	int amount = 10000;
	
	public synchronized void withdraw(int amount){
		System.out.println("Going to withdraw");
		if(this.amount<amount){
			System.out.println("Less balance; waiting for deposit..."); 
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
			this.amount -= amount;
			System.out.println("Withdraw Completed..");
		}
	}
	
	public synchronized void deposit(int amount){
		System.out.println("Going to Deposit");
		this.amount +=amount;
		System.out.println("Deposit Completed");
		notify();
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		new Thread(){
			public void run(){
			 c.withdraw(15000);
			}
		}.start();
		
		Thread t = new Thread(){
			public void run() {
				c.deposit(4600);
			};
		};
		t.start();
	}
}
