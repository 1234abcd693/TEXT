package Day6;

import java.util.HashMap;

public class StudentManagerV2 {
    private HashMap<Integer,Student> map = new HashMap<>();
    public void addStudent(Student student){
        map.put(student.getId(),student);
    }
    public Student findById(int id){
        return map.get(id);
    }

    public void deleteStudent(int id){
        map.remove(id);
    }


    public boolean existsStudent(int id){
        return map.containsKey(id);
    }

    public void showStudents(){
        for(Integer id:map.keySet()){
            Student student = map.get(id);
            System.out.println(student.getInfo());
        }
    }

    public int getCount(){
        return map.size();
    }
}
