package com.javarush.task.pro.task10.task1006;

/* 
Кто тут наследник?
*/

public class Solution {


    public Solution() {
    }

    public static void main(String[] args) {
            HybridCar hybridCar = new HybridCar();
            String car1 = "HybridCar";
            GasCar gasCar = new GasCar();
            String car2 = "GasCar";
            ElectricCar electricCar = new ElectricCar();
            String car3 = "ElectricCar";
    }
}
