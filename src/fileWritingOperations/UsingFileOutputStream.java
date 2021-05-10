package fileWritingOperations;


import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="Usingfilewritingoperation.txt";
		String content="File writing operations are done !";
		
		
		FileOutputStream outputStream = new FileOutputStream(location);
		byte[] writeThis = content.getBytes();
		outputStream.write(writeThis);
		outputStream.close();
	}

}
