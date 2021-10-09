package com.company;

public class GetCarFactory {
    public Car getCar(String carType){
        if (carType == null){
            return null;
        }
        else if (carType.equalsIgnoreCase("MAYBACH")){
            return new Maybach();
        }
        else if (carType.equalsIgnoreCase("LAMBO")){
            return new Lambo();
        }
        else{
            return null;
        }
    }
}
