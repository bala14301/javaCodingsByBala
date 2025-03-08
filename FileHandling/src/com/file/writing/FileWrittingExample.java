package com.file.writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWrittingExample {

	public static void main(String[] args) {
		
		try {
			File f=null;
			FileWriter fw=null;
			BufferedWriter bw=null;
			f=new File("C:\\javafiles\\img.txt");
			System.out.println("file created ");
			fw=new FileWriter(f);
			bw=new BufferedWriter(fw);
			bw.write("hello My name is Balakrishna\n");
			bw.write("namasthey india......");
			bw.close();
			fw.close();
		
			
		}catch(Exception e) {
			System.out.println("error in writing ");
		}
		
		
		// TODO Auto-generated method stub

	}

}
