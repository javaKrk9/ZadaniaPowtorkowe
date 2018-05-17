package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Zad5 {

    //5. Piszemy metodê dzia³aj¹c¹ podobnie, jak metoda z zadania poprzedniego, z tym¿e bêdzie dodatkowo przyjmowa³a parametr,
    // decyduj¹cy o tym, ile najd³u¿szych stringów z listy chcemy wybraæ.


    public static void main(String[] args)
    {

        //Scanner sc = new Scanner(System.in);
        String testString= "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi ac eleifend sapien. Fusce interdum lectus id dictum condimentum. Nulla eget efficitur velit. Praesent sed augue sollicitudin, scelerisque lectus at, eleifend erat. In semper semper diam, ac viverra nunc rhoncus ut. Proin ac convallis urna.";
        //testString = sc.next();
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(testString.split(" ")));

        getLongestStrings(stringList,5).forEach(System.out::println);

    }

    private static ArrayList<String> getLongestStrings(ArrayList<String> stringList, int howMany)
    {
        stringList.sort(Comparator.comparing(String::length).reversed());
        if(howMany>stringList.size()) return stringList;
        return (ArrayList<String>)stringList.subList(0,howMany).stream().collect(Collectors.toList());
    }

}
