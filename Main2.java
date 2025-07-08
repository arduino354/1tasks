// coding utf-8
import java.util.Random;
import java.util.Scanner;


public class Main2 {
    public static void versions2(int stringColumn, int[] iterationsNum){
        Random randint = new Random();
        int[][] matrix = new int[stringColumn][stringColumn];
        
        for (int I = 0; I < stringColumn; I++){
            for (int J = 0; J < stringColumn; J++){
                matrix[I][J] = randint.nextInt(iterationsNum[1] - iterationsNum[0] + 1) + iterationsNum[0];
            }
        }
        
        System.out.println("\nИсходная матрица:");
        for (int[] row : matrix){
            for (int num : row){
                System.out.printf("%4d ", num);
            }
            System.out.println();
        }
        
        for ( int I = 0; I < stringColumn; ++I) {
            for ( int J = I + 1; J < stringColumn; ++J ) {
                int tmp = matrix[I][J];
                matrix[I][J] = matrix[J][I];
                matrix[J][I] = tmp;
            }
        }

        System.out.println("\nТранспонированная матрица:");
        for ( int[] row : matrix ){
            for (int num : row){
                System.out.printf("%4d ", num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите размерность матрицы: ");
        int stringMN  = scanner.nextInt();

        int[] range = {0, 99};
        versions2(stringMN, range);
    }
}
