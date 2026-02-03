package com.arham.foundations.concepts;

public class C030_StaticDemo {
    public static void main(String[] args) {
        C030_StaticDemo_Class friend1 = new C030_StaticDemo_Class("Spongebob");
        C030_StaticDemo_Class friend2 = new C030_StaticDemo_Class("Patrick");
        C030_StaticDemo_Class friend3 = new C030_StaticDemo_Class("Squidward");
        C030_StaticDemo_Class friend4 = new C030_StaticDemo_Class("Sandy");
        C030_StaticDemo_Class friend5 = new C030_StaticDemo_Class("Gary");

        System.out.println(friend1.name);
        System.out.println(C030_StaticDemo_Class.numOfFriends);

        System.out.println(friend2.name);
        System.out.println(C030_StaticDemo_Class.numOfFriends);

        System.out.println(friend3.name);
        System.out.println(C030_StaticDemo_Class.numOfFriends);

        System.out.println(friend4.name);
        System.out.println(C030_StaticDemo_Class.numOfFriends);

        C030_StaticDemo_Class.showFriends();

    }
}
