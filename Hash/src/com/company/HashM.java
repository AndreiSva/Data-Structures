package com.company;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class HashM {
    int s = 6;
    ArrayList<Integer>[] list = new ArrayList[][s];

    int HashFunc(int key){
        return key % s;
    }

    void insert(int value){
        int k = HashFunc(value);
        if (list[k] == null){
            list[k] = new ArrayList<Integer>();
        }
        list[k].add(value);
    }

    void Print(int value){

        for(ArrayList A: list){

            if(A!=Null)
        }


    }
}
