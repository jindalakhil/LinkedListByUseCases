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
}