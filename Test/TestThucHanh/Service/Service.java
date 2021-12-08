package Test.TestThucHanh.Service;

import Test.TestThucHanh.IAO.ReadAndWrite;
import Test.TestThucHanh.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class Service {
    List<Student> studentList = new ArrayList<>();
    Ascending ascending = new Ascending();
    Descending descending = new Descending();
    ReadAndWrite readAndWrite = new ReadAndWrite();


    public List<Student> show(){
        return studentList;
    }

    public void add(Student student){
        studentList.add(student);
    }

    public void edit(int index,Student student){
        studentList.set(index,student);
    }

    public void delete(int index){
        studentList.remove(index);
    }

    public  void sortAscending(){
        studentList.sort(ascending);
    }

    public  void sortDescending(){
        studentList.sort(descending);
    }

    public void getFromFile(){
        studentList=readAndWrite.readFromFile();
    }

    public void saveToFile(){
        readAndWrite.writeToFile(studentList);
    }
}
