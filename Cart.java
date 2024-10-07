public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }
    public void requestCart() {
        System.out.println("Cart service is requesting " + numberOfCarts + " luggage carts");
    }
    @Override
    public void HotelService() {
        requestCart();
    }
}
