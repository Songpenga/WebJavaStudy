package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis ::: " + currentTimeMillis);
        //String can be replaced with template

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano ::: " + currentTimeNano);

        // 환경 변수를 읽는다.
        System.out.println("getenv ::: " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties ::: " + System.getProperties());
        System.out.println("properties ::: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originArray = {'p', 'e', 'N', 'G'};
        char[] copyArray = new char[5];
        System.arraycopy(originArray, 0, copyArray, 0, originArray.length);

        // 배열 출력
        System.out.println("copyArray ::: " + copyArray);
        System.out.println("Array.toString ::: " + Arrays.toString(copyArray));

        // 프로그램 종료
        System.exit(0);
    }
}
