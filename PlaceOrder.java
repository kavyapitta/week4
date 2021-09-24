public class PlaceOrder {
    public static Pillow createOrder(String stuffing, String name, String cover, String size, String pillowType){
        Pillow pillow = new Pillow(stuffing.toUpperCase(), name, cover.toUpperCase(), size.toUpperCase(), pillowType.toUpperCase());
        pillow.prepare();
        return pillow;
    }

}
