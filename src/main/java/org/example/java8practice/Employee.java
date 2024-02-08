package org.example.java8practice;
public class Employee {

    private int id;
    private String name;
    private String dept;
    private String grade;
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Employee(int id, String name, String dept, String grade, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.grade= grade;
        this.salary = salary;

    }

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Employee(int id, String name, String grade, long salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", grade='" + grade + '\'' +
                ", salary=" + salary +
                '}';
    }
}