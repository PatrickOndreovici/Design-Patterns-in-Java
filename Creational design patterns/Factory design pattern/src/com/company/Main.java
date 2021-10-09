package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GetCarFactory carFactory = new GetCarFactory();
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want a Maybach or Lambo ? ");
        String carType = in.nextLine();
        Car car = carFactory.getCar(carType);
        if (car == null){
            System.out.println("This car does not exist !");
        }
        else{
            System.out.println(car.toString());
        }
    }
}
