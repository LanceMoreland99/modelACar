package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void createCar(){

        Car car = new Car();
        car.getCarInfo();

        menu(car);
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
