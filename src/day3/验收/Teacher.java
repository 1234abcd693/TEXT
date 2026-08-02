package day3.验收;

public class Teacher extends Person{
    private String subject;
    public Teacher(){
        this(" ",0," ");
    }
    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    @Override
    public void showInfo(){
        System.out.println("教师信息：");
        super.showInfo();
        System.out.println("科目："+subject);
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject=subject;
    }
}
