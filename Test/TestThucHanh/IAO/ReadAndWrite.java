package Test.TestThucHanh.IAO;

import Test.TestThucHanh.Model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {

    public List<Student> readFromFile() {
        List<Student> students = new ArrayList<>();
        try {
            File inFile = new File("C:\\Module2.1\\src\\Test\\TestThucHanh\\Data\\students.csv");
            Scanner inputFile = new Scanner(inFile);
            while (inputFile.hasNext()) {
                String str = inputFile.nextLine();
                String[] tokens = str.split(",");
                students.add(new Student(Integer.parseInt(tokens[0]),tokens[1],Integer.parseInt(tokens[2]),tokens[3],tokens[4],Double.parseDouble(tokens[5])));
            }
            return students;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeToFile(List<Student> students ) {
        try {
            FileWriter writer = new FileWriter("C:\\Module2.1\\src\\Test\\TestThucHanh\\Data\\students.csv", false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Student student : students) {
                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

