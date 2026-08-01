package day2;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setId(001);
        s1.setName("李四");
        s1.setAge(21);
        s1.setMajor("JAVA");
        s1.showInfo();

        Student s2=new Student(002,"张三",19,"java");
        s2.showInfo();
        s2.study();

        s2.setAge(-10);

        System.out.println(School.name);

        System.out.println(Student.getCount());
    }
}
