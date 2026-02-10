package com.arham.foundations.concepts;

public class C039_GetterSetterDemo {
    public static void main(String[] args) {

        C039_Car car = new C039_Car("Charger" , "Yellow", 10000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        car.setColor("Blue");
        car.setPrice(-6700);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}

class C039_Car{
    private String model;
    private String color;
    private int price;

    C039_Car(String model, String color, int price){
        this.color = color;
        this.model = model;
        this.price = price;
    }
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String  getPrice(){
        return "$" + this.price;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if(price < 0){
            System.out.println("Price cannot be less than zero");
        }
        else {
            this.price = price;
        }
    }
}
