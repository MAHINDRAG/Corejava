package com.narshon;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptVariable {

	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
		Bindings bindings = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE); ////Binding script and Define scope of script
		bindings.put("fullName","Mahindra Gopisetty");
		try {
			scriptEngine.eval(new FileReader("src/js/hello.js"));
		} catch (FileNotFoundException | ScriptException e) {
			e.printStackTrace();
		}
		
	}

}
