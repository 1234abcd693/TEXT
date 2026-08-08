package Day7;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== 第一次启动：读取文件 =====");
        StudentManagerV3 manager = new StudentManagerV3();


        //测试load
        manager.showStudents();
        System.out.println("\n===== 查询学生 =====");
        Student s = manager.findById(1002);


        if (s != null) {
            System.out.println(
                    s.getInfo()
            );

        } else {

            System.out.println("没有找到学生");

        }


        System.out.println("\n===== 添加学生 =====");

        Student newStudent = new Student(1004, "赵六", 23, 100);


        manager.addStudent(newStudent);

        manager.showStudents();

        System.out.println("\n===== 删除学生 =====");
        manager.deleteStudent(1001);


        manager.showStudents();

        System.out.println("\n===== 测试完成 =====");

    }
}
