package lang.Object.tostring;

public class Cat {
    private String catName;
    private int age;

    public Cat(String catName, int age) {
        this.catName = catName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName ::: " + catName + '\'' +
                ", age ::: " + age +
                "}";
    }
}
