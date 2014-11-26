package linkedlists;

import java.util.*;

public class LinkedList {
  // Default related content
  Node head = null;
  Node tail = null;
  int size;
  
  public LinkedList(Node node) {
    this.head = node;
    this.tail = node;
    this.size = 1;
  }

  private void prependToList(Node node) {
    Node temp = head;
    head = node;
    node.next = temp;
    size++;
  }
  private void appendToList(Node node) {
    Node temp = tail;
    tail = node;
    temp.next = tail;
    size++;
  }
  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    Node currNode = head;
    for (int i = 0; i < (size - 1); i++) {
      s.append(currNode.value + " ");
      currNode = currNode.next;
    }
    return s.toString();
  }
  
    
  // Custom methods for exercises/practice
   
  
  // Implementation for a node in the linked list
  public class Node {
    Node next = null;
    Node prev = null;
    public int value;
    
    public Node(int value) {
      this.value = value;
    } 
    
    public void linkNext(Node node) {
      next = node;
    }
    public void linkPrev(Node node) {
      prev = node;
    } 
  }
}