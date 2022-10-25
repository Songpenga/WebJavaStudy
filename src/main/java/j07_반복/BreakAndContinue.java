package j07_반복;
//1024-1-2
public class BreakAndContinue  {
    public static void main(String[] args) {
        int i = 0;

        while(true) {
            if (i > 10) { //i가 9보다 커졌는가??
                break;
            }
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 10; j++) {
            if (j == 7){
                break;
            }
            System.out.println(j);
        }
        System.out.println("<<<<<<<<<<<<<<<<<< Continue >>>>>>>>>>>>>>>>");

                for (int j = 0; j < 100; j++) {
                    if(j % 5 != 0 || j == 0) {
                        continue;
                    }
                    System.out.println(j);
                                    }

    }
}
