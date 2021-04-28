package com.bridgelabz.linkedlist;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //UC2 ADDING DATA
    public void add(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //UC3 APPENDING DATA
    public void append(INode newNode) {
        if(this.head == null)
            this.head = newNode;
        if(this.tail == null)
            this.tail = newNode;
        else {
            INode tempNode = this.tail;
            this.tail = newNode;
            tempNode.setNext(newNode);
        }
    }

    //UC4 INSERT DATA IN BETWEEN
    public void insert(INode myNode, INode newNode) {
        this.head.setNext(myNode);
        myNode.setNext(newNode);
    }

    //UC5 DELETE THE FIRST ELEMENT
    public INode pop() {
        INode  tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    //UC6 DELETE THE LAST ELEMENT
    public INode popLast(){
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = null;
        return tempNode;
    }

    //UC7 SEARCH LINKEDLIST TO FIND NODE WITH KEY 30
    public void search(INode myNode){
        INode tempNode = head;
        while (tempNode.getNext()!=myNode){
            tempNode=tempNode.getNext();
        }
        tempNode = tempNode.getNext();
        System.out.println("Searched Element is = " +tempNode.getKey());

    }
    //UC9 DELETE AND GET SIZE OF LINKED LIST
    public void delete(INode deleteNode) {
        INode tempNode1 = head;
        while (tempNode1.getNext() != deleteNode) {
            tempNode1 = tempNode1.getNext();
        }
        INode tempNode2 = tempNode1;
        tempNode1 = tempNode1.getNext();
        tempNode1 = tempNode1.getNext();
        tempNode2.setNext(tempNode1);
    }

    public void size(INode head) {
        int count = 0;
        INode node = head;
        while (node != null) {
            count++;
            node = node.getNext();
        }
        System.out.println("Size of LinkedList is: " + count);
    }

    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
