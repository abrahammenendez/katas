package katas;

public class Kata18 {

  public static int[][] main(int[][] matrix) {
    int numRows = matrix.length;
    int numColumns = matrix[0].length;
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numColumns; j++) {
        int num = matrix[i][j];
        if (num == 0) {
          nullifyRow(matrix, i);
          nullifyColumn(matrix, j);
        }
      }
    }

    return matrix;
  }

  public static void nullifyRow(int[][] matrix, int rowNum) {
    int length = matrix[rowNum].length;
    for (int i = 0; i < length; i++) {
      matrix[rowNum][i] = 0;
    }
  }

  public static void nullifyColumn(int[][] matrix, int colNum) {
    int length = matrix.length;
    for (int i = 0; i < length; i++) {
      matrix[i][colNum] = 0;
    }
  }
}
