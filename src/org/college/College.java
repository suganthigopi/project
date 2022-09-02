package org.college;

public class College {
	private void collegeName() {
		System.out.println("Knowledge Institute Of Technology");
	}
	private void collegeCode() {
		System.out.println("5269");
	}
	private void collegeRank() {
		System.out.println("10");
	}
	public static void main (String args[]) {
		College a=new College();
		Hostel e=new Hostel();
		Dept f=new Dept();
		Student g=new Student();
		a.collegeName();
		a.collegeCode();
		a.collegeRank();
		e.hostelName();
		f.deptName();
		g.studentName();
		g.studentId();
		g.studentDept();
		
		
	}

}
