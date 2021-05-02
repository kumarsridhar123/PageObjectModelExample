package Filewritingoperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFilewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location ="usingFilewriter.txt";
		String content= "learning java is simple";
		
		FileWriter filewriter = new FileWriter(location);
		
		filewriter.write(content);	
		
		filewriter.close();
		
				
		
		
	}

}
