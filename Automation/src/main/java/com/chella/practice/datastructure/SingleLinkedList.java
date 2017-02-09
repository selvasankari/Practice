package com.chella.practice.datastructure;
public class SingleLinkedList {
	int data;
	SingleLinkedList next;

	public SingleLinkedList(int data) {
		this.data = data;
	}

	public SingleLinkedList(int data, SingleLinkedList next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		SingleLinkedList start = this;
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
		SingleLinkedList startNode = new SingleLinkedList(1);
		startNode.next = new SingleLinkedList(2, new SingleLinkedList(3));
		startNode.next.next.next = new SingleLinkedList(4);
		// LinkedList list = new LinkedList(1, new LinkedList(2, new
		// LinkedList(3)));
		// printList(startNode);
		// System.out.println(startNode);

		// Add at the beginning
		SingleLinkedList insertAtBeginList = insertionAtBegin(startNode, 5);
		System.out.println(insertAtBeginList);

		// Add at the end
		SingleLinkedList insertAtEndList = insertionAtEnd(startNode, 6);
		System.out.println(insertAtEndList);

		// Add at the middle
		SingleLinkedList insertATMiddle = insertionAtMiddle(startNode, 7, 3);
		System.out.println(insertATMiddle);

		
		SingleLinkedList s= reverseList(startNode, 2, 4);
		System.out.println(s);
		
		// Deletion
		SingleLinkedList deletionList = deletion(insertATMiddle, 1);
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

		SingleLinkedList loopLinkedList = new SingleLinkedList(1);
		loopLinkedList.next = new SingleLinkedList(2);
		loopLinkedList.next.next = new SingleLinkedList(3);
		loopLinkedList.next.next.next = new SingleLinkedList(4);
		loopLinkedList.next.next.next.next = new SingleLinkedList(5);
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
		
		SingleLinkedList deletenode = new SingleLinkedList(1);
		deletenode.next=new SingleLinkedList(2);
		deletenode.next.next= new SingleLinkedList(3);
		deletenode.next.next= new SingleLinkedList(4);
		deleteNode(deletenode.next.next);
		
		//Delete Duplicates
		SingleLinkedList deleDuplicates = new SingleLinkedList(1);
		deleDuplicates.next= new SingleLinkedList(2);
		deleDuplicates.next.next= new SingleLinkedList(2);
		deleDuplicates.next.next.next= new SingleLinkedList(3);
		
		System.out.println("Deletion Duplicates ");
		
		
		
		
		
	}
	
	public static SingleLinkedList deleteDuplicates(SingleLinkedList head)
	{
		SingleLinkedList q = head;
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

	public static SingleLinkedList insertionInSortedOrder(SingleLinkedList head, int value) {
		SingleLinkedList newlist = new SingleLinkedList(value);
		SingleLinkedList temp= null;
		SingleLinkedList current = head;

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

	public static int nthNodeFromEnd(SingleLinkedList head, int n) {
		SingleLinkedList mainPtr = head;
		SingleLinkedList refPtr = head;
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
	public static SingleLinkedList reverseList (SingleLinkedList head, int m , int n)
	{
		SingleLinkedList prev= null;
		SingleLinkedList first =null;
		SingleLinkedList ftemp = head;
		int pos =0;
		
		while(ftemp !=null && pos<m)
		{
			first = ftemp;
			ftemp = ftemp.next;
		}
		
		
		SingleLinkedList current = null;
		SingleLinkedList temp = first;
		while (first != null && pos <n) {
			current = new SingleLinkedList(first.data);
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
	
	public static void deleteNode(SingleLinkedList node)
	{
		node.data= node.next.data;
		node.next= node.next.next;
	}
	// 1->2->3
	public static SingleLinkedList reverseLinkedList(SingleLinkedList head) {
		SingleLinkedList prev = null;
		SingleLinkedList temp = head;
		SingleLinkedList current = null;
		while (temp != null) {
			current = new SingleLinkedList(temp.data);
			current.next = prev;
			prev = current;
			temp = temp.next;

		}
		return current;

	}

	public static void detectloop(SingleLinkedList head) {
		SingleLinkedList fastPtr = head;
		SingleLinkedList slowPtr = head;

		while (fastPtr.next.next != null && slowPtr.next != null) {
			if (fastPtr == slowPtr) {
				System.out.println("Yes");
				break;
			}
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;
		}
	}

	public static SingleLinkedList deleteuUsingPtr(SingleLinkedList next) {

		next.data = next.next.data;
		next.next = next.next.next;

		return next;
	}

	public static int middleOfLinkedList(SingleLinkedList head) {

		SingleLinkedList fastPtr = head;
		SingleLinkedList slowPtr = head;

		if (head != null) {
			while (fastPtr.next.next != null && slowPtr != null) {
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
			}
		}
		return slowPtr.data;
	}

	public static int searchPostion(SingleLinkedList head, int data) {
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

	public static void printList(SingleLinkedList list) {
		while (list != null) {
			System.out.print(list.data);
			if (list.next != null)
				System.out.print("->");
			list = list.next;
		}
	}

	public static SingleLinkedList deletion(SingleLinkedList head, int data) {

		if (head.data == data) {
			head = head.next;
			return head;
		}
		SingleLinkedList q = head;
		SingleLinkedList prev = q;
		while (q != null) {
			if (q.data == data) {
				prev.next = q.next;
			}
			prev = q;
			q = q.next;
		}
		return head;
	}

	public static SingleLinkedList insertionAtMiddle(SingleLinkedList list, int data,
			int afterpos) {
		SingleLinkedList newlist = list;
		if (list == null) {
			newlist = new SingleLinkedList(data, null);
		}

		//int position = 0;
		for (int i = 0; i < afterpos - 1; i++) {
			list = list.next;
			//position++;
		}

		SingleLinkedList temp = new SingleLinkedList(data);
		//temp.next = list.next.next;
		temp.next = list;
		list.next = temp;

		return newlist;
	}

	public static SingleLinkedList insertionAtBegin(SingleLinkedList list, int data) {
		SingleLinkedList newlist = null;

		if (list == null) {
			newlist = new SingleLinkedList(data);
			newlist.next = null;
		} else {
			newlist = new SingleLinkedList(data, list);
		}
		return newlist;
	}

	public static SingleLinkedList insertionAtEnd(SingleLinkedList list, int data) {
		SingleLinkedList newlist = list;
		if (list == null) {
			newlist = new SingleLinkedList(data);
			newlist.next = null;
		} else {
			while (list.next != null) {
				list = list.next;

			}
			list.next = new SingleLinkedList(data, null);
		}
		return newlist;
	}

}
