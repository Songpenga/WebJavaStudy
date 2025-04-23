package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        Class clazz1 = String.class; // 1.클래스에서 조회
        Class clazz2 = new String().getClass(); // 2.인스턴스에서 조회
        Class clazz3 = Class.forName("java,lang.String"); // 3.문자열로 조회

        // 모든 필드 출력
        Field[] fields = clazz1.getDeclaredFields();
        for(Field field : fields){
            System.out.println("Field :" + field.getType() + " " + field.getName());
        }

        Method[] methods = clazz1.getDeclaredMethods();
        for(Method method : methods){
            System.out.println("Method :" + methods);
        }


        // 상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz1.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz1.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }

    }
}
