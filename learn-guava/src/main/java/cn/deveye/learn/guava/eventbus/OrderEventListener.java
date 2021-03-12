package cn.deveye.learn.guava.eventbus;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yang kai
 */
@Slf4j
public class OrderEventListener {

    /**
     * 如果发送了OrderMessage消息，会进入到该函数的处理
     *
     * @param event 消息
     */
    @Subscribe
    public void dealWithEvent(OrderMessage event) {
        log.info("我收到了您的命令，命令内容为：{}", event.getOrderContent());
        throw new RuntimeException("处理失败");
    }
}