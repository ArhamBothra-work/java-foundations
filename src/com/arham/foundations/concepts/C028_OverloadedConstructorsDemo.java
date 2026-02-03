package com.arham.foundations.concepts;

public class C028_OverloadedConstructorsDemo {
    public static void main(String[] args) {

        C028_OverloadedConstructorsDemo_Class user1 = new C028_OverloadedConstructorsDemo_Class("Spongebob");
        C028_OverloadedConstructorsDemo_Class user2 = new C028_OverloadedConstructorsDemo_Class("Patrick","PStar@aol.com");
        C028_OverloadedConstructorsDemo_Class user3 = new C028_OverloadedConstructorsDemo_Class("Sandy","Sandy1@gmail.com",27);
        C028_OverloadedConstructorsDemo_Class user4 = new C028_OverloadedConstructorsDemo_Class();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
