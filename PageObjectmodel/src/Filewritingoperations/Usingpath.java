package Filewritingoperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Usingpath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location ="usingpath.txt";
		String content= "Learning is fun if we focus more"+ " invilve in it";
		
		Path path = Paths.get(location);
		
		Files.write(path, content.getBytes());
		
		

	}

}
