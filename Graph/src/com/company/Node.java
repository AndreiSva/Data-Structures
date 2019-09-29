package com.company;

public class Node <T> {
    T v;
    int index;
    boolean visited = false;

    public Node(T v, int index){

        this.index = index;
        this.v = v;
    }
}
