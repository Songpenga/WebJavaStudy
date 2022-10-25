package j02_변수상수;

/*변수*/
public class Variable {
    public static void main(String[] args) {
        // 논리자료형 변수
        boolean checkFlag = false;  // 선언
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

    // 문자 자료형 변수
        char name1 = '김';
        char name2 = '준';
        char name3 = '일';
        System.out.println("" + name1+name2+name3 + ""); //147132 문자열로 인식하게
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println('가'+0);

        //문자열 자료형 변수
        String name = "김준일";
        String name4 = "윤도영";
        String name5 = name + name4;
        System.out.println(name5);

        //정수자료형 변수
        int width1 = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width1 + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis(); //현재시간
        System.out.println(time);

        long time2 = 1666178885589L;
        System.out.println(time2);

        //실수 자료형 변수
        double pi = 3.141592653599123456789; //자리수 제한이 있다(반올림됨)
        System.out.println(pi);

        final String FILE_PATH = "C://User/Peng";
//        FiLE_PATH = "D:/User/aaa";
   //    System.out.println(FILE_PATH); ctrl + / 주석처리

    }
}
