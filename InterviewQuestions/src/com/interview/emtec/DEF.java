package com.interview.emtec;

public class DEF extends ABC{
    @Override      
	public void add() {
        int a = 30, b = 40, c;
        c = a+b;
        System.out.println("DEF SUM:"+c);
	}
    
    public void mul(){
      int a = 30, b = 40, c;
      c = a*b;
      System.out.println("Multiplication Result:"+c);
    }
}
