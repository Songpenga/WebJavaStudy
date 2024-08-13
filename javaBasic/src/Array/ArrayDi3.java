package Array;

public class ArrayDi3 {
    public static void main(String[] args) {

        //2차원 배열
        int[][] arr = new int[4][4];

        int i = 1;

        for(int row = 0; row< arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        for(int row = 0; row< arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                //arr[row].length => arr[row] 행의 length
                System.out.println(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
