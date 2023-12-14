
public class doublyLinkedList {

	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	Node head;
	
	 doublyLinkedList() {
	        head = null;
	    }
	
	public void addLast(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			temp.next=newNode;
			newNode.prev=temp;
			
		}
	}
	
	public void printList()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	public void addfirst(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
		}else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	
	public void addMiddle(int data,int index)
	{
		Node newNode=new Node(data);
		
		Node temp =head;
		int counter=1;
		while(counter<index)
		{
			temp=temp.next;
			counter++;
		}
		
		newNode.next=temp.next;
		newNode.prev=temp;
		temp.next=newNode;
		
	   // System.out.println(temp.data);
		
	}
	
	
	public void deleteLast()
	{
		Node temp= head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=null;
		
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List under flow");
		}
		else
		head=head.next;
	}
	
	public void deleteData(int data)
	{
		Node temp=head;
		while(temp.next.data!=data)
		{
			temp=temp.next;
			if(temp.next==null)
			{
				System.out.println("Data not Found");
				return;
			}
			
		}
		
		
		temp.next=temp.next.next;
		temp.next.prev=temp;
	}
	
	
	
	void sortList()
	{
		Node current=head;
		Node index=null;
		if(head==null)
		{
		   System.out.println("List Under Flow");
		}
		while(current!=null)
		{
			index=current.next;
			while(index!=null)
			{
				if(current.data>index.data)
				{
					int temp=current.data;
					current.data=index.data;
					index.data=temp;
					
				}
				index=index.next;
			}
			current=current.next;
		}
	}
	
	void sortByBubbleSort()
	{
		Node current,temp;
		
		for(current=head;current!=null;current=current.next)
		{
			for(temp=current.next;temp!=null;temp=temp.next)
			{
				if(current.data>temp.data)
				{
					int big=current.data;
					current.data=temp.data;
					temp.data=big;
				}
				
			}
		}
	}
	
	void sortBySelection()
	{

         Node current,temp,min;
         
         for(current=head;current!=null;current=current.next)
         {
        	 min=current;
        	 for(temp=current.next;temp!=null;temp=temp.next)
        	 {
        		 if(temp.data<min.data)
        		 {
        			 min=temp;
        		 }
        	 }
        	 int value=current.data;
        	 current.data=min.data;
        	 min.data=value;
        	 
         }
		
	}
	
	
	public static void main(String[] args) {
		
		doublyLinkedList dl=new doublyLinkedList();
		dl.addLast(10);
		dl.addLast(20);
		dl.addLast(60);
		dl.addLast(15);
		dl.addLast(40);
		dl.addLast(11);
		//dl.addfirst(50);
		//dl.addMiddle(60,3);
		//dl.deleteLast();
		//dl.deleteLast();
		//dl.deleteFirst();
		dl.deleteData(30);
		dl.printList();
		System.out.println("After sorting");
		//dl.sortByBubbleSort();
		dl.sortBySelection();
		dl.printList();
	}
	
}