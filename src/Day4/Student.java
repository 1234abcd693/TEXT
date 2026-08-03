package Day4;

public class Student {
    private int id;
    private String name;
    private int age;
    private String major;
    //无参构造方法
    public Student(){
        this(0,"  ",0,"  ");
    }
    //有参构造方法
    public Student(int id, String name, int age, String major) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.major=major;
    }
    public void ShowInfo(){
        System.out.println("学号："+id);
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("专业："+major);
    }

    public String getInfo(){
        StringBuilder sb=new StringBuilder();
        sb.append("编号：");
        sb.append(id);
        sb.append("姓名：");
        sb.append(name);
        sb.append("年龄：");
        sb.append(age);
        sb.append("专业：");
        sb.append(major);
        return sb.toString();
    }
    //getter方法
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
    //setter方法
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(0<age&&age<100){
            this.age=age;
        }
        else{
            System.out.println("年龄输入错误");
        }
    }
    public void setMajor(String major) {
        this.major = major;
    }

}
