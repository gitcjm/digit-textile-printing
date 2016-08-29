/**
 * Created by cjm on 8/29/16.
 */
public class Order {
    final static int UNREG_ORDER = 0;   // 未登记的订单,用途:登记订单时,检索该订单是否已登记(据订单号)
    final static int NEW_ORDER = 1;     // 新订单
    final static int DRAFTED = 2;       // 完成稿件
    final static int PRINTED = 3;       // 完成打样
    final static int BURNED = 4;        // 完成烫样
    final static int QULIFIED = 5;      // 合格
    final static int UNQULIFIED = 6;    // 不合格
    final static int HAS_STORE = 7;     // 入库

    static int state = UNREG_ORDER;
    static int code = 0;

    public Order(int code) {
        if (this.code == code) {
            // 为了简化模型，姑且认为已经登记的订单状态为入库
            System.out.println("该订单已经登记，状态为 " + state);
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
                System.out.println("You can't register, the order is registered");
                break;
            case DRAFTED:
                System.out.println("You can't register, the order has drafted");
                break;
            case PRINTED:
                System.out.println("You can't register, the order has printed");
                break;
            case BURNED:
                System.out.println("You can't register, the order has burned");
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
                System.out.println("你不能制作稿件,该订单还未登记呢");
                break;
            case NEW_ORDER:
                System.out.println("稿件制作完成");
                state = DRAFTED;
                break;
            case DRAFTED:
                System.out.println("你不能制作稿件,稿件已经制作完成了");
                break;
            case PRINTED:
                System.out.println("你不能制作稿件,订单已完成打样了");
                break;
            case BURNED:
                System.out.println("你不能制作稿件,订单已完成烫样了");
                break;
            case QULIFIED:
                System.out.println("你不能制作稿件,订单已经检验了");
                break;
            case UNQULIFIED:
                System.out.println("你不能制作稿件,订单已经检验了");
                break;
            case HAS_STORE:
                System.out.println("你不能制作稿件，该订单已经入库了");
                break;
        }
    }

    // 打样
    public void printDraft() {

    }

    // 烫样
    public void burnTextile() {

    }

    // 检验
    public void check() {

    }

    public String toString() {
        String result = "\n";
        result = result + "Digit Textile Printing, Inc.\n";
        result = result + "Order " + code + " state is " + state + "\n";
        return result;
    }
}
