package Day4;

public class StudentInfoUtil {
    public static Student parse(String info){
        String[] arr=info.split(",");
        int id=Integer.parseInt(arr[0]);
        int age=Integer.parseInt(arr[2]);
        return new Student(id,arr[1],age,arr[3]);
    }
}
