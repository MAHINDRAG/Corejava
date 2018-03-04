
package com.app.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCount {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String :");
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		int count=1;
		while(st.hasMoreElements()){
			String word=(String) st.nextElement();
			if(hmap.containsKey(word)){
				int value=hmap.get(word);
				count=++value;
				hmap.put(word, count);
			}else{
				hmap.put(word, count);
			}
		}
		for(Map.Entry<String, Integer> m:hmap.entrySet()){
			System.out.println(m.getKey()+" - "+m.getValue()); 
		}
	}
}
