package com.app.document.builder;

import java.io.FileInputStream;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/*
 * Document Object Model (DOM) is a platform and language-neutral interface that allows 
 * programs and scripts to dynamically access and update the content, structure, and style
 *  of a document
 */

public class DocumentBuilderDemo {
	public static HashMap validationEndpoints = null;

	public static void main(String[] args) {

		// create a new DocumentBuilderFactory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();


		try{
			// use the factory to create a documentbuilder
			DocumentBuilder builder = factory.newDocumentBuilder();

			// create a new document from input source
			FileInputStream fis = new FileInputStream("src/Student.xml");
			InputSource is = new InputSource(fis);
			Document doc = builder.parse(is);

			// get the first element
			String element = doc.getDocumentElement().getNodeName();
			System.out.println("Parent :"+element);
			// get all child nodes
			NodeList nList = doc.getDocumentElement().getChildNodes();

			// print the text content of each child
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("NodeName:"+nNode.getNodeName());
				if("ValidationFrameWork".equalsIgnoreCase(nNode.getNodeName())){
					validationEndpoints = new HashMap();
					NodeList vnList =  nNode.getChildNodes();
					for (int i = 0; i < vnList.getLength(); i++) {					
						Node vNode = vnList.item(i);	
						System.out.println("ChildNode:"+vNode.getNodeName());
						if("ValidationURL".equalsIgnoreCase(vNode.getNodeName()) || "PriceCalculationURL".equalsIgnoreCase(vNode.getNodeName()) || "ListOfAutoRenewalOffersURL".equalsIgnoreCase(vNode.getNodeName()) || "AutoRenewalOptOutURL".equalsIgnoreCase(vNode.getNodeName()) || "ListOfConsumersURL".equalsIgnoreCase(vNode.getNodeName()) || "MonitoringUpdate".equalsIgnoreCase(vNode.getNodeName())){															
							validationEndpoints.put(vNode.getNodeName(), vNode.getTextContent());

						}

					}
				}

			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
