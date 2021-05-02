package jsonoperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsonwritingexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonobject = new JSONObject();
		
		jsonobject.put("Name", "sridhar");
		jsonobject.put("Age", "1");
		
		JSONArray array = new JSONArray();
		array.add("magical smile");
		array.add("magical eyes");
		
		jsonobject.put("special qualities", array);
		
		FileWriter filewriter = new FileWriter("sridhar.json");
		
		filewriter.write(jsonobject.toJSONString());
		
		filewriter.close();
		
		
		
		
	}

}
