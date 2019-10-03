package com.Nocompany;

public class Main {

    public static void main(String[] args) {

        Tree c11 = new Tree (2);
        Tree stub11 = new Tree(4);
        Tree stub12 = new Tree(5);

        Tree c12 = new Tree(3);
        Tree stub21 = new Tree(6);
        Tree stub22 = new Tree(7);

        Tree root = new Tree(1);

        root.Left = c11;
        root.Right = c12;

        c11.Right = stub12;
        c11.Left = stub11;

        c12.Right = stub22;
        c12.Left = stub21;


    PreOrder(root);

    PostOrder(root);

    InOrder(root);


    }
    static void PreOrder(Tree root){

        if (root == null){
            return;
        }
        System.out.println(root.value);
        PreOrder(root.Left);
        PreOrder(root.Right);
    }
    //left right root
    static void PostOrder(Tree root){
        if (root == null){
            return;
        }
        PostOrder(root.Left);

        PostOrder(root.Right);

        System.out.println(root.value);
    }
    //left root right
    static void InOrder(Tree root){

        if (root == null){
            return;
        }
        PreOrder(root.Left);

        System.out.println(root.value);

        PreOrder(root.Right);
    }
}
