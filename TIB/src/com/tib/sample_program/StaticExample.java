package com.tib.sample_program;

public class StaticExample {
	
	int rollno;
	String name;
	
	static String college="TIB";
	
	StaticExample(int n , String s) {
		rollno=n;
		name=s;
	}
	
	StaticExample(int n , String s,String inst) {
		rollno=n;
		name=s;
		college=inst;
	}
	
	
	void display (){System.out.println(rollno+" "+name+" "+college);}  
	
	public static void main(String[] args) {
		
		StaticExample s1 = new StaticExample(001, "Parthipan");
		s1.display();
		StaticExample s2 = new StaticExample(002, "Kavitha");
		s2.display();
		StaticExample s3 = new StaticExample(003, "Sukumar");
		s3.display();
		StaticExample s4 = new StaticExample(0004, "Bhima");
		s4.college = "Lyca";
		
		s4.display();
		
	}

}
