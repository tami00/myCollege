/*
* File name : MyCollge.java
* Author : Tami Adeduntan
* Student number : C18327556
* Description of class : Driver class
*/package application;
import java.util.Scanner;

import dataStructures.*;

public class MyCollege 
{
	LinkedList<Student> myList;
	
	public MyCollege()
	{
		myList = new LinkedList<Student>();
	}
	
	public void inputStudents(int i)
	{
	Scanner scan = new Scanner(System.in);
	int noOfStudents; //number of students
	String answer; // answer
	do
	{
	System.out.println("How many students would you like to input?");
	noOfStudents = scan.nextInt();
	if (noOfStudents > 10 )
	{
	System.out.println("Error: You cannot enter more than 10");
	}// display message if user enters more than 10 an error message displays
	}while (noOfStudents > 10 );// keeps user in loop if they enter more than 10
	
	//for (i = 0; i<0; i++)		
	System.out.println("Would you like to add in order of student number?");
	answer = scan.nextLine();

	if (answer.equals("yes"))
	{
		addStudents();// calls addStudents() method
	}
	else 
	{
		inputSorted(); //calls inputSorted();
	}
	}
//}
	
	//1. Allows user to input students
	public void addStudents()
	{			
		Scanner scan = new Scanner(System.in);
		String studentNo; //student number
	    String name; // student name
		int year; // year of entry to program
		String courseCode; // course code
			
		System.out.println("Student number:");
		studentNo = scan.nextLine();
		System.out.println("Name:");
		name = scan.nextLine();
		System.out.println("Year of Entry to Programme:");
		year = scan.nextInt();
		System.out.println("Course Code:");
		courseCode = scan.nextLine();
		
		Student student = new Student(studentNo, name, year, courseCode); // creates a student with all the variables
		
		myList.add(student); // adds student to myList linked list
		
	}	
	
	//1.1 Input students in sorted order
	public void inputSorted()
	{
		
	}
	
	
	
	//2. Display students details using a toString() method
	public String toString()
	{
		return myList.toString();		
	}
	
	//3. Delete a student using their student number
	public void deleteStudentNo()
	{
	String studentNo; //student number
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter number of student you would like to delete: ");
	studentNo = scan.nextLine(); 
	Student student = new Student(studentNo,"",0,""); // creates blank student with only student number
	myList.remove(student); //removes from myList
	}
			
	//4. Display all remaining students after the student is deleted
	public void displayStudent1()
	{
		if (!myList.isEmpty()) //checks if list is empty
		{
			System.out.println(myList.toString()); //displays student info if not empty
		}
		else
			System.out.println("There are no remaining students");
	}
		
	//5. Delete all students from a programme
	public void deleteAll() 
	{
	Scanner scan = new Scanner(System.in);
	LinkedList<Student> myList;
	String courseCode;
	
	System.out.println("Enter course of student you would like to delete: ");
	courseCode = scan.nextLine();
	Student student = new Student("","",0,courseCode); // creates blank student with only course code
	
	LinearNode<Student> current = null;
	LinearNode<Student>	delete=null; // creates 2 nodes 
	do 
	{
		for (current = this.myList; current != null; current = current.getNext()) // for loop that searches through myList to get find current  
		{
	    	if(courseCode.equalsIgnoreCase(current.getElement().getCourseCode())) // if course code equals current that was find in for loop
				{
					current = delete; // current node = delete node
				}
		}
		
		if (delete != null) 
		{
			myList.remove(student); //remove student from list
		}
		
	}while (delete != null);
	}
	
	//6. Display all remaining students after the student is deleted from a specific course
	public void displayStudent2()
	{
		if (!myList.isEmpty())
		{
			System.out.println(myList.toString());
		}
		else
			System.out.println("There are no remaining students");
	}
	
	
	// Main method
	public static void main(String[] args)
	{
		MyCollege driver = new MyCollege();
		driver.inputStudents(0);
		System.out.println(driver.toString());
		driver.displayStudent1();
		driver.deleteAll();
		driver.displayStudent2();
	}
}