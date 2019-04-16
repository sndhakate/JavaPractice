package com.Date04012019;

import java.util.ArrayList;

public class StudentPrepare {
	ArrayList< Student> buildStudents() {
		Student student1 = new Student();
		student1.age = 25;
		student1.loc = "Pune";
		
		ArrayList<String> alMobNoStu1 = new ArrayList<>();
		alMobNoStu1.add("8857985681");
		alMobNoStu1.add("7774587455");
		student1.alMobNo = alMobNoStu1;
		
		Student student2 = new Student();
		student2.age=27;
		student2.loc="Delhi";
		
		ArrayList<String> alMobNoStu2 = new ArrayList<>();
		alMobNoStu2.add("7418529637");
		alMobNoStu2.add("1478529632");
		student2.alMobNo = alMobNoStu2;
		
		ArrayList<Student> arratListStu = new ArrayList<>();
		arratListStu.add(student1);
		arratListStu.add(student2);
		System.out.println("ArrayList" +arratListStu);
		
		return arratListStu;
		
		
	}
}
