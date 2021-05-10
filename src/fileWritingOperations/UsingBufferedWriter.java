package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Buffer writer will increase the performance
		
		    //1. file location
				//2. content
				
				String location="UsingBufferedWriter.txt";
				String content="Everything is possible in this world only with hardwork !";
				
				FileWriter fileWriter = new FileWriter(location);
				
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				
				bufferedWriter.write(content);
				
				bufferedWriter.close();

	}

}
