package Test.TestThucHanh.Controller;

import Test.TestThucHanh.Model.Student;
import Test.TestThucHanh.Service.Service;

import java.util.List;

public class Controller {
    Service service = new Service();

    public List<Student> showList() {
        return service.show();
    }

    public void addStudent(Student student) {
        service.add(student);
    }

    public int checkId(int id) {
        List<Student> studentList = service.show();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void editStudent(int index, Student student) {
        service.edit(index, student);
    }

    public void deleteStudent(int index) {
        service.delete(index);
    }

    public void sortStudent(String choice) {
        switch (choice) {
            case "1":
                service.sortAscending();
                break;
            case "2":
                service.sortDescending();
                break;
            case "3":
                break;
            default:
                sortStudent(choice);
        }
    }

    public void readFromFile() {
        service.getFromFile();
    }

    public void saveToFile() {
        service.saveToFile();
    }
}
