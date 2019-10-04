package designpattern.birdge;

/**
 * DATE  2019-08-20
 * 类的实现层次结构，用字符串显示类
 *
 */
public class StringDisplayImpl extends DisplayImpl{
    private String string;
    private int width;
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i< width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
