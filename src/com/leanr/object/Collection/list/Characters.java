package com.leanr.object.Collection.list;

import java.util.*;

public class Characters {
    public static void main(String[] args) {
        List<Character> characters = List.of('A','B','Z','B','F','Z');

        //Unique -set
        //TreeSet
        //HashSet
        //Linked Hash Set
        Set <Character> characters1 = new TreeSet<>(characters);
        System.out.println(characters1);

        Set <Character> characters2 = new HashSet<>(characters);
        System.out.println(characters2);

        Set <Character> characters3 = new LinkedHashSet<>(characters);
        System.out.println(characters3);
    }
}
