package Array;

public class ArrayDi2 {
    public static void main(String[] args) {

        //2차원 바열
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; //2행 3열

        for(int row = 0; row< arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                //arr[row].length => arr[row] 행의 length
                System.out.println(arr[row][column] + " ");
            }
            System.out.println();
        }

        //arr.length는 행의 길이를 뜻한다.
        //arr[row].length는 열의 길이를 뜻한다.

    }
}
