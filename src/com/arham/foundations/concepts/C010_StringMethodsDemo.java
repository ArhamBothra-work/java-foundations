package com.arham.foundations.concepts;

public class C010_StringMethodsDemo {
    public static void main (String[] args){

        String name = "Arham Bothra";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(0);
        System.out.println(letter);

        int index = name.indexOf(" ");
        System.out.println(index);

        int lastIndex = name.lastIndexOf("a");
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

//        name = "Arham          ";
        name = name.trim();
        System.out.println(name);
        name = name.replace("a","c");
        System.out.println(name);

        System.out.println(name.isEmpty());

        if (name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        if (name.contains(" ")){
            System.out.println("Your name contains a space");
        }

        if (name.equals("password")){
            System.out.println("Your name can't be password");
        }
    }
}
