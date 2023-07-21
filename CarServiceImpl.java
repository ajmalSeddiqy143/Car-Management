package Day15PProject;

import Day15.Student;

import java.util.Scanner;

public class CarServiceImpl implements CarSeervice {
    //////////////////////////////////////////////////////////
    public static final int MAX_CAR=30; //total number of cars in dealer

    /////////
    public static Car[] carList= new Car[MAX_CAR];

    ///////////////
    public static int numCar=0;



    //////////////////////////////////////////////////////////////////
    @Override
    public void addCar(Scanner scan) {

        if (numCar>=MAX_CAR){
            System.out.println("Sorry The Dealership is full");
            return;

        }
        System.out.println("Enter Car Make: ");//make,model,year,color//price
        String make=scan.nextLine();
        scan.nextLine();


        System.out.println("Enter Car Model: ");
        String model=scan.nextLine();

        System.out.println("Enter Car Year: ");
        int year=scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Car Color: ");
        String color=scan.nextLine();

        System.out.println("Enter Car Price");
        int price=scan.nextInt();
        scan.nextLine();

        Car car=new Car(make,model,year,color,price);
        carList[numCar++]=car;
        System.out.println("Car added successfully ! ");



    }

    @Override
    public void removeCar(Scanner scan) {
        if (numCar == 0){
            System.out.println("No Car to remove ! ");
            return;
        }
        System.out.println("Enter the index of Car to remove. " +(numCar -1)+" ");
        int index=scan.nextInt();

        if (index>=0 && index < numCar){
            for (int i=index; i<numCar-1;i++){
                carList[i]=carList[i+1];
            }
            carList[numCar-1]=null;
            numCar--;
            System.out.println("Car Removed Successfully");
        }else {
            System.out.println("Invalid Index, No Car Removed. ");
        }


    }

    @Override
    public void readCar() {
        if (numCar == 0) {
            System.out.println("No Car in the class.");
            return;
        }
//
        System.out.println("***************Student List***********************");
        for (int i = 0; i < numCar; i++) {
            System.out.print((i+1)+". ");
            System.out.println(carList[i]);

        }

    }

    @Override
    public void updateCar(Scanner scan) {
        if (numCar==0){
            System.out.println("No Car found. ");
            return;
        }
        System.out.println("Enter the index of Car to update (0 to "+(numCar -1)+"): ");

        int index=scan.nextInt();

        if (index>=0 && index<numCar){
            System.out.println("Enter Car new Make: ");
            String newCarMake=scan.nextLine();


            System.out.println("Enter new Model for Car: ");
            String newCarModel=scan.nextLine();

            System.out.println("Enter new Year for Car: ");
            int newCarYear=scan.nextInt();

            System.out.println("Enter new Color for Car: ");
            String newCarColor= scan.nextLine();

            System.out.println("Enter New Price for Car: ");
            int newCarPice=scan.nextInt();
            scan.nextLine();

            Car updatedCar=new Car(newCarMake,newCarModel,newCarYear,newCarColor,newCarPice);
            carList[index]=updatedCar;
            System.out.println("Car Updated Successfully! ");
        }else {
            System.out.println("Invalid Index,No Car Updated");
        }

    }
}
