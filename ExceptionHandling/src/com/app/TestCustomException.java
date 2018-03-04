package com.app;
class InvalidAgeException extends Exception{
	private static final long serialVersionUID = 1L;
	public static final String NOT_VALID = "NOT_VALID";
	public InvalidAgeException(String msg){
		super(msg);
	}
}

public class TestCustomException {
	static void validate(int age){
		if(age<18){
			try {
				throw new InvalidAgeException(InvalidAgeException.NOT_VALID);
			} catch (InvalidAgeException e) {
				e.printStackTrace();
			}
		}else
			System.out.println("u r eligible for vote");
	}
	public static void main(String[] args) {
		try{
			validate(12);
		}catch(Exception e){
			System.out.println("Exception Occured :"+e);
		}

	}
}