package service;

import model.StudentUser;
import util.DataReader;
import util.DataWriter;



import java.util.ArrayList;
import java.util.List;

public class StudentUserService implements DataService<StudentUser> {

    private List<StudentUser> students = new ArrayList<>();

    @Override
    public void addUser(StudentUser student) {
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
