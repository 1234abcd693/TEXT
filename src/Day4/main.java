package Day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student[] stu=new Student[]{s1,s2,s3};
        System.out.println(stu.length);
        int[] ages={20,18,25,19};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        Random random=new Random();
        int age=random.nextInt(10)+18;

        Student[] stu2=new Student[5];
        int sum=0;
        for(int i=0;i<5;i++) {
            age=random.nextInt(10)+18;
            stu2[i] = new Student(i + 1, "学生" + (i + 1), age, "  ",LocalDateTime.now());
            sum += age;
        }
        double average=(double)sum/5;
        System.out.println("平均年龄："+average);
        System.out.println("平均年龄："+Math.round(average));


        String info=
                "1001,张三,20,Java";


        s1=StudentInfoUtil.parse(info);


        s1.ShowInfo();



        String info2=
                "1002,李四,22,Python";


        s2=StudentInfoUtil.parse(info2);


        s2.ShowInfo();
    }
}
