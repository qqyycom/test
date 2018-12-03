/**
 * 描述：
 *
 * @Auther: qgm
 * @Date: 2018/11/22 09:57
 */
public class protoTypeDemo implements Cloneable{
    private ClassDemo classDemo = new ClassDemo();

    private int val = 10;

    public ClassDemo getClassDemo() {
        return classDemo;
    }

    public void setClassDemo(ClassDemo classDemo) {
        this.classDemo = classDemo;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        protoTypeDemo protoTypeDemo = new protoTypeDemo();
        protoTypeDemo cloneprotoType = null;
        try {
            cloneprotoType = (protoTypeDemo)protoTypeDemo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        ClassDemo cd = cloneprotoType.getClassDemo();
        cloneprotoType.setVal(20);
        cd.setS("bbb");

        System.out.println(protoTypeDemo.getClassDemo().getS());
        System.out.println(protoTypeDemo.getVal());
    }
}

class ClassDemo {
    private String s = new String("aaa");

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
