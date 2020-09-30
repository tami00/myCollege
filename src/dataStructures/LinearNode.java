 /*
* File name : LinearNode.java
* Author : Tami Adeduntan
* Student number : C18327556
* Description of class : Represents a node in a linked list.
*/

    
    package dataStructures;   


    public class LinearNode<T>
    {
       private LinearNode<T> next;
       private T element;
  	   private LinearNode<T> current;
  	   private LinearNode<T> previous;	
    
       //---------------------------------------------------------
       //  Creates an empty node.
       //---------------------------------------------------------
       public LinearNode()
       {
          this.next = null;
          this.element = null;
	      this.current = null;
	      this.previous = null;
          
       }
    
       //---------------------------------------------------------
       //  Creates a node storing the specified element.
       //---------------------------------------------------------
       public LinearNode (T elem)
       {
          this.next = null;
          this.element = elem;
          this.current = null;
          this.previous = null;
       }
    
       //---------------------------------------------------------
       //  Returns the node that follows this one.
       //---------------------------------------------------------
       public LinearNode<T> getNext()
       {
          return this.next;
       }
    
       //---------------------------------------------------------
       //  Sets the node that follows this one.
       //---------------------------------------------------------
       public void setNext (LinearNode<T> node)
       {
          this.next = node;
       }
    
       //---------------------------------------------------------
       //  Returns the element stored in this node.
       //---------------------------------------------------------
       public T getElement()
       {
          return this.element;
       }
    
       //---------------------------------------------------------
       //  Sets the element stored in this node.
       //---------------------------------------------------------
       public void setElement (T elem)
       {
          this.element = elem;
       }
       
       //---------------------------------------------------------
       //  Sets the element stored in this node.
       //---------------------------------------------------------
       public void setPrevious (LinearNode<T> node)
       {
          this.previous = null;
       }
       
       //---------------------------------------------------------
       //  Returns the element stored in this node.
       //---------------------------------------------------------
       public LinearNode<T> getPrevious()
       {
    	   return this.previous;
       }
    }

