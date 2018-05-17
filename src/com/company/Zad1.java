package com.company;

import java.util.Arrays;
import java.util.List;

public class Zad1 {

    //  1. Napiszmy metodê, która wypisze co drugi element tablicy przekazanej jako parametr.
    public static void main(String[] args)
    {

        Integer[] arrayInt = {2,5,75,3,3,5,7,2,1,6,8,84,20,485,35,2,76,9};
        printEverySecondElement(arrayInt);
        System.out.println();
        List<Integer> listTest = Arrays.asList(arrayInt);
        listTest
                .stream()
                .filter(c -> c%2 !=0)
                .forEach(c-> System.out.println(c));

    }

    private static void printEverySecondElement(Integer[] arrayInt)
    {
        for(int i=0; i<arrayInt.length; i++)
        {
            if(i%2==0)
            {
                System.out.println(arrayInt[i]);
            }
        }


    }


}
