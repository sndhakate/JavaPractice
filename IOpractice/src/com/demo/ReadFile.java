package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) {
		
		try {
			String path ="F://abc.txt";
			
			FileInputStream fis = new FileInputStream(path);
			int i=0;
			while ((i=fis.read())!=-1) {
				char c=(char) i;
				System.out.print(c);
				
			}
			fis.close();
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
