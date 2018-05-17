package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Zad6 {

    //6. Piszemy metodê reverseArray, która zwróci tablicê,
    // która bêdzie wynikiem odwrócenia kolejnoci elementów tablicy,
    // która jest przekazana jako parametr.

    public static void main(String[] args)
    {

        String testString= "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi ac eleifend sapien. Fusce interdum lectus id dictum condimentum. Nulla eget efficitur velit. Praesent sed augue sollicitudin, scelerisque lectus at, eleifend erat. In semper semper diam, ac viverra nunc rhoncus ut. Proin ac convallis urna.";

        //ArrayList<String> stringList = new ArrayList<>(Arrays.asList(testString.split(" ")));
        String[] testStringArray = testString.split(" ");

        Arrays.asList(reverseArray(testStringArray)).stream().forEach(System.out::println);

    }

    private static String[] reverseArray(String[] array)
    {
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(array));
        stringList.sort(Comparator.reverseOrder());
        return stringList.toArray(array);
    }


}
