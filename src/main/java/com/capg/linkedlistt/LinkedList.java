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
}