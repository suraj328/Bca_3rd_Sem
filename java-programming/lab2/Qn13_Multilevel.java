package com.company;


import java.util.Scanner;

//13) Create a class Vehicle with data members: VNo, no_of_wheel and max_speed.
//Derive another class Passenger with data member: no_of_passengers. Derive two
//other classes Bus(with route, fare_per_person and helper_name) and Taxi (with
//fare_per_km as data member). Write a program to use these classes (multilevel).
class Vehicle{
    int VNo;
    int no_of_wheel;
    int max_speed;
    Scanner sc= new Scanner(System.in);
    Vehicle(){
        System.out.println("Enter VNo: ");
        VNo= sc.nextInt();
        System.out.println("Enter no_wheels: ");
        no_of_wheel=sc.nextInt();
        System.out.println("Enter max speed: ");
        max_speed= sc.nextInt();
    }

    public void displayVehicle(){
        System.out.println("The vehicle number is: "+VNo);
        System.out.println("The  number of wheel is: "+no_of_wheel);
        System.out.println("max speed of Vehicle is: "+max_speed);
    }
}
class Passenger extends Vehicle{
    int no_of_passengers;
    Passenger(){
        System.out.println("Enter number of Passenger");
        no_of_passengers= sc.nextInt();
    }

    public void displayPassengers(){
        System.out.println("The number of passenger in vehicle is "+no_of_passengers);
    }
}
class Bus extends Passenger{
    String route;
    String helper_name;
    int fare_per_person;
    Bus(){
        System.out.println("Enter Your BUs route");
        route=sc.next();
        System.out.println("Enter Your Helper Name");
        helper_name=sc.next();
        System.out.println("Enter Your Bus fare_per_person");
        fare_per_person= sc.nextInt();
    }
    public void displayBus(){
        System.out.println("Bus route is"+route);
    }
}
class Taxi extends Passenger{
    int fare_per_km;
    Taxi(){
        System.out.println("Enter taxi fare_per_km");
        fare_per_km= sc.nextInt();
    }
    public void displayTaxi(){
        System.out.println("The  Taxi fare_per_km: "+fare_per_km);
    }

}
public class Qn13_Multilevel {
    public static void main(String[] args) {
        System.out.println("-----------------------------For Bus-----------------");
         Bus B1=new Bus();
        System.out.println("-----------------------------For Taxi------------------");
        Taxi T2= new Taxi();
        System.out.println("****************Stored Result Of Bus****************");
        B1.displayVehicle();
        B1.displayPassengers();
        B1.displayBus();
        System.out.println("*****************Stored Result Of Taxi***************");
        T2.displayVehicle();
        T2.displayPassengers();
        T2.displayTaxi();
    }
}
