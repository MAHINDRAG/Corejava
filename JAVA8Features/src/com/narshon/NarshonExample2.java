package com.narshon;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NarshonExample2 {

	public static void main(String[] args) {
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");
		try {
			//scriptEngine.eval(new FileReader("src/js/hello.js"));
			scriptEngine.eval(new FileReader("src/js/comments.js"));
		} catch (ScriptException e) {
			e.printStackTrace();
			System.out.println("Error Message1:"+e.getMessage());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
