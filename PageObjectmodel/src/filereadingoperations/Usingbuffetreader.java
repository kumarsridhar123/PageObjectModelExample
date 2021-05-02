package filereadingoperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Usingbuffetreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location ="usingbufferwriter.txt";
		
		FileReader filereader = new FileReader(location);
		
	    BufferedReader reader= new BufferedReader(filereader);
	    
	String currentline;
	 
	 while ((currentline=reader.readLine()) != null) {
		
		 System.out.println(currentline);
	}
	 
		
		
	}

}
