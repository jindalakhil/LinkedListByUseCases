package com.capg.linkedlistt;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	 @Test
		public void addedToLinkedList() {
			Node<Integer> firstNode = new Node<>(1);
			Node<Integer> secondNode = new Node<>(2);
			Node<Integer> thirdNode = new Node<>(3);
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(firstNode);
			linkedList.add(secondNode);
			linkedList.add(thirdNode);
			boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode)
					&& linkedList.tail.equals(firstNode);
			Assert.assertTrue(result);
	}
	 
	 @Test
	 	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToLast() {
	 		Node<Integer> firstNode = new Node<>(70);
	 		Node<Integer> secondNode = new Node<>(30);
	 		Node<Integer> thirdNode = new Node<>(56);
	 		LinkedList<Integer> linkedList = new LinkedList<>();
	 		linkedList.append(firstNode);
	 		linkedList.append(secondNode);
	 		linkedList.append(thirdNode);
	 		boolean result = linkedList.head.equals(firstNode);
	 		Assert.assertTrue(result);
	 	}
	 
	 @Test
		public void popTest() {
			Node<Integer> firstNode = new Node<>(1);
			Node<Integer> secondNode = new Node<>(2);
			Node<Integer> thirdNode = new Node<>(3);
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(firstNode);
			linkedList.add(thirdNode);
			linkedList.add(secondNode);
			linkedList.Pop();
			boolean result = linkedList.head.equals(thirdNode);
			Assert.assertTrue(result);
		}
	 
	 @Test
		public void popLastTest() {
			Node<Integer> firstNode = new Node<>(1);
			Node<Integer> secondNode = new Node<>(2);
			Node<Integer> thirdNode = new Node<>(3);
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(firstNode);
			linkedList.add(thirdNode);
			linkedList.add(secondNode);
			linkedList.popLast();
			boolean result = linkedList.head.equals(secondNode) &&
							linkedList.head.getNext().equals(thirdNode);
			Assert.assertTrue(result);
		}
	 
	 @Test
		public void searchTest() {
			Node<Integer> firstNode = new Node<>(1);
			Node<Integer> secondNode = new Node<>(2);
			Node<Integer> thirdNode = new Node<>(3);
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(firstNode);
			linkedList.add(thirdNode);
			linkedList.add(secondNode);
			INode<Integer> search = linkedList.search(3);
			boolean result = search.equals(thirdNode);
			Assert.assertTrue(result);
		}
	 
	 @Test
		public void insertAfterKeyTest() {
			Node<Integer> firstNode = new Node<>(1);
			Node<Integer> secondNode = new Node<>(2);
			Node<Integer> thirdNode = new Node<>(3);
			Node<Integer> fourthNode = new Node<>(20);
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(firstNode);
			linkedList.add(thirdNode);
			linkedList.add(secondNode);
			linkedList.insertAfterKey(2, fourthNode);
			INode<Integer> search = linkedList.search(20);
			boolean result = search.equals(secondNode.getNext());
			Assert.assertTrue(result);
		}
}