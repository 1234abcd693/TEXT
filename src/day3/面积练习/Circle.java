package day3.面积练习;

public class Circle extends Shape{
    public final double PI=3.14;
    private double r;


    public Circle(){
    }
    public Circle(double r) {
        this.r = r;
    }

    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r=r;
    }
    @Override
    public double getArea(){
        return PI*r*r;
    }
}
