// @author n-k-t

// Package/container for the Node/LL class files.
package linked_list;

// Defining the node class that will be stitched together for the linked list (Singly). It is a generic class.
public class ll_node<E> {

	// Declaring an integer called data, essentially what will be stored within the node.
	private E data;
	
	// Initializing the location of the next node. Is always null as you add to the back of a linked list.
	ll_node<E> next;
	
	
	// Constructor 
	public ll_node(E data) {
		
		// Sets the data variable declared outside the constructor to the one provided with the constructor.
		this.data = data;
		
		// next = null; --> Stylistic choice/unnecessary, the declaration above already initialized next as null.
		
	}
	
	// A getter/reference method for the data within a node.
	public E getData() {
		
		return data;
		
	}
	
}
