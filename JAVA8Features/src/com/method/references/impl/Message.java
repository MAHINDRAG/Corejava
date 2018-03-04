package com.method.references.impl;

import com.method.references.Messageable;

public class Message {

	public Message(String msg) {
		System.out.println("Message :"+msg);
	}
	
	public static void main(String[] args) {
		Messageable messageable = Message::new;
		messageable.getMessage("Good Morning");
	}
}
