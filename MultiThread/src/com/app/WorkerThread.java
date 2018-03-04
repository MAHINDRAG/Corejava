package com.app;  
public class WorkerThread implements Runnable{
	private String message;
	

	public WorkerThread(String message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(start)Message="+message);
		processMessage();
		System.out.println(Thread.currentThread().getName()+"(end)");
	}

	private void processMessage() {
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
	

}
