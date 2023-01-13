package service;

import seminars.seminar5.task1.model.Student;
import seminars.seminar5.task1.util.DataReader;
import seminars.seminar5.task1.util.DataWriter;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements DataService<Student> {

    private List<Student> students = new ArrayList<>();

    @Override
    public void addUser(Student student) {
        students.add(student);
    }

    @Override
    public void save(String path) {
        DataWriter.dataWrite(students);
    }

    @Override
    public void load(String path) {
        students = DataReader.dataRead(path);
    }
}
