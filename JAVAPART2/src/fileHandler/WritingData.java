package fileHandler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingData {

	public static void main(String[] args) {
		String s="java is a widely used high level programming language";
		byte[] b=s.getBytes();
	//	System.out.println(s);
		
		try {
			FileOutputStream fos=new FileOutputStream("D:\\FileHandling\\java.txt");
			try {
				for(byte b1:b) {
					fos.write(b1);
				}
				fos.flush();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("done...");	
		
	}
}
