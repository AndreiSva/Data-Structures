package com.company;

public class Node <T> {
    T v;
    int index;
    int lenght;
    boolean visited = false;

    public Node(T v, int index){

        this.index = index;
        this.v = v;
    }

    public Node(T v, int index, int lenght){

        this.lenght = lenght;
        this.index = index;
        this.v = v;
    }
}
