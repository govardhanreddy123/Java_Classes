package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {
		 
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(22);
		al.add(5);
		al.add(10);
		al.add(8);
		
		List<Integer> a = al.stream().sorted().collect(Collectors.toList());
		
		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) {
			Integer i =it.next();
			System.out.println(i);
		}
		
		
		
		
	}

}
