package com.le.linkedlist;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}

}
public class LLPrintbyRecursion{

	public static void main(String args[]){

			Node head = new Node(10);
			// Node temp1 = new Node(20);
			// head.next  = temp1;
			// Node temp2 = new Node(30);
			// temp1.next = temp2;
			 iterate(head);
// 			 Node newHead = insertAtBegining(null,0);
// 			 iterate(newHead);
// 			 newHead = insertAtBegining(head,0);
// 			 iterate(newHead);
// 			 newHead = insertAtEnd(null,20);
// 			 iterate(newHead);
// 			newHead = insertAtEnd(newHead,20);
// iterate(newHead);
			 Node newHead = deleteAtBegining(head);
			 iterate(newHead);
 	}

	private static void iterate(Node node){
		if(node==null)
			return;
		System.out.println(node.data);
		// if(node.next==null)
		// 	return ;
		
		iterate(node.next);
	}
	private static Node insertAtBegining(Node node,int data){
		System.out.println("insertAtBegining ,data = "+data);
		Node n = new Node(data);
		// if(node==null)
		// {
			
		// 	return n;
		// }
		
		
		n.next=node;
		//retur new head
		return n;
	}
	private static Node insertAtEnd(Node head,int data){
		System.out.println("insertAtEnd, data="+data);
		Node n = new Node(data);
		if(head==null)
		{
			
			return n;
		}
		Node curr = head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=n;
		//retur new head
		return head;
	}
	private static Node deleteAtBegining(Node head){
		System.out.println("deleteAtBegining");
		
		if(head==null)
		{
			
			return head;
		}
		
		head = head.next;
		//retur new head
		return head;
	}

}