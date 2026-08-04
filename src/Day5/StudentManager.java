package Day5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students=new ArrayList<Student>();
    public void addStudent(Student student){
        students.add(student);
    }
    public void showStudents(){
        for(Student student:students){
            System.out.println(student.getInfo());
        }
    }
    public Student findById(int id){
        for(Student student:students){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(int id){
        for(Student student:students){
            if(student.getId()==id){
                students.remove(student);
                System.out.println("删除成功");
            }
        }
    }

    public Student getMaxScoreStudent(){
        double max=0;;
        int maxIndex=0;
        for(Student student:students){
            if(student.getScore()>max){
                max=student.getScore();
                maxIndex=student.getId();
            }
        }
        return findById(maxIndex);
    }
}
