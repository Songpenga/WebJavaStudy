package j15_Object클래스.equal;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    Teacher teacher1 = new Teacher("peng", "코리아it");
    Teacher teacher2 = new Teacher("peng", "코리아it");


    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public int hashCode() { return Objects.hash(name, schoolName); }

    // 값비교 등호기호(주소값), .equal 안의 값 비교, 동일 자료형, hashCode

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
