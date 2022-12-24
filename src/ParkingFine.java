public class ParkingFine implements IFine {
    @Override
    public int chargeable() {
        return 0;
    }

    @Override
    public void fineCalculations(int price) {

    }
}
