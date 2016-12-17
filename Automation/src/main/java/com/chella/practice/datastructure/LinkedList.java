package com.chella.practice.datastructure;
public class LinkedList {
	int data;
	LinkedList next;

	public LinkedList(int data) {
		this.data = data;
	}

	public LinkedList(int data, LinkedList next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		LinkedList start = this;
		while (start != null) {
			sb.append(start.data);
			if (this.next != null) {
				sb.append("->");
				start = start.next;
			}
		}
		sb.setLength(sb.length() - 2);
		return sb.toString();
	}

	public static void main(String args[]) {
		LinkedList startNode = new LinkedList(1);
		startNode.next = new LinkedList(2, new LinkedList(3));
		startNode.next.next.next = new LinkedList(4);
		// LinkedList list = new LinkedList(1, new LinkedList(2, new
		// LinkedList(3)));
		// printList(startNode);
		// System.out.println(startNode);

		// Add at the beginning
		LinkedList insertAtBeginList = insertionAtBegin(startNode, 5);
		System.out.println(insertAtBeginList);

		// Add at the end
		LinkedList insertAtEndList = insertionAtEnd(startNode, 6);
		System.out.println(insertAtEndList);

		// Add at the middle
		LinkedList insertATMiddle = insertionAtMiddle(startNode, 7, 3);
		System.out.println(insertATMiddle);

		
		LinkedList s= reverseList(startNode, 2, 4);
		System.out.println(s);
		
		// Deletion
		LinkedList deletionList = deletion(insertATMiddle, 1);
		System.out.println(deletionList);

		// Search for the position for the given data
		int spos = searchPostion(insertATMiddle, 5);

		if (spos > 0)
			System.out.println("the data is available ata the postion " + spos);
		else
			System.out.println(" the data is not available");

		// Middle of the Linked List
		int middleElement = middleOfLinkedList(insertAtBeginList);
		System.out.println("The middle of the linked list is " + middleElement);

		// deleting a given node

		// LinkedList deletionList2 =
		// deleteuUsingPtr(insertAtBeginList.next.next);
		// System.out.println(deletionList2);

		// Forming Loop in Linked List

		LinkedList loopLinkedList = new LinkedList(1);
		loopLinkedList.next = new LinkedList(2);
		loopLinkedList.next.next = new LinkedList(3);
		loopLinkedList.next.next.next = new LinkedList(4);
		loopLinkedList.next.next.next.next = new LinkedList(5);
		loopLinkedList.next.next.next.next.next = loopLinkedList.next.next.next;
		
		System.out.println("Detecting loop");
		// Detecting loop in the linked list
		detectloop(loopLinkedList);

		// Nth node from the end of the linked list
		System.out.println(nthNodeFromEnd(insertAtBeginList, 2));

		// Reverse the Linked List
		System.out.println(startNode);
		System.out.println(reverseLinkedList(startNode));

		// insertion in sorting order
		System.out.println("sorting Oder List " + insertionInSortedOrder(insertAtEndList, 2));
		
		LinkedList deletenode = new LinkedList(1);
		deletenode.next=new LinkedList(2);
		deletenode.next.next= new LinkedList(3);
		deletenode.next.next= new LinkedList(4);
		deleteNode(deletenode.next.next);
		
		//Delete Duplicates
		LinkedList deleDuplicates = new LinkedList(1);
		deleDuplicates.next= new LinkedList(2);
		deleDuplicates.next.next= new LinkedList(2);
		deleDuplicates.next.next.next= new LinkedList(3);
		
		System.out.println("Deletion Duplicates ");
		
		
		
		
		
	}
	
	public static LinkedList deleteDuplicates(LinkedList head)
	{
		LinkedList q = head;
		while(q!=null && q.next!= null)
		{
			if(q.data == q.next.data)
			{
			q.next = q.next.next;
			q=q.next;
			}
			else
			{
				q=q.next;
			}
		}
		return q;
	}

	public static LinkedList insertionInSortedOrder(LinkedList head, int value) {
		LinkedList newlist = new LinkedList(value);
		LinkedList temp= null;
		LinkedList current = head;

		if (head == null && head.data == value) {
			newlist.data = value;
			newlist.next = null;
		} else {
			
			
				while(current.data<value && (current!=null))
				{
					current=current.next;
				}
					
			
			
				temp.next=current.next;
				current.next= newlist;
				newlist.next=temp.next;
					

		}
		return current;

	}

