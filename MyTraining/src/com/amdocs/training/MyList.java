package com.amdocs.training;
import java.util.*;
public class MyList {
	
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("shubhi");
		list.add("rimi");
		list.add("apoorva");
		list.add("poorva");
		
		System.out.println(list);
		
		for(String st:list)
			System.out.println(st);
		
		list.remove("shubhi");
		System.out.println(list);
		
		list.add(2,"shubhi");
		System.out.println(list);
		
	}

}
