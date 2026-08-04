package Day5;

public class Main {
    public static void main(String[] args) {
        StudentManager manager=
                new StudentManager();


        manager.addStudent(
                new Student(1,"张三",20,90)
        );


        manager.addStudent(
                new Student(2,"李四",21,95)
        );


        manager.showStudents();


        Student s= manager.findById(2);


        System.out.println(s.getInfo());


        manager.deleteStudent(1);


        Student max=
                manager.getMaxScoreStudent();

        System.out.println(max.getInfo());

    }
}
