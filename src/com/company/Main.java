package com.company;

public class Main {

    public static MainMenu mainMenu;

    public static void main(String[] args){

        Vehicle vehicle = new Vehicle();
        mainMenu = new MainMenu();
        mainMenu.createCar();

        System.out.println("The current vehicle is a " + vehicle.getYear() + " " + vehicle.getMake() + " " + vehicle.getModel() );


    }
}
