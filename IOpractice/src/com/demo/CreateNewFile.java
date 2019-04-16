package com.demo;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) {
		
		try {
		File f = new File("F://abc.txt");
		
		boolean fvar = f.createNewFile();
		
		if (fvar) {
			System.out.println("File is successfully created");
		} else {
			
			System.out.println("File is already present");
		} 
		}
		catch (IOException e) {
			System.out.println("Exception occured:  ");
			// TODO Auto-generated catch block
			e.printStackTrace();
	}

}
}
