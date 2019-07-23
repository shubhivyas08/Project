package com.amdocs.training;

public class TestProgram {
	
	public static void main(String args[])
	{ 
      Student s1=new Student();
      s1.setRollno(101);
      s1.setName("shubhi");
      s1.setAge(21);
      System.out.println("RollNo"+s1.getRollno());
      System.out.println("Name"+s1.getName());
      System.out.println("Age"+s1.getAge());
	}
}