package j07_반복;

//1024-1

public class star{

        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) { // for (int i = 0; i < 5; i++)
                for (int j = 1; j < i+1; j++) {
                    System.out.print("*");
                                    }
                System.out.println();
            }

//no.2
            for (int i = 0; i < 10; i++) {
                for (int j = 1; j < 10-i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

//no.3
            System.out.println("no.3");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j= 0; j < 5-i; j++) {
                    System.out.print("  ");
                }
                for (int j= 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i <5; i++) {
                for (int j = 0; j < 5-i; j++) {
                    System.out.print("*");
                }
                for (int j= 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j= 0; j < 5-i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

//no.4
            for (int i = 0; i < 10; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
}
