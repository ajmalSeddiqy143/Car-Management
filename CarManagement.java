package Day15PProject;

import Day15.StudentServiceImpl;

import java.util.Scanner;

public class CarManagement {
    public static void main(String[] args) {
//****************************************************************************************
        Scanner scanner=new Scanner(System.in);
        //now create object of the class
        CarServiceImpl crs=new CarServiceImpl();
        //
        int choice;
        do {
            System.out.println("--------------Welcome to Car management app-------------------");
            System.out.println("1- Add Car ");
            System.out.println("2- Remove Car ");
            System.out.println("3- Update Car ");
            System.out.println("4- Display All Cars ");
            ////
            System.out.println("Enter Your Choice !");
            choice=scanner.nextInt();

            switch (choice){
                case 1:
                    crs.addCar(scanner);
                    break;
                case 2:
                    crs.removeCar(scanner);
                    break;
                case 3:
                    crs.updateCar(scanner);
                    break;
                case 4:
                    crs.readCar();
                    break;
                case 5:
                    System.out.println("Exiting the program, Good Bye !!!");
                    break;
                default:
                    System.out.println("Invalid Choice Try Again! ");
            }

        }while (choice!=5);
        scanner.close();
        //*********************************************************************************************

    }
}
