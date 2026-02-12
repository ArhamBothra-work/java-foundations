package com.arham.foundations.concepts;

import java.util.ArrayList;
import java.util.Collections;

public class C042_ArrayListDemo {
    public static void main() {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);

        list.remove(0);
        list.set(1,3);

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());


        Collections.sort(list);

        for(int i : list){
            System.out.println(i);
        }
    }
}
