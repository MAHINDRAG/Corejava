package com.narshon;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavascriptObjectTypes {

	public static void main(String[] args) {
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");
		try {
			scriptEngine.eval(new FileReader("src/js/ObjectLiteral.js"));
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
