package vn.edu.iuh.fit.maichienno_designpattern.observerPattern;

public class Student implements Observer{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Thông báo cho sinh viên " + name + ": " + message);
    }
}
