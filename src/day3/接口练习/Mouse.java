package day3.接口练习;

public class Mouse implements Usb接口{
    @Override
    public void connect() {
        System.out.println("鼠标连接成功");
    }
}
