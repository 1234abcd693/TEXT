package day3.接口练习;

public class Keyboard implements Usb接口{
    @Override
    public void connect(){
        System.out.println("键盘连接成功");
    }
}
