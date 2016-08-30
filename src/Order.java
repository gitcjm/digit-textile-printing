/**
 * Created by cjm on 8/29/16.
 */
public class Order {
    final static int UNREG_ORDER = 0;   // 未登记的订单,用途:登记订单时,检索该订单是否已登记(据订单号)
    final static int NEW_ORDER = 1;     // 新订单
    final static int DRAFTED = 2;       // 完成稿件
    final static int PRINTED = 3;       // 完成打样
    final static int QULIFIED = 5;      // 合格
    final static int UNQULIFIED = 6;    // 不合格
    final static int HAS_STORE = 7;     // 入库

    static int state = UNREG_ORDER;
    static int code = 0;
    static boolean pass = true;

    public Order(int code) {
        if (this.code == code) {
            System.out.println("The order has registered, that state is " + state);
        }
    }

    // 登记订单
    public void register() {
        switch (state) {
            case UNREG_ORDER:
                System.out.println("You registered a new order");
                state = NEW_ORDER;
                code = code + 1;
                break;
            case NEW_ORDER:
                System.out.println("You can't register, the order has registered");
                break;
            case DRAFTED:
                System.out.println("You can't register, the order has drafted");
                break;
            case PRINTED:
                System.out.println("You can't register, the order has printed");
                break;
            case QULIFIED:
                System.out.println("You can't register, the order has checked");
                break;
            case UNQULIFIED:
                System.out.println("You can't register, the order has checked");
                break;
            case HAS_STORE:
                System.out.println("You can't register, the order has stored");
                break;
        }
    }

    // 制作稿件
    public void draftPattern() {
        switch (state) {
            case UNREG_ORDER:
                System.out.println("You can't draft, the order hasn't registered");
                break;
            case NEW_ORDER:
                System.out.println("The order is drafted");
                state = DRAFTED;
                break;
            case DRAFTED:
                System.out.println("You can't draft, the order has drafted");
                break;
            case PRINTED:
                System.out.println("You can't draft, the order has printed");
                break;
            case QULIFIED:
                System.out.println("You can't draft, the order has checked");
                break;
            case UNQULIFIED:
                System.out.println("You can't draft, the order has checked");
                break;
            case HAS_STORE:
                System.out.println("You can't draft, the order has stored");
                break;
        }
    }

    // 打样
    public void printDraft() {
        switch (state) {
            case UNREG_ORDER:
                System.out.println("You can't print, the order hasn't registered");
                break;
            case NEW_ORDER:
                System.out.println("You can't print, the order is new");
                break;
            case DRAFTED:
                System.out.println("The order print complete");
                state = PRINTED;
                break;
            case PRINTED:
                System.out.println("You can't print, the order has printed complete");
                break;
            case QULIFIED:
                System.out.println("You can't print, the order has checked");
                break;
            case UNQULIFIED:
                System.out.println("You can't print, the order has checked");
                break;
            case HAS_STORE:
                System.out.println("You can't print, the order has stored");
                break;
        }
    }

    // 检验
    public void check() {
        switch (state) {
            case UNREG_ORDER:
                System.out.println("You can't check, the order hasn't registered");
                break;
            case NEW_ORDER:
                System.out.println("You can't check, the order is new");
                break;
            case DRAFTED:
                System.out.println("You can't check, the order is draft");
                break;
            case PRINTED:
                System.out.println("The order has checked");
                if (pass) {
                    state = QULIFIED;
                } else {
                    state = UNQULIFIED;
                }
                break;
            case QULIFIED:
                System.out.println("You can't check, the order has checked");
                break;
            case UNQULIFIED:
                System.out.println("You can't check, the order has checked");
                break;
            case HAS_STORE:
                System.out.println("You can't check, the order has stored");
                break;
        }
    }

    public void store() {
        switch (state) {
            case UNREG_ORDER:
                System.out.println("You can't store, the order hasn't registered");
                break;
            case NEW_ORDER:
                System.out.println("You can't store, the order is a new");
                break;
            case DRAFTED:
                System.out.println("You can't store, the order is drafted");
                break;
            case PRINTED:
                System.out.println("You can't store, The order is printed");
                break;
            case QULIFIED:
                System.out.println("The order is stored");
                state = HAS_STORE;
                break;
            case UNQULIFIED:
                System.out.println("You can't store, the order hasn't passed");
                break;
            case HAS_STORE:
                System.out.println("You can't store, the order has stored");
                break;
        }
    }

    public String toString() {
        String result = "\n";
        result = result + "Digit Textile Printing, Inc.\n";
        result = result + "Order " + code + " state is " + state + "\n";
        return result;
    }
}
