package model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "student")
public class Student {
    @org.springframework.data.annotation.Id
    private long Id;
    private String name;
    private double age;
    private int grade;


    public Student() {
        super();
    }

    public Student(Long id, String name, double age, int grade) {
        Id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
