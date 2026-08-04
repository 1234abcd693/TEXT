package Day5;

public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    // 无参构造方法
    public Student() {
        this(0, "未知", 0, 0);
    }
    // 有参构造方法
    public Student(int id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }


    //AI让我写showinfo 但是我感觉写getInfo方法更合适 可以保存可以展示信息
    public String getInfo(){
        StringBuilder sb=new StringBuilder();
        sb.append("编号：");
        sb.append(id);
        sb.append("姓名：");
        sb.append(name);
        sb.append("年龄：");
        sb.append(age);
        sb.append("成绩：");
        sb.append(score);
        return sb.toString();
    }
    //getter方法
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getScore() {
        return score;
    }

    //setter方法
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setScore(double score) {
        this.score = score;
    }
}
