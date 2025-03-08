package com.file.reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadingExample {

	public static void main(String[] args) {
		try {
			File  f=new File("C:\\javafiles\\img.txt");
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String data=br.readLine();
			while(data!=null) {
				System.out.println(data);
				data=br.readLine();
			}
			
			br.close();
			fr.close();
			
		}catch(Exception e) {
			System.out.println("file currepted.....");
		}

	}

}
