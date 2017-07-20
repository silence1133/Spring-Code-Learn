package cn.zxy.applicationContext.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Silence 000996
 * @data 17/7/20
 */
public class ApplicationListenerTest implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof  ApplicationEventTest){
            ApplicationEventTest eventTest = (ApplicationEventTest) event;
            eventTest.doSomething();
        }
    }
}
