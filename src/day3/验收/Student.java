package day3.验收;

public class Student extends Person{
    private String major;

    public Student(){
        this(" ",0," ");
    }
    public Student(String name,int age,String major){
        super(name,age);
        this.major=major;
    }
    @Override
    public void showInfo(){
        System.out.println("学生信息：");
        super.showInfo();
        System.out.println("专业："+major);
    }

    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major=major;
    }
}
