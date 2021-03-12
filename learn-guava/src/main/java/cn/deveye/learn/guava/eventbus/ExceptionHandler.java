package cn.deveye.learn.guava.eventbus;

import com.google.common.eventbus.SubscriberExceptionContext;
import com.google.common.eventbus.SubscriberExceptionHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yang kai
 */
@Slf4j
public class ExceptionHandler implements SubscriberExceptionHandler {

    public void handleException(Throwable t, SubscriberExceptionContext context) {
        log.error("context.event:{}", context.getEvent());
    }
}
