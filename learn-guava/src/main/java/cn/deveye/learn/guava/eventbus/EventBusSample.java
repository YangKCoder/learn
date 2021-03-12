package cn.deveye.learn.guava.eventbus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.Executors;

/**
 * @author yang kai
 */
@SuppressWarnings("all")
public class EventBusSample {

    public static void main(String[] args) {
        eventBus();
//        asyncEventBus();
    }

    public static void eventBus() {
        EventBus eventBus = new EventBus(new ExceptionHandler());
        // 注册监听者
        eventBus.register(new OrderEventListener());
        // 发布消息
        eventBus.post(new OrderMessage("hello"));

    }

    public static void asyncEventBus() {
        // 定义一个EventBus对象，因为我这里是测试，才这样写的。实际你应该定义一个单例获取其他的方式
        AsyncEventBus eventBus = new AsyncEventBus("test", Executors.newFixedThreadPool(10));
        // 注册监听者
        eventBus.register(new OrderEventListener());
        eventBus.register(new OrderEventListener());
        // 发布消息
        eventBus.post(new OrderMessage("hello"));
    }
}
