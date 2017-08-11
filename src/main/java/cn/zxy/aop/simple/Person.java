package cn.zxy.aop.simple;

/**
 * @author Silence 000996
 * @data 17/7/25
 * 需要增强的类
 */
public class Person {
    public void say(String content){
        System.out.println(content);
    }

    public void sayException(String content){
        System.out.println(content);
        throw new RuntimeException("test exception");
    }
}
