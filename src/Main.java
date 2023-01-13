import model.StudentUser;
import util.DataReader;
import util.DataWriter;

import java.util.ArrayList;
import java.util.List;

/*
Cоздаем три класса в пакете data: User, Teacher, StudentUser. User содержит поля, общие для студента и преподавателя. StudentUser и Teacher добавляют поля, специфичные для этих классов. Из соображений времени не делайте класс Teacher и связанные с ним классы.
Создайте два класса в пакете util: DataWriter и DataReader. Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.
Создайте в пакете service: интерфейс DataService и два детских класса: StudentUserService и TeacherService. Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:
добавить нового студента или учителя
сохранить всех в файл
загрузить всех из файла
 */
public class Main {
    public static void main(String[] args) {
        StudentUser st1 = new StudentUser("Alex", "Ivanov", 19, 3, 4.6f);
        StudentUser st2 = new StudentUser("Denis", "Popov", 22, 1, 4.1f);
        StudentUser st3 = new StudentUser("Ivan", "Smirnov", 23, 4, 4.3f);


        List<StudentUser> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);


        DataWriter.dataWrite(studentList);
        List<StudentUser> studentList1 = DataReader.dataRead("studentDB.txt");
        for (StudentUser student: studentList1) {
            System.out.println(student);
        }
    }
}
