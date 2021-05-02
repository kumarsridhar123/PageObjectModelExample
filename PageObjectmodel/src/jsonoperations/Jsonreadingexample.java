package jsonoperations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Jsonreadingexample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		JSONParser jsonparser = new JSONParser();
		
		FileReader filereader = new FileReader("sridhar.json");
		
	Object parsedobject =jsonparser.parse(filereader);
		
		JSONObject jsonobject = (JSONObject) parsedobject;  // type casting in java
		
	    String name = (String)jsonobject.get("Name");
		
	      Long age1=(Long)jsonobject.get("Age");
	
	JSONArray array=(JSONArray) jsonobject.get("special qualities");
	
	Iterator  iterator= array.iterator();
	
	System.out.println("Name is : " + name);
 	System.out.println("age is : " + age1);
	
	while (iterator.hasNext()) {
		
		System.out.println("special quality" +iterator.next());
		
	}
	
	
	
	
	
		
		

	}

}
