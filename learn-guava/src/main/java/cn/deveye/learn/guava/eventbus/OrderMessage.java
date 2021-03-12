package cn.deveye.learn.guava.eventbus;

/**
 * @author yang kai
 */
public class OrderMessage {

    public OrderMessage(String orderContent) {
        this.orderContent = orderContent;
    }

    /**
     * 命令对应的内容
     */
    private String orderContent;


    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }


    @Override
    public String toString() {
        return "OrderMessage{" +
                "orderContent='" + orderContent + '\'' +
                '}';
    }
}
