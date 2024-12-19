package Array.Ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] sub = {"국", "영", "수"};

        for(int i = 0; i < 4; i++){
            System.out.println((i+1) + "의 성적");
            for (int j = 0; j<3; j++){
                System.out.println(sub[j] + "점수");
                
            }
        }
    }
}
