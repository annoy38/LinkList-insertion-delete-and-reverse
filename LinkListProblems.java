package MainPackage;

//import LinkListProblems.MainLinkListClass.node;

public class LinkListProblems {
	
	node head;
	private int size=0;
	class node{
		int data;
		node next;
		node(int data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	public void addFirst(int data) {
		node newNode = new node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		node newNode = new node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		node currentNode=head;
		while(currentNode.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next = newNode;
		
	}
	
	public void delFirst() {
		node currentNode=head;
		head = currentNode.next;
		printList();
		size--;
	}
	
	public void delLast() {
		if(head==null) {
			System.out.println("List is Empty");
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		node secondLast=head;
		node lastNode = head.next;
		while(lastNode.next!=null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
		printList();
		
	}

	public void printList() {
		if(head==null) {
			System.out.println("List is empty ");
		}
		node currentNode=head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+"-> ");
			currentNode = currentNode.next;
		}
		System.out.println("NULL");
	}
	
	public void delGiverPosition(int p) {
		if(head.next==null) {
			return;
		}
		
		if(size==p) {
			head= head.next;
			return;
		}
		
		int count=1;
		int position = size-p;
		node currentNode=head;
	//	node pre = head.next;
		while(currentNode!=null) {
			if(count==position) {
				currentNode.next= currentNode.next.next;
				return;
			}
			else {
			currentNode = currentNode.next;
			//pre = pre.next;
			count++;
			}
		}
	}
	
	public void reverseList() {
		if(head==null||head.next==null) {
			return;
		}
		node pre=head;
		node current=head.next;
		
		while(current!=null) {
			node nextNode=current.next;
			current.next=pre;
			pre=current;
			current=nextNode;
		}
		head.next=null;
		head=pre;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkListProblems list = new LinkListProblems();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.printList();
		//System.out.println(list.size);
				list.printList();
				list.delGiverPosition(2);
		list.reverseList();
		list.printList();
		
		
		
	}

}
