package vn.codegym.QuyenLeSy;

import java.util.Random;
import java.util.Scanner;

public class DisplayMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập vào kích thước ma trận: ");
        n = scanner.nextInt();

        System.out.println("Ma trận nhị phân: ");
        printMatrix(n);

    }

    public static void printMatrix(int n){
        int[][] matrix = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = random.nextInt(2);
            }
        }

        for (int row = 0; row < matrix.length; row++)
        {
            for (int column = 0; column < matrix[row].length; column++)
            {
                System.out.print(matrix[row][column] + "\t");
                if(column == (matrix.length - 1))
                {
                    System.out.println("\n");
                }
            }
        }
    }
}
