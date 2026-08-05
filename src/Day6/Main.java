package Day6;

public class Main {
    public static void main(String[] args) {
            // 创建学生管理对象
            StudentManagerV2 manager =
                    new StudentManagerV2();
            // ======================
            // 1. 添加学生测试
            // ======================
            manager.addStudent(
                    new Student(1001,"张三",20,90)
            );

            manager.addStudent(
                    new Student(1002,"李四",21,95)
            );
            manager.addStudent(
                    new Student(1003,"王五",22,88)
            );
            System.out.println("=====所有学生=====");
            manager.showStudents();
            // ======================
            // 2. 根据id查询
            // ======================
            System.out.println();
            System.out.println("=====查询学生=====");
            Student s =
                    manager.findById(1002);
            if(s!=null){

                System.out.println(
                        s.getInfo()
                );

            }
            else{

                System.out.println("学生不存在");

            }
            // ======================
            // 3. 判断学生是否存在
            // ======================
            System.out.println();
            System.out.println("=====判断存在=====");
            System.out.println(
                    manager.existsStudent(1003)
            );
            System.out.println(
                    manager.existsStudent(9999)
            );
            // ======================
            // 4. 删除学生
            // ======================

            System.out.println();

            System.out.println("=====删除学生=====");


            manager.deleteStudent(1001);



            System.out.println();

            System.out.println("=====删除后列表=====");


            manager.showStudents();



            // ======================
            // 5. 数量统计
            // ======================

            System.out.println();


            System.out.println(
                    "当前学生数量："
                            +
                            manager.getCount()
            );

    }
}
