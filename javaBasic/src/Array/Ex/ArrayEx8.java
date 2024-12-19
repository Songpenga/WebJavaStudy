package Array.Ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수 입력");
        int Scount = scanner.nextInt();

        int[][] scores = new int[Scount][3];
        String[] sub = {"국", "영", "수"};


        for(int i = 0; i < Scount; i++){
            System.out.println((i+1) + "의 성적");
            for (int j = 0; j<3; j++){
                System.out.println(sub[j] + "점수");
                scores[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < Scount; i++){
            int totalScores = 0;
            for(int j = 0; j < 3; j++){
                totalScores += scores[i][j];
            }
            double avg = totalScores / 3.0;
            System.out.println((i+1)+ "번쨰 학생의 총점 : " + totalScores + ", 평균: " + avg);
        }
    }
}
