package vn.edu.iuh.fit.maichienno_designpattern;

import vn.edu.iuh.fit.maichienno_designpattern.observerPattern.Clazz;
import vn.edu.iuh.fit.maichienno_designpattern.observerPattern.Student;

public class main_ObserverPattern {
    public static void main(String[] args) {
        // Tạo lớp học
        Clazz class1 = new Clazz("Lop 17F");

        // Tạo sinh viên
        Student student1 = new Student("Sinh vien A");
        Student student2 = new Student("Sinh vien B");

        // Thêm sinh viên vào lớp học
        class1.addObserver(student1);
        class1.addObserver(student2);

        // Lớp trưởng thông báo
        class1.notifyObservers("Buoi hoc bat dau luc 8h sang.");
    }
}
