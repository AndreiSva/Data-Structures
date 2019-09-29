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

        g.AddEdge(A,B);
        g.AddEdge(A,C);
        g.AddEdge(B,D);
        g.AddEdge(B,E);
        g.AddEdge(C,D);
        g.AddEdge(C,F);
        g.AddEdge(F,D);
        g.AddEdge(F,C);

        g.bfs(A);




    }
}
