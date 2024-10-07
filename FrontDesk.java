public class FrontDesk {
    public void requestValetService(String plateNumber) {
        Valet valet = new Valet(plateNumber);
        valet.HotelService();
    }
    public void requestHouseKeepingService(int roomNumber) {
        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.HotelService();
    }
    public void requestCartService(int numberOfCarts) {
        Cart cart = new Cart(numberOfCarts);
        cart.HotelService();
    }
}
