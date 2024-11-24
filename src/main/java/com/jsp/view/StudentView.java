package com.jsp.view;

import java.util.Scanner;

import com.jsp.controller.StudentController;
import com.jsp.model.Student;

public class StudentView {
	static Scanner sc = new Scanner(System.in);
	private static Student getStudentObject() {
		System.out.println("enter student id");
		int id = sc.nextInt();
		System.out.println("enter student name");
		sc.nextLine();//dummy instruction
		String name = sc.nextLine();
		System.out.println("enter student email");
		String email = sc.nextLine();
		System.out.println("enter student password");
		String password = sc.nextLine();
		System.out.println("enter student dob");
		String dob = sc.nextLine();
		System.out.println("enter student address");
		String address = sc.nextLine();
		System.out.println("enter student gender");
		String gender = sc.nextLine();
		System.out.println("enter student mobile number");
		long mob = sc.nextLong();
		System.out.println("enter student relatioship status");
		sc.nextLine();//dummy instruction
		String relationShipStatus = sc.nextLine();
		
		//create Student object
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setPassword(password);
		s.setDob(dob);
		s.setAddress(address);
		s.setGender(gender);
		s.setMob(mob);
		s.setRelationshipStatus(relationShipStatus);
		
		
		return s;
	}
	public static void main(String[] args) {
		System.out.println("welcome to sms app");
		StudentController controller = new StudentController();
		while(true) {
			System.out.println("enter your choice");
			System.out.println("1.save student");
			System.out.println("2.find student by id");
			System.out.println("3.update student by id");
			System.out.println("4.delete student by id");
			System.out.println("5.find all");
			System.out.println("6.exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
//				System.out.println(1);
				Student s = getStudentObject(); //create a student object and return
				controller.saveStudent(s);
				break;
			case 2:
//				System.out.println(2);
				int stuId = sc.nextInt();
				controller.findStudentById(stuId);
				break;
			case 3:
//				System.out.println(3);
				System.out.println("enter student id");
				int stuid1 = sc.nextInt();
				System.out.println("enter new relationship status");
				sc.nextLine(); // dummy instruction
				String newRelationshipStatus = sc.nextLine();
				controller.updateStudentById(stuid1,newRelationshipStatus);
				
				
				break;
			case 4:
//				System.out.println(4);
				System.out.println("enter student id");
				int stuId2=sc.nextInt();
				controller.deleteStudentById(stuId2);
				break;
			case 5:
//				System.out.println(5);
				controller.findAll();
				break;
			case 6:
				System.out.println("exit...thank you");
				return;
			default:
				System.out.println("invalid choice entered");
			}
		}
		
	}

}
