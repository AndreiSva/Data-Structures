package com.company;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node> {

    public int compare(Node o1, Node o2){

        if (o1.lenght > o2.lenght){
            return 1;
        }
        else if (o1.lenght < o2.lenght){
            return -1;
        }
        return 0;
    }
}
