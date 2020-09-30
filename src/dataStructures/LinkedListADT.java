 /*
* File name : LinkedListADT.java
* Author : Tami Adeduntan
* Student number : C18327556
* Description of class : Abstract Data Type definition for a Linked List.
*/
package dataStructures;

public interface LinkedListADT <T>
	{
	   //  Adds one element to the start or end of this list
	   public void add (T element);

	   //  Removes and returns the first element from this list
	   public T removeFirst();
  
	   //  Returns true if this list contains no elements
	   public boolean isEmpty();

	   //  Returns the number of elements in this list
	   public int size();

	   //  Returns a string representation of this list
	   public String toString();
	
	   //Remove and return element from the list where the object is passed in as a parameter.
	   public T remove(T element);
	   
	   //Removes and returns the first element from this list
	   public T removeLast();
	   
}
