/**
 * Created by cjm on 8/29/16.
 */
public class OrderDrive {

    public static void main(String[] args) {
        Order order = new Order(1);

        System.out.println(order);
        order.register();
        System.out.println(order);
        order.draftPattern();
        System.out.println(order);

        order = new Order(1);
        order.register();
        System.out.println(order);
    }
}
