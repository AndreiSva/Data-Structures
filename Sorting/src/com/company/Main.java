package com.company;

public class Main {

    public static void main(String[] args) {
        int[] testArray = {3,2,1,4,5};
        int[] testArray2 = {4,7,9,8,10};
        BubbleSort b = new BubbleSort();
        SelectionSort s = new SelectionSort();

        int[] output = b.bubble(testArray);
        int[] output2 = s.Selection(testArray2);
        for (int i=0; i<testArray.length;i++){
            System.out.println(output[i]);
        }
        System.out.println();
        for (int i=0; i<testArray2.length; i++){
            System.out.println(output2[i]);
        }
    }
}
