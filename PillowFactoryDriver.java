public class PillowFactoryDriver {
    public static void main(String[] args) {
        Pillow[] orders = new Pillow[] {
            PlaceOrder.createOrder("polyster", "Down Pillow", "solid_color", "small", "back"),
            PlaceOrder.createOrder("latex", "Latex Pillow", "multi_color", "medium", "Sleeping"),
            PlaceOrder.createOrder("feather", "Soft Fibre Pillow", "embroided", "small", "back"),
            PlaceOrder.createOrder("cotton", "Pure Cotton Pillow", "embroided", "large", "Neck")
        };

        PillowStore store = new PillowStore(orders);
        Iterator<Pillow> iterator = store.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }
}
