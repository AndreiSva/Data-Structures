package com.company;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;

public class Graph
{
    int Number;
    boolean [] [] graph;



    public Graph(int Number){
        this.Number = Number;
        graph = new boolean[Number][Number];

        int i = 0;
        while(i < Number){

            int y = 0;
            while(y < Number){

                graph[i][y] = false;


                y++;
            }
            i++;

        }
    }

    public void AddEdge(Node a, Node b){

        graph[a.index][b.index] = true;
        graph[b.index][a.index] = true;
    }

    public void Print() {

        for(int b = 0; b<Number;b++){

            for(int j = 0;j<Number;j++)
            {
                System.out.print(graph[b][j]+" ");

            }
            System.out.println();
        }

    }

}
