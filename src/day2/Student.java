package day2;

public class Student {
    static int count;
    //属性
    private int id;
    private String name;
    private int age;
    private String major;

    //空参构造
    public Student(){
        this(0,"未知",0,"未知");
    }
    //形参构造
    public Student(int id,String name,int age,String major){
        this.id=id;
        this.name=name;
        this.age=age;
        this.major=major;
        count++;
    }
    //普通方法
    public void study(){
        System.out.println(name+"正在学习java");
    }
    public void showInfo(){
        System.out.println("编号："+id);
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("专业："+major);
    }

    //get方法
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getMajor(){
        return major;
    }
    public static int getCount(){
        return count;
    }
    //set方法
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(0<=age&&age<=100){
            this.age=age;
        }
        else {
            System.out.println("年龄输入非法");
        }
    }
    public void setMajor(String major){
        this.major=major;
    }
}
