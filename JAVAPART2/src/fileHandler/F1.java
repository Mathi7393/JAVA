package fileHandler;

import java.io.File;
import java.io.IOException;

public class F1 {

	public static void main(String[] args) {
		//creating folder
		
		File f=new File("D:\\fileHandling");
		System.out.println(f.exists());
		if(f.mkdir()) {
			System.out.println(f.getName()+" folder is created");
		}
		else {
			System.out.println("folder is not created");
		}
		//creating a file
		File f1=new File(f.getAbsolutePath()+"\\mathi.xlsx");
		try {
			if(f1.createNewFile()) {
				System.out.println(f1.getName()+" file is created");
			}
			else {
				System.out.println("file is not craeted");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//details
		System.out.println("===================================");
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		String[] listOfFiles=f.list();
		//for each
		for(String s:listOfFiles) {
			System.out.println(s);
		}
		System.out.println(f1.length());
		
//		if(f1.delete()) {
//			System.out.println("file is deleted");
//		}
//		else {
//			System.out.println("file is not exist");
//		}
		System.out.println(f1.exists());
		
	}
}
