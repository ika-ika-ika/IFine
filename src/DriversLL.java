import java.time.LocalDate;
import java.util.LinkedList;
public class DriversLL extends Violation {

    Driver firstDriver;

    public class Driver {
        Driver nextDriver;
        String fullName;
        String typeOfCar;
        int yearOfBirth;
        public Driver (String fullName, int yearOfBirth, String typeOfCar){
            this.fullName = fullName;
            this.typeOfCar = typeOfCar;
            this.yearOfBirth = yearOfBirth;

        }
    }


    public void addDriver(String fullName, int yearOfBirth, String typeOfCar) {
        if (firstDriver==null) {
            firstDriver = new Driver(fullName, yearOfBirth, typeOfCar);
            System.out.println("Added a first driver "+fullName+" aged "+(2022-yearOfBirth)+" who drives a "+typeOfCar);
            return;
        }
        Driver current = firstDriver;
        while (current.nextDriver !=null) {
               current = current.nextDriver;
        }
        current.nextDriver = new Driver (fullName, yearOfBirth, typeOfCar);
        System.out.println("Added a driver "+fullName+" aged "+(2022-yearOfBirth)+" who drives a "+typeOfCar);
    }

    public void removeDriver (String fullName){
       if (firstDriver==null) {
           return;
       }
       if (firstDriver.fullName .equals (fullName)){
           firstDriver = firstDriver.nextDriver;
           System.out.println("Removed first driver in list! Named "+fullName);
           return;
       }
       Driver current = firstDriver;
       while (current.nextDriver != null){
           if (current.nextDriver.fullName .equals (fullName)) {
               current.nextDriver = current.nextDriver.nextDriver;
               return;
           }
           current = current.nextDriver;
           System.out.println("Removed  driver in the list! Name "+fullName);
       }

    }


//    LinkedList<ParkingFine> parkingFines = new LinkedList<>();
//    LinkedList<TrafficFine> trafficFines = new LinkedList<>();

    int getFines (String fullName){
        return 0;
    }
    public static void searchDriver(String fullName) {
    }







}
