public class Main {
    public static void main(String[] args) {
        System.out.println("Testing iFine implementation!");
        ParkingFine ParkingFineList = new ParkingFine();
        DriversLL myListDrivers = new DriversLL();

        myListDrivers.addDriver  ("John Smith", 1953, "SUV");
        myListDrivers.addDriver  ("John Lennon", 1941, "car");
        myListDrivers.addDriver  ("Ringo Starr", 1995, "semi-truck");
        myListDrivers.addDriver  ("Paul McCartney", 2010, "car");
        myListDrivers.addDriver  ("Eleanor Rigby", 1980, "limousine");
        myListDrivers.addDriver ("Lindsey Lohan", 1988, "jeep");
        myListDrivers.removeDriver("John Smith");


//        myListDrivers.setViolation ("John Smith", 100);
//        myListDrivers.setViolation ("John Lennon");
//        myListDrivers.setViolation ("John Lennon", 200);
//        myListDrivers.setViolation ("Ringo Starr", 120);
//        myListDrivers.setViolation ("Ringo Starr", 130);
//        myListDrivers.setViolation ("Paul McCartney");
//        myListDrivers.setViolation ("Paul McCartney");
//        myListDrivers.setViolation ("Paul McCartney");
//        myListDrivers.setViolation ("Eleanor Rigby", 66);
//        myListDrivers.setViolation ("Eleanor Rigby", 86);
//        myListDrivers.setViolation ("Eleanor Rigby", 96);
//        myListDrivers.setViolation ("Eleanor Rigby", 96);
//        myListDrivers.setViolation ("Lindsey Lohan", 55);







        TrafficViolation.addTrafficFine ("John Smith", "city", 100);
        TrafficViolation.addTrafficFine ("John Smith", "country", 120);
        TrafficViolation.addTrafficFine ("John Lennon", "country", 80);
        TrafficViolation.addTrafficFine ("John Lennon", "country", 200);
        TrafficViolation.addTrafficFine ("Ringo Starr", "city", 130);
        TrafficViolation.addTrafficFine ("Ringo Starr", "city", 90);
        TrafficViolation.addTrafficFine ("Ringo Starr", "city", 80);
        TrafficViolation.addTrafficFine("Paul McCartney", "city", 70);
        TrafficViolation.addTrafficFine ("Paul McCartney", "city", 80);
        TrafficViolation.addTrafficFine ("Paul McCartney", "city", 90);
        TrafficViolation.addTrafficFine ("Eleanor Rigby", "country", 170);
        TrafficViolation.addTrafficFine ("Paul McCartney", "city", 70);
        TrafficViolation.addTrafficFine ("Lindsey Lohan", "city", 99);
        ParkingViolation.addParkingFine ("John Smith");
        ParkingViolation.addParkingFine ("John Lennon");
        ParkingViolation.addParkingFine ("Ringo Starr");
        ParkingViolation.addParkingFine ("Ringo Starr");
        ParkingViolation.addParkingFine ("Ringo Starr");
        ParkingViolation.addParkingFine ("Paul McCartney");
        ParkingViolation.addParkingFine ("Paul McCartney");
        ParkingViolation.addParkingFine ("Paul McCartney");
        ParkingViolation.addParkingFine ("Paul McCartney");
        ParkingViolation.addParkingFine ("Eleanor Rigby");
        ParkingViolation.addParkingFine ("Lindsey Lohan");
        ParkingViolation.addParkingFine ("Lindsey Lohan");
        ParkingViolation.addParkingFine ("Lindsey Lohan");
        ParkingViolation.addParkingFine ("Lindsey Lohan");
        DriversLL.searchDriver("John Smith");
        DriversLL.searchDriver("Paul McCartney");

        ParkingViolation a = new ParkingViolation();
        a.trafficViolation();
        System.out.println(a.trafficViolation());


    }
}