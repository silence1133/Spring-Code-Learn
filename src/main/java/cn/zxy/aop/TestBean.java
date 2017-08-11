package cn.zxy.aop;

/**
 * @author Silence 000996
 * @data 17/7/24
 */
public class TestBean implements ITestBean {
    private String testStr;

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public void test(){
        System.out.println("test");
    }
}
