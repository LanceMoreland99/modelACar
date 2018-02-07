package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

public class Car  extends Vehicle {

    private  Scanner input = new Scanner(System.in);

    private int speed = 0;
    private int gas = 100;

    public Car() {
        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGas(100);
    }




    public void setYear() {
        System.out.println("what is the year of the car you would like to make?");

        try{
            super.setYear(input.nextInt());
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("please enter a number for the year.");
        }
    }


    public void setMake() {
        System.out.println("what is the make of the car you would like to create?");
        super.setMake(input.nextLine());
    }


    public void setModel() {
        System.out.println("what is the model of the car you would like to create?");
        super.setModel(input.nextLine());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void getCarInfo(){
        System.out.println("The current car is a " + getMake() + " " + getModel() + " " + ". It is going " + getSpeed() + " MPH and has" + getGas() + "% of it's gas left.");
    }
    public void driveCar(Car car){


        for (int seconds = 0; seconds <= 5; seconds ++) {
            //Get current gas
            //Get current speed

            car.setSpeed(car.getSpeed() + 1);
            car.setGas(car.getGas() - 1);

            System.out.println("The " + car.getMake() + " " + car.getModel() + " " + "is currently going " + car.getSpeed() + " Mph" + " with " + car.getGas() + "% gas left");
        }
            mainMenu.menu(car);

    }
    public void stopCar(Car car) {

        for (int seconds = 0; seconds <=5; seconds ++) {
            //get current gas
            //get current speed

            car.setSpeed(car.getSpeed() - 1);
            car.setGas(car.getGas() - 1);

            System.out.println("The " + car.getMake() + " " + car.getModel() + " " + "is currently going " + car.getSpeed() + " Mph" + " with " + car.getGas() + "% gas left");

        }
            mainMenu.menu(car);

    }
    public void addGas(Car car){

        car.setGas(100);
        System.out.println("your " + car.getMake() + " " + car.getModel() + " now has a full tank");
        mainMenu.menu(car);

    }
}
