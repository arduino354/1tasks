// coding utf-8
import java.util.Random;
import java.util.Scanner;


public class Main1 {
    public static void versions1(int string, int column, int[] iterationsNum) {
        Random randint = new Random();
        int[][] matrix = new int[string][column];
    
        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = randint.nextInt(iterationsNum[1] - iterationsNum[0] + 1) + iterationsNum[0];
            }
        }
        
        System.out.println("\nИсходная матрица:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d ", num);
            }
            System.out.println();
        }
        
        int maxValue = matrix[0][0];
        int maxRow = 0, maxCol = 0;
        
        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        
        System.out.printf("\nМаксимальный элемент: %d\nЕго координаты: строка %d, столбец %d\n", 
                          maxValue, maxRow + 1, maxCol + 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите количество строк: ");
        int string = scanner.nextInt();
        
        System.out.print("Введите количество столбцов: ");
        int column = scanner.nextInt();
        
        int[] range = {-100, 100};
        versions1(string, column, range);
        
        scanner.close();
    }
}