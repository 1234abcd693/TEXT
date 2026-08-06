package Day7;

public class Student {
    private int id;
    private String name;
    private int age;
    private double score;


    public Student() {
        this(0, "未知", 0, 0);
    }

    public Student(int id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }


    public String getInfo(){
        StringBuilder str = new StringBuilder();
        str.append("学号：").append(id).append("\n");
        str.append("姓名：").append(name).append("\n");
        str.append("年龄：").append(age).append("\n");
        str.append("成绩：").append(score).append("\n");
        return str.toString();
    }
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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (0 < age && age < 100) {
            this.age = age;
        }
        System.out.println("年龄输入错误");
    }
    public void setScore(double score) {
        this.score = score;
    }
}
