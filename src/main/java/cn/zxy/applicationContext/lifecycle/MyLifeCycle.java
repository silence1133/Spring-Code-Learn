package cn.zxy.applicationContext.lifecycle;

import org.springframework.context.Lifecycle;

/**
 * @author Silence 000996
 * @data 17/7/21
 */
public class MyLifeCycle implements Lifecycle {

    Boolean start = false;

    public void start() {
        start = true;
        System.out.println("application started ");
    }

    public void stop() {
        start = false;
        System.out.println("application stopped ");
    }

    public boolean isRunning() {
        return start;
    }
}
