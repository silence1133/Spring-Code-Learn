package cn.zxy.applicationContext.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Silence 000996
 * @data 17/7/20
 */
public class ApplicationEventTest extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public ApplicationEventTest(Object source) {
        super(source);
    }

    public void doSomething(){
        System.out.println(source);
    }
}
