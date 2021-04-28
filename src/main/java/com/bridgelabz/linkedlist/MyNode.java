package com.bridgelabz.linkedlist;

public class MyNode<K> {

    private K key;
    private MyNode<Integer> next ;

    public MyNode(K key) {
        this.key = key ;
        this.next = null ;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
    public MyNode<Integer> getNext() {
        return next;
    }

    public void setNext(MyNode<Integer> next) {
        this.next = next;
    }
}