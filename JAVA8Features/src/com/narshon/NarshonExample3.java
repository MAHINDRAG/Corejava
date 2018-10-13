package com.narshon;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NarshonExample3 {

	public static void main(String[] args) {
		
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn"); // Creating script engine 
		try {
			scriptEngine.eval(new FileReader("src/js/functionDemo.js")); // Reading Nashorn file  
			Invocable invocable = (Invocable) scriptEngine;
			invocable.invokeFunction("helloMsg"); // calling a function
			invocable.invokeFunction("greetings", "Need to learn java new Features"); // calling a function and passing variable as well.  
		} catch (FileNotFoundException | ScriptException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

}
