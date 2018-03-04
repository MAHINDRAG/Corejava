package com.app.covain;

abstract  class A {
     
	int i;
	abstract void display();
}
class B extends A{
     int j;
	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
	
}
   
          class Absract_Demo{
	   public static void main(String[] args) {
		A obj=new B();
		//obj.j=1;
		obj.display();
	}
	  
  }
