package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Zad4 {

    //4. Piszemy metodê, która przyjmie za parametr listê stringów, a która zwróci listê zawieraj¹c¹ dwa najd³u¿sze stringi z tej listy.
    // Metodê piszemy w dwóch wersjach - przy u¿yciu pêtli, oraz strumienia.

    public static void main(String[] args)
    {

        //Scanner sc = new Scanner(System.in);
        String testString= "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi ac eleifend sapien. Fusce interdum lectus id dictum condimentum. Nulla eget efficitur velit. Praesent sed augue sollicitudin, scelerisque lectus at, eleifend erat. In semper semper diam, ac viverra nunc rhoncus ut. Proin ac convallis urna.";
        //testString = sc.next();
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(testString.split(" ")));

        getTwoLongestStrings(stringList).forEach(System.out::println);

    }

    private static ArrayList<String> getTwoLongestStrings(ArrayList<String> stringList)
    {
        if(stringList.size()<2) return stringList;

        stringList.sort(Comparator.comparing(String::length).reversed());

        return (ArrayList<String>)stringList.subList(0,2).stream().collect(Collectors.toList());
    }

}
