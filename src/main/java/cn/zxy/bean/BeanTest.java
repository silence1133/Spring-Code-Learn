package cn.zxy.bean;

/**
 * @author Silence 000996
 * @data 17/7/12
 */
public class BeanTest {
    private String name;
    private String info;

    private BeanDepen beanDepen;

    public BeanTest(String name, String info) {
        this.name = name;
        this.info = info;
    }

//    public BeanTest() {
//    }

    public void test(){
        System.out.println("test");
    }

    public void setBeanDepen(BeanDepen beanDepen) {
        this.beanDepen = beanDepen;
    }

    @Override
    public String toString() {
        return "BeanTest{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", beanDepen=" + beanDepen +
                '}';
    }
}
