package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("D:\\fileHandling\\java.txt");
			try {
				int i=0;
				while(i!=-1) {
					i=f.read();
					System.out.print((char)i);
				}
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
