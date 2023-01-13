package model;

import java.util.List;

public class TeacherUser extends User {

    private List<String> subjects;

    public TeacherUser(String name, String surname, int age, List<String> subjects) {
        super(name, surname, age);
        this.subjects = subjects;
    }

    // Коллекции без гет и сет методов


    // если не создать toString то он унаследует от родительского класса  name, surname, age но не сможет распечатать subjects так как нема
    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + subjects +
                "} " + super.toString();
    }
}
