package com.fileso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class Fileso {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\naray\\OneDrive\\Documents\\nani_files\\nani.txt");
		
			
		
		if(f.exists()) {
		FileInputStream fs=new FileInputStream(f);
		int temp;
		while((temp=fs.read())!=-1) {
			System.out.print((char) temp);
		
		}
		
		
		}
		
	}
	
}

