package com.company;

import java.beans.VetoableChangeListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphList {

    int Number;
    public ArrayList<Node> Vertices[];

    public GraphList(int Number)
    {
        Vertices = new ArrayList[Number];
        this.Number = Number;

        for(int i = 0; i<Number;i++){
            Vertices[i] = new ArrayList<Node>();
        }
    }

    public void bfs(Node start){

        Queue<Node> q = new LinkedList<Node>();
        q.add(start);
        start.visited = true;

        while(!q.isEmpty()){
            Node head = q.poll();
            System.out.println(head.v);
            for (Node item: Vertices[head.index])
            {
                System.out.print(item.v);
                if(item.visited != true){
                    item.visited = true;
                    q.add(item);

                }

            }
        }

    }

    public void AddEdge(Node v1, Node v2)
    {
        Vertices[v1.index].add(v2);
    }
}
