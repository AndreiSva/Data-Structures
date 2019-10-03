package com.company;

public class BubbleSort
{
    public int[] bubble(int[] array){
        int lenght = array.length;
        for (int i = 0; i<lenght-1;i++)
        {
            for(int j = 0; j<=lenght-1-j;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }

    }
    return array;
}
}
