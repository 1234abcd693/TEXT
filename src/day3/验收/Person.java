package day3.验收;

public abstract class Person {
    private String name;
    private int age;


    public Person(){
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public abstract void showInfo();


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(0<=age&&age<=100){
            this.age=age;
        }
        else{
            System.out.println("年龄非法");
        }


    }
    
}
