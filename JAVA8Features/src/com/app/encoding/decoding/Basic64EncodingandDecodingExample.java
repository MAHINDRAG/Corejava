package com.app.encoding.decoding;

import java.util.Base64;

public class Basic64EncodingandDecodingExample {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getUrlEncoder(); // Getting encoder  
        String estr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial".getBytes());
        System.out.println("Encoded String :"+estr);
        
       Base64.Decoder decoder = Base64.getUrlDecoder(); // Getting decoder  
       String dstr = new String(decoder.decode(estr));
       System.out.println("Decoded URL:"+dstr);
       
       Base64.Encoder encoder1 = Base64.getMimeEncoder();
       String msg = "Hello, \nYou are informed regarding your inconsistency of work"; 
       String emsg = encoder1.encodeToString(msg.getBytes());
       System.out.println("Encoded Message :"+emsg);
       
       Base64.Decoder decoder1 = Base64.getMimeDecoder();
       String dmsg = new String(decoder1.decode(emsg));
       System.out.println("Decoded Message:"+dmsg);
       
       Base64.Encoder encoder2 = Base64.getEncoder();
       byte byteArr[] = {1,2};
       byte byteArr1[] = encoder2.encode(byteArr);
       System.out.println("Encoded Byte Array:"+byteArr1);
       
       byte byteArr2[] = new byte[5];
       int x = encoder2.encode(byteArr, byteArr2);
       System.out.println("Encoded byte Array written to another array:"+byteArr2);
       System.out.println("No of bytes return:"+x);
       
       Base64.Decoder decoder2 = Base64.getDecoder();
       byte[] dbyteArr = decoder2.decode(byteArr1);
       System.out.println("Decoded ByteArray:"+dbyteArr[0]+","+dbyteArr[1]);
	}
}
