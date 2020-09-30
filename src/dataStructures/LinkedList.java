package dataStructures;
/*
* File name : LinkedList.java
* Author : Tami Adeduntan
* Student number : C18327556
* Description of class : implements the ADT definition of a linked list using the same signatures.
*/

public class LinkedList<T> implements LinkedListADT<T> {
	
	 private int count;  // the current number of elements in the list
	 private LinearNode<T> list; //pointer to the first element 
	 private LinearNode<T> last; //pointer to the last element 	 
	 private Object previous; //pointer to previous element
	 private Object current; //pointer to current element
	 //-----------------------------------------------------------------
	 //  Creates an empty list.
	 //-----------------------------------------------------------------
	    public LinkedList()
	    {
	       this.count = 0;
	       this.last = null;
	       this.list = null;
	       this.current = null;
	       this.previous = null;
	    }

	    
	 // 1.  Adds one element to the end of this list
	   public void add (T element)
	   {      
		   LinearNode<T> node = new LinearNode<T> (element); 
       
		   if (size() == 0) {  
			   	this.last = node; // This is the last and the 
			 	this.list = node; // first node
			 	this.count++;
		   }//end if
		   else
		     { 
				  last.setNext(node); // add node to the end of the list
				  last = node; // now make this the new last node.
				  this.count++;   
		      } //end else
	   }
	   
	   //2. Sorting 
	   
	   
	   
	   
	   
	 // 3. Delete any object from the list where the object is passed in as a parameter.
		public T remove(T element)
		{
			LinearNode<T> current=null; //create current node
		    LinearNode<T> previous=null; // create previous
			T result = null;
			
			for (current = this.list; current != null; current = current.getNext()) //searches through list for element
			{
			if (current == list) {
				result = this.removeFirst(); // removes first node
			}
			
			else if (result == last) {
				result = this.removeLast(); // removes second node
			}
			
			else 
			{
				current.getNext().setPrevious(current.getPrevious());
				previous.getPrevious().setNext(current.getNext());
				count --;
			}// end else
			}
				
			return result;
		}

	   
	   //4.Display objects in the list
		public String toString()
		   {
			   LinearNode<T> current = this.list;
			   String fullList = "";
			   
			   for (current = this.list; current != null; current = current.getNext())
			   {
				   fullList = fullList + "\n" + current.getElement().toString();
			   }//end for
			   
			   return fullList + "\n";
		   }

	   	   
	   // 5. Removes and returns the first element from this list	
		public T removeFirst()
	   	 {
		   T result = null;
			if (isEmpty()) {
				System.out.println("There are no nodes in the list");
			}//end if
			else {
				result = this.list.getElement();
				this.list = this.list.getNext();
				count--;
			}//end else
			return result;
	   }
	
     // 6. Removes and returns the last element from this list	
	public T removeLast()
	  {
		T result = null;
	     if (isEmpty()) {
	    	 System.out.println("There are no nodes in the list");
	     }
	     else {
	    	 result = this.last.getElement();
	    	 this.last = this.last.getNext();
	    	 count --;
	     }// end else
	     return result;
	   } 
	  
	  // 7. Return the next generic object in the list
		
	
	
				   
	  // 8. Returns true if this list contains no elements
	   public boolean isEmpty()
	   {
		   if (this.list == null)
			   return true; // if list is empty returns true
		   else
			   return false;
	   }

	   //9. Check to see if the list already contains a generic object input as a parameter and
	   //returns a boolean.
	  
	      
	   	   
	   //  Returns the number of elements in this list
	   public int size()
	   {
		   return this.count;
	   }
  
	   //10. Extra task

}
