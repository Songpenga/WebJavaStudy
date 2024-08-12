package Array;

public class ArrayDIO2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2행3열

        for(int row = 0; row < 2; row++){
            for(int column = 0; column < 3; column++){
                System.out.println(arr[row][column] + " ");
            }
            System.out.println(); // 라인변경
        }

    }
}
