package com.company;

public class Zad2 {


    //2. Napiszmy metodê, która zadzia³a podobnie jak metoda z zadania poprzedniego,
    // z tym¿e dodatkowo przyjmie parametr, który bêdzie decydowa³ o tym,
    // czy chcemy wypisywaæ elementy na pozycjach parzystych, czy nieparzystych.

    public static void main(String[] args)
    {

        int[] arrayInt = {2,5,75,3,3,5,7,2,1,6,8,84,20,485,35,2,76,9};
        printEverySecondElement(arrayInt, true);

    }

    private static void printEverySecondElement(int[] arrayInt, boolean odd)
    {
        int start = odd?0:1;

        for(int i=start; i<arrayInt.length; i++)
        {
            System.out.println(arrayInt[i]);
            i++;
        }

    }


}
