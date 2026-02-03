package com.arham.foundations.concepts;

public class C029_ArrayOfObjectsDemo {
    static void main(String[] args) {
        C029_ArrayOfObjectsDemo_Class car1 = new C029_ArrayOfObjectsDemo_Class("Mustang","Red");
        C029_ArrayOfObjectsDemo_Class car2 = new C029_ArrayOfObjectsDemo_Class("Corvette","Blue");
        C029_ArrayOfObjectsDemo_Class car3 = new C029_ArrayOfObjectsDemo_Class("Charger","Yellow");

        C029_ArrayOfObjectsDemo_Class[] cars = {car1,car2,car3};

//        for(int i = 0; i < cars.length; i++){
//            cars[i].drive();
//        }


        for(C029_ArrayOfObjectsDemo_Class car : cars){
            car.drive();
        }

        System.out.println();
        for(C029_ArrayOfObjectsDemo_Class car : cars){
            car.color = "black";
        }

        for(C029_ArrayOfObjectsDemo_Class car : cars){
            car.drive();
        }
    }


}
