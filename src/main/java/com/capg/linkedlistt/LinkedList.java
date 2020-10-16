package com.capg.linkedlistt;

public class LinkedList<K> {
	
	public INode<K> head;
	public INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode<K> node)
	{
		if(this.head==null) {
			this.head= node;
			this.tail= node;
		}
		else {
			INode<K> temp = this.head;
			this.head = node;
			this.head.setNext(temp);
		}
	}
	
	public void append(INode<K> Node) {
		if (head == null) {
			head = Node;
			return;
		}
		INode<K> temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(Node);
		return;
	}
	
	public void insert(INode<K> pre, INode<K> newNode, INode<K> next) {
		pre.setNext(newNode);
		newNode.setNext(next);
	}
	
	public INode<K> Pop() {
		if (head == null)
			return head;
		INode<K> temp = head.getNext();
		head.setNext(temp);
		head = temp;
		return head;
	}
}