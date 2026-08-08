package Day7;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.HashMap;

public class StudentManagerV3 {
    private HashMap<Integer,Student> map = new HashMap<>();
    public StudentManagerV3() {
        map = new HashMap<>();
    }

    public void save() {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
            for(Student s:map.values()){
                String data=s.getId()+","+s.getName()+","+s.getAge()+","+s.getScore()+"\n";
                bw.write(data);
                bw.newLine();
            }
            bw.close();
        }
        catch(Exception e){
            System.out.println("保存失败");
        }
    }


    public void load(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data=line.split(",");
                int id =Integer.parseInt(data[0]);
                String name =data[1];
                int age=Integer.parseInt(data[2]);
                double score=Double.parseDouble(data[3]);
                map.put(id,new Student(id,name,age,score));
            }
            br.close();
        }
        catch(Exception e){
            System.out.println("读取失败");
        }
    }
}
