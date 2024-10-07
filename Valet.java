public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle() {
        System.out.println("Valet service is now picking up vehicle with the plate number of " + plateNumber);    
    }

    @Override
    public void HotelService() {
        pickUpVehicle();
    }
}

