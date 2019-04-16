package com.demo;

import java.io.FileOutputStream;

public class WriteFile {
	
	public static void main(String[] args) {
		
			try {
				String path = "F://abc.txt";
				
				FileOutputStream fos = new FileOutputStream(path);
				String s = "Whats going on ???";
				byte b []= s.getBytes();
				
				fos.write(b);
				System.out.println("Successfully written");
				fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
