package com.company;

public class NodeList {
    public int value;
    public int key;
    public NodeList next;

    public NodeList(int value, int key, NodeList next){
        this.value = value;
        this.key = key;
        this.next = next;
    }
}
