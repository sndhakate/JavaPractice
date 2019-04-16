package com.Date04012019;

import java.util.ArrayList;

public class TestOperarion {
	
	void fetchStudent() {
		StudentPrepare prepare = new StudentPrepare() ;
		ArrayList<Student> listStu = new ArrayList<>();
		for (Student student : listStu) {
			System.out.println("Student age : " + student.age);
			System.out.println("Student loc :" + student.loc);
			
			ArrayList<String> alMobNo = student.alMobNo;
			for (String string : alMobNo) {
				System.out.println("al mob no :" + alMobNo);
			}
			
		}
	}

}
