package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new ComparableDemo(101, "Gaurav", 24));
		al.add(new ComparableDemo(104, "naveen", 25));
		al.add(new ComparableDemo(102, "thor", 150));
		
		Collections.sort(al);
		
	}

}
