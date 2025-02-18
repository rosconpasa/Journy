package Streams;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    @Override
    public java.lang.String toString() {
        return "{name:" + name +
                ", age:" + age +
                ", grade:" + grade +
                "}";
    }
}