	public static int nthNodeFromEnd(LinkedList head, int n) {
		LinkedList mainPtr = head;
		LinkedList refPtr = head;
		int count = 1;
		while (refPtr.next != null && count < n) {
			refPtr = refPtr.next;
			count++;
		}

		while (refPtr.next != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}

		return mainPtr.data;
	}
	
	// Reverse Linked List in the given 
	public static LinkedList reverseList (LinkedList head, int m , int n)
	{
		LinkedList prev= null;
		LinkedList first =null;
		LinkedList ftemp = head;
		int pos =0;
		
		while(ftemp !=null && pos<m)
		{
			first = ftemp;
			ftemp = ftemp.next;
		}
		
		
		LinkedList current = null;
		LinkedList temp = first;
		while (first != null && pos <n) {
			current = new LinkedList(first.data);
			current.next = prev;
			prev = current;
			first = first.next;

		}
		
		temp.next = current;
		
		while(first!= null)
		{
			first= first.next;
		}
		first.next = ftemp;
		
		
		
		
		
		return first;
	}

	//Delete node -- (except the tail) in a singly linked list, given only access to that node.
	/**Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, 
	 * the linked list should become 1 -> 2 -> 4 after calling your function. 
	 * @param head
	 * @return
	 */
	
	public static void deleteNode(LinkedList node)
	{
		node.data= node.next.data;
		node.next= node.next.next;
	}
	// 1->2->3
	public static LinkedList reverseLinkedList(LinkedList head) {
		LinkedList prev = null;
		LinkedList temp = head;
		LinkedList current = null;
		while (temp != null) {
			current = new LinkedList(temp.data);
			current.next = prev;
			prev = current;
			temp = temp.next;

		}
		return current;

	}

	public static void detectloop(LinkedList head) {
		LinkedList fastPtr = head;
		LinkedList slowPtr = head;

		while (fastPtr.next.next != null && slowPtr.next != null) {
			if (fastPtr == slowPtr) {
				System.out.println("Yes");
				break;
			}
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;
		}
	}

	public static LinkedList deleteuUsingPtr(LinkedList next) {

		next.data = next.next.data;
		next.next = next.next.next;

		return next;
	}

	public static int middleOfLinkedList(LinkedList head) {

		LinkedList fastPtr = head;
		LinkedList slowPtr = head;

		if (head != null) {
			while (fastPtr.next.next != null && slowPtr != null) {
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
			}
		}
		return slowPtr.data;
	}

	public static int searchPostion(LinkedList head, int data) {
		int position = 0;

		while (head != null) {
			if (head.data == data) {
				return position;
			}

			position++;
			head = head.next;
		}
		return 0;

	}

	public static void printList(LinkedList list) {
		while (list != null) {
			System.out.print(list.data);
			if (list.next != null)
				System.out.print("->");
			list = list.next;
		}
	}

	public static LinkedList deletion(LinkedList head, int data) {

		if (head.data == data) {
			head = head.next;
			return head;
		}
		LinkedList q = head;
		LinkedList prev = q;
		while (q != null) {
			if (q.data == data) {
				prev.next = q.next;
			}
			prev = q;
			q = q.next;
		}
		return head;
	}

	public static LinkedList insertionAtMiddle(LinkedList list, int data,
			int afterpos) {
		LinkedList newlist = list;
		if (list == null) {
			newlist = new LinkedList(data, null);
		}

		//int position = 0;
		for (int i = 0; i < afterpos - 1; i++) {
			list = list.next;
			//position++;
		}

		LinkedList temp = new LinkedList(data);
		//temp.next = list.next.next;
		temp.next = list;
		list.next = temp;

		return newlist;
	}

	public static LinkedList insertionAtBegin(LinkedList list, int data) {
		LinkedList newlist = null;

		if (list == null) {
			newlist = new LinkedList(data);
			newlist.next = null;
		} else {
			newlist = new LinkedList(data, list);
		}
		return newlist;
	}

	public static LinkedList insertionAtEnd(LinkedList list, int data) {
		LinkedList newlist = list;
		if (list == null) {
			newlist = new LinkedList(data);
			newlist.next = null;
		} else {
			while (list.next != null) {
				list = list.next;

			}
			list.next = new LinkedList(data, null);
		}
		return newlist;
	}

}
