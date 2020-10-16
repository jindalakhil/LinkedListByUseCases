package com.capg.linkedlistt;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {
		Node<Integer> firstNode = new Node<Integer>(1);
		Node<Integer> secondNode = new Node<Integer>(2);
		Node<Integer> thirdNode = new Node<Integer>(3);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result=firstNode.getNext().equals(secondNode)
				&&secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(result);
	}
}