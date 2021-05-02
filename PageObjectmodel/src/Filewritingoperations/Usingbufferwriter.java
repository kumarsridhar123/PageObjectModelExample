package Filewritingoperations;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Usingbufferwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location ="usingbufferwriter.txt";
		String content= "Summer is coming";
		
		FileWriter filewriter = new FileWriter(location);
		
		BufferedWriter bufferfilewriter = new BufferedWriter(filewriter);
		
		bufferfilewriter.write(content);
		
		bufferfilewriter.close();
		
		
		
		
	}

}
