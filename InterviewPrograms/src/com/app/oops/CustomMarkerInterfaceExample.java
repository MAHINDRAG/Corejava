package com.app.oops;
interface Marker{   
}

class MyException extends Exception {   
	private static final long serialVersionUID = 1L;

	public MyException(String s){
        super(s);
    }
}

class A  {
    void m1() throws MyException{        
         if((this instanceof Marker)){
             System.out.println("successfull");
         }
         else {
             throw new MyException("Must implement interface Marker ");
         }      
    }   
}


public class CustomMarkerInterfaceExample extends A {
	// if this class will not implement Marker, throw exception
    public static void main(String[] args)  {
        CustomMarkerInterfaceExample a= new CustomMarkerInterfaceExample();
        try {
            a.m1();
        } catch (MyException e) {

            System.out.println(e);
        }


    }

	

}
