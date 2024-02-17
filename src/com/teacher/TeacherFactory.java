package com.teacher;

public class TeacherFactory {

	public static void main(String[] erty) {
		Teacher t1 = new Teacher();
		t1.setName("Shyam");
		t1.setCollegeName("SRK Kurara");
		System.out.println(t1.getName());
		System.out.println(t1.getCollegeName());
		
		Teacher.setCollegeName("GIC Hamirpur");
		Teacher t2 = new Teacher();
		t2.setName("Ram");
		System.out.println(t2.getName());
		System.out.println(t2.getCollegeName());
		
		
		Teacher t3 = new Teacher();
		t3.setName("Raju");
		System.out.println(t3.getName());
		System.out.println(t3.getCollegeName());
		
	}
}
