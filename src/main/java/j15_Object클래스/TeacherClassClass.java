package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Peng", "코리아아이티");
        Teacher teacher1 = new Teacher("Penga", "코리아아이티");
        Teacher teacher2 = new Teacher("Pengs", "코리아아이티");

        teacher.getClass();// 이것은 무엇인가

        Class t_class = teacher.getClass();
        //내장클래스. getDeclaredFields??
        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());

        Field[] fields = t_class.getDeclaredFields(); //Field, getDeclaredFields
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName()); // getName
            System.out.println(fields[i].getType().getSimpleName());
        }

        Method[] method = t_class.getDeclaredMethods();
        for (int i = 0; i < method.length; i++) {
            System.out.println("a" + method[i].getReturnType()); // getName
        }
        System.out.println(teacher.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher);
        System.out.println(teacher2.getClass() == Teacher.class);

    }

}
