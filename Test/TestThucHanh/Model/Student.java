package Test.TestThucHanh.Model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double avgScore;

    public Student() {
    }

    public Student(int id, String name, int age, String gender, String address, double avgScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.avgScore = avgScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgScore() {
        return avgScore;
    }


    @Override
    public String toString() {
        return  id +
                "," + name +
                "," + age +
                "," + gender +
                "," + address +
                ","+ avgScore ;
    }
}
