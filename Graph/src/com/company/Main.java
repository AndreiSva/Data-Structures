package com.company;

public class Main {
    
    public static void main(String[] args) {

        //Graph g = new Graph(5);
        GraphList g = new GraphList(6);

        Node A = new Node("A",0);
        Node B = new Node("B",1);
        Node C = new Node("C",2);
        Node D = new Node("D",3);
        Node E = new Node("E",4);
        Node F = new Node("F",5);

        g.AddEdge(A,B, 5);
        g.AddEdge(A,C,10);
        g.AddEdge(C,E,3);
        g.AddEdge(B,D,1);
        g.AddEdge(B,E,4);

        g.mst(A);




    }
}
