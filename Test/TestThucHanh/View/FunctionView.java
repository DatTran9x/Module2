package Test.TestThucHanh.View;

import Test.TestThucHanh.Controller.Controller;
import Test.TestThucHanh.Controller.Validate;
import Test.TestThucHanh.Model.Student;

import java.util.Scanner;

public class FunctionView {
    static Controller controller = new Controller();
    static Validate validate = new Validate();
    static GetAndAlert getAndAlert = new GetAndAlert();
    Scanner scanner = new Scanner(System.in);

    public void showdMenu() {
        int count = 0;
        if(controller.showList().size()==0) {
            getAndAlert.noStudentInList();
            return;
        }
        for (Student student : controller.showList()) {
            System.out.println(student.toString());
            if (++count % 5 == 0) {
                System.out.println("An enter de quay lai");
            }
        }
    }

    public void addMenu() {
        controller.addStudent(createStudent());

    }

    private Student createStudent() {
        System.out.println("Nhap ma sinh vien");
        int id = validate.validateInterger();
        System.out.println("Nhap ten sinh vien");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi sinh vien");
        int age = validate.validateInterger();
        System.out.println("Nhap gioi tinh sinh vien");
        String gender = scanner.nextLine();
        System.out.println("Nhap dia chi sinh vien");
        String address = scanner.nextLine();
        System.out.println("Nhap diem trung binh cua sinh vien");
        double avgScore = validate.validateDouble();
        return new Student(id, name, age, gender, address, avgScore);
    }

    public void editMenu() {
        System.out.println("Nhap ma sinh vien can sua");
        int id = validate.validateInterger();
        int index = controller.checkId(id);
        if (index == -1) {
            getAndAlert.noStudent();
            editMenu();
        }
        controller.editStudent(index, createStudent());
    }

    public void deleteMenu() {
        System.out.println("Nhap ma sinh vien can sua");
        int id = validate.validateInterger();
        if (id == -1) {
            return;
        }
        int index = controller.checkId(id);
        if (index == -1) {
            getAndAlert.noStudent();
            deleteMenu();
        }
        getAndAlert.confirmToDelete();
        getAndAlert.confirm();
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y"))
            controller.deleteStudent(index);
    }

    public void sortMenu() {
        System.out.println("---Sap xep sinh vien theo diem so trung binh---");
        System.out.println("Chon chuc nang theo so (de tiep tuc)");
        System.out.println("1.Sap xep diem trung binh tang dan");
        System.out.println("1.Sap xep diem trung binh giam dan");
        System.out.println("3.Thoat");
        System.out.println("Chon chuc nang:");
        controller.sortStudent(scanner.nextLine());
    }

    public void getMenu() {
        getAndAlert.confirmToSave();
        getAndAlert.confirm();
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            controller.readFromFile();
            getAndAlert.finish();
        }
    }

    public void saveMenu() {
        getAndAlert.confirmToSave();
        getAndAlert.confirm();
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            controller.saveToFile();
            getAndAlert.finish();
        }
    }
}
