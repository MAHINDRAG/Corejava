package com.narshon;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NarshonExample1 {

	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");  // Creating script engine  
		try {
			scriptEngine.eval("print('Hello World');");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		
	}
}
