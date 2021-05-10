package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		String location="UsingPath.txt";
		String content="Thank you arul prasath !";
		
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());
	}

}
