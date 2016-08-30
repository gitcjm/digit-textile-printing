/**
 * Created by cjm on 8/29/16.
 */
public class OrderDrive {

    public static void main(String[] args) {
        Order order = new Order(1);

        System.out.println(order);
        order.register();
        order.register();
        order.draftPattern();
        order.draftPattern();
        order.printDraft();
        order.printDraft();
        order.store();
        order.check();
        order.check();
        order.register();
        order.store();
        order.store();
        System.out.println(order);

        Order order2 = new Order(1);
        order2.register();


    }
}
