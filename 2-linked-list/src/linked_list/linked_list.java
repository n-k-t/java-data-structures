// @author n-k-t

// Package/container for the Node/LL class files.
package linked_list;

// Class for the methods operating on a linked list.
public class linked_list {

	// Initializing the head as an integer in this case. Could be any object.
	ll_node<Integer> head;
	
	ll_node<Integer> rear;
	
	// Constructor for the linked list sets the head to null.
	public linked_list() {
		
		this.head = this.rear = null;
		
	}
	
	public void Add(int data) {
		ll_node<Integer> temp = new ll_node<Integer>(data);
		
		if (head.getData() == null) {
		
			head = temp;
			head.next = rear = null;
			return;
			
		}
		
		rear = temp;
		rear.next = null;
		return;
		
		}

}
