/*
* File name : Student.java
* Author : Tami Adeduntan
* Student number : C18327556
* Description of class : Application package containing all the student data as well as methods to display the student info and
* to compare students
*/


package application;

import java.util.Scanner;

public class Student<E> {
	private String studentNo; //student number
	private String name; //name
	private int year; // year of entry
	private String courseCode; //course code
	
	public Student()
	{
		this.studentNo = null;
		this.name = null;
		this.year = 0;
		this.courseCode = null;
		
		if (courseCode.substring(0,1) != "DT") 
			this.courseCode = "ERROR"; // if the substring 0 and 1 isn't DT error is displayed 
		else if (year < 2013 && (year > 2019))
			this.year = 0000;
	}
	
	public Student(String s, String n, int y, String c)
	{
		this.studentNo = s;
		this.name = n;
		this.year = y;
		this.courseCode = c;
		
		if (courseCode.substring(0) != "DT")
			this.courseCode = "ERROR";
		else if (year < 2013 && (year > 2019))
			this.year = 0000;
	}
	
	//getter method
	public String getStudentNo()
	{
		return studentNo;
	}
	
	//setter method
	public void setStudentNo(String studentNo)
	{
		this.studentNo = studentNo;
	}

	//getter method
	public String getName() {
		return name;
	}

	//setter method
	public void setName(String name) {
		this.name = name;
	}

	//getter method
	public int getYear() {
		return year;
	}

	//setter method
	public void setYear(int year) {
		this.year = year;
	}

	//getter method
	public String getCourseCode() {
		return courseCode;
	}

	//setter method
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String toString()
	{
		return "Student Number: " + this.studentNo + "\nStudent Name: " + this.name + "\nYear of Entry to Programme" + this.year + "\nCourse Code: " + this.courseCode;		
	}
	
	// compares student numbers
	public boolean compareStudentNo (Object otherObject)
	{
		Student<E> otherStudent = (Student<E>) otherObject;
		if (this.studentNo.equals(otherStudent.getStudentNo()) && this.studentNo.equals(otherStudent.getStudentNo()))
  			return true; 
		else
			return false;
	}
	

	//compares is student is less than 0
	public boolean compareNoLess(Object otherObject)
	{
		Student<E> otherStudent = (Student<E>) otherObject;
		if(this.studentNo.compareTo(otherStudent.getStudentNo()) < 0) 
			return true;
		else 
			return false;
	}
	
	//compares is student is greater than 0
	public boolean compareNoGreater(Object otherObject)
	{
		Student<E> otherStudent = (Student<E>) otherObject;
		if(this.studentNo.compareTo(otherStudent.getStudentNo()) > 0) 
			return true;
		else 
			return false;
	}
	
}