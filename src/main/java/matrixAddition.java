import java.util.Scanner;

public class matrixAddition {
    public static int[][] add(int row,int col,int[] firstMatrix,int[] secondMatrix) {
        int x = 0, y = 0;
        int[][] add = new int[row][col];
        int[][] first = new int[row][col];
        int[][] second = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                {
                    first[i][j] = firstMatrix[x++];
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++)
                    {
                        second[i][j] = secondMatrix[y++];
                    }
                }
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        add[i][j] = first[i][j] + second[i][j];
                    }
                }
                return add;
        }
        public static void main(String[] args){
        int row=3;
        int col=2;
        int[] arr={1,2,3,4,5,6};
        int[] arr1={9,8,7,6,5,4};
        int[][] val=add(row,col,arr,arr1);
            for (int i = 0; i < row; i++) {
                System.out.println(" ");
                for (int j = 0; j < col; j++) {
                    System.out.print(val[i][j]+" ");
                }
            }

    }
}