package Filewritingoperations;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Usingfileoutputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location ="usingfileoutputstream.txt";
		String content= "help people who in need";
		
		FileOutputStream  outputstream = new FileOutputStream(location);
						
		byte[] writethis=	content.getBytes();
		
		outputstream.write(writethis);
		
		outputstream.close();
		
		
		

	}

}
