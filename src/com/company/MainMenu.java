package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void createCar(){

        System.out.println("what kind of car would you like to create?");
        System.out.println("1: custom car. \n2: Ready to go car. \n3: Exit.");

        try{
            switch(input.nextInt()) {

                case 1:
                    Car car = new Car();
                    car.getCarInfo();
                    menu(car);
                    //Custom car
                    break;
                case 2:
                    Vehicle vehicle = new Vehicle();
                    vehicle.getVehicleInfo();
                    //Pre-made car
                    break;
                case 3: System.exit(0);
                    //Exit
                    break;
            }
        }catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("please enter a number between 1 and 3.");

        }
    }
    public void menu (Car car) {

        System.out.println("what would you like to do with the " + car.getMake() + " " + car.getModel() + " " + "?");

        System.out.println("1: Accelerate \n 2: Decelerate \n 3: Fill up with gas \n 4: Exit");


        try{
            switch(input.nextInt()) {

                case 1:
                    car.driveCar(car);
                    //accelerate
                    break;
                case 2:
                    car.stopCar(car);
                    //decelerate
                    break;
                case 3:
                    car.addGas(car);
                    //fill car with gas.
                    break;
                case 4:
                    System.exit(0);
                    //Exit program
                    break;
                default:
                    System.out.println("Please chose one of the options above. Please enter a number 1 - 4 ");
                }

            }catch (InputMismatchException ime) {
                input.nextLine();
                System.out.println("please enter a number between 1 and 4.");

        }
    }
}
