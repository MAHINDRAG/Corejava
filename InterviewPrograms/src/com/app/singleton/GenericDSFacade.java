package com.app.singleton;

public class GenericDSFacade {
	/**
	 * Static member: It gets memory only once because of static, it contains the instance of the Singleton class.
	 */
	private static GenericDSFacade genericDSFacade;
	/*
	 * Private constructor: It will prevent to instantiate the Singleton class from 
	 * outside the class.
	 */
	private GenericDSFacade(){

	}

	/*
	 * Static factory method: This provides the global point of access to the Singleton 
	 * object and returns the instance to the caller.
	 */
	public static GenericDSFacade getGenericDSFacade() {
		if(genericDSFacade==null){
			genericDSFacade = new GenericDSFacade();
		}
		return genericDSFacade;
	}

}
