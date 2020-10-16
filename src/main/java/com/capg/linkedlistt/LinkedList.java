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
			this.head.setNext(node);
			this.head=node;
		}
	}
}