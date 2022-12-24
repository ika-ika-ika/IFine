import java.util.Date;

public class TrafficViolation extends Violation implements IFine, iViolationDate
        {
// {
    public static void addTrafficFine(String johnSmith, String city, int i) {
    }


    @Override
    public Date getDate(){
        return new Date(20, 1, 1);
    }



    @Override
    public int chargeable() {
        return 0;
    }

    @Override
    public void fineCalculations(int price) {

    }

//    @Override
//    public int parkingViolation() {
//        return 0;
//    }
}
