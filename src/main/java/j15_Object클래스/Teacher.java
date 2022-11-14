package j15_Object클래스;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }


    /*
    public String toString() {
        return "name: " + name + " address: " + schoolName;
    }
  */

    @Override
    public String toString() { // alt + insert
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }


}
