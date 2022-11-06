package j06_조건;

import java.util.Scanner;

public class Condition6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Score = 0;
        System.out.println("점수를 입력하세요 : ");
        Score = scanner.nextInt();




        switch (Score / 10) {
            case 10:
            case 9:
                System.out.println("A 학점");
                break;
                case 8:
                    System.out.println("B 학점");
                    break;
            case 7:
                System.out.println("C 학점");
                break;
                case 6:
                    System.out.println("D 학점");
                    break;
                    default:
                        System.out.println("F 학점");
                        break;

        }
    }



}
