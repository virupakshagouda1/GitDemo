package com.qa.test;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar =new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		ar.add("Tom");
		ar.add(12.99);
		System.out.println(ar.size());
		
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		//ar.remove(index)  -- to remove a value from arraylist
		
		ArrayList<Integer> ar1 = new ArrayList<Integer> ();
		ar1.add(100);
		//ar1.add("Tom");
		
	}

}
