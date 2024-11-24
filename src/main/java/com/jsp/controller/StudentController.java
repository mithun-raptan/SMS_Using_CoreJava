package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.model.Student;

public class StudentController {
	//create ArrayList as a database
	ArrayList<Student> listOfStudent = new ArrayList<Student>();
	
	public void saveStudent(Student Student) {
		listOfStudent.add(Student);
		System.out.println("student as a object saved inside arraylist");
	}
	
	public Student findStudentById(int studId) {
		for(Student s : listOfStudent) {
			if(s.getId()==studId) { //s.getId() ==> getter() method of Student class.
				System.out.println(s);
				return s;
			}
		}
		System.out.println("record not found");
		return null;
	}
	
	public void updateStudentById(int stuId1, String newRelationshipStatus ) {
		for(Student s : listOfStudent) {
			if(s.getId()==stuId1) {
				s.setRelationshipStatus(newRelationshipStatus);
				System.out.println(s);
				return;
			}
		}
		System.out.println("record not found...");
		
		
	}
	
	public void deleteStudentById(int stuId2) {
		//fetch
		Student s = findStudentById(stuId2); //object or null
		if(s!=null) {
			boolean b = listOfStudent.remove(s);
			if(b==true) {
				System.out.println("record deleted...");
				return;
			}
			
		}
		System.out.println("record not found...");
	}
	
	public void findAll() {
		for(Student s : listOfStudent) {
			System.out.println(s);
		}
	}

}
