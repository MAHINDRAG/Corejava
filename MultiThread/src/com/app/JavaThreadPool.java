package com.app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaThreadPool {
	public static void main(String[] args) {
		ExecutorService exector=Executors.newFixedThreadPool(5);
for(int i=0;i<10;i++){
	Runnable worker=new WorkerThread(""+i);
	exector.execute(worker);
}
exector.shutdown();
while(!exector.isTerminated()){
	System.out.println("Finished all Threads");
}
}
}