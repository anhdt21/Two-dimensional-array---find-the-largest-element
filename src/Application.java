
public class Application {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random()*100);
            }
        }

        System.out.println("Ma tran duoc khoi tao la: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+"| ");
            }
            System.out.println();
        }

        int indexColumn = 0, countColumn = 0,indexRow = 0, countRow = 0, max = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > max) {
                    max = matrix[row][column];
                    indexColumn = countColumn + 1;
                    indexRow = countRow + 1;
                }
                countColumn++;
            }
            countColumn = 0;
            countRow++;
        }
        System.out.println("Phan tu lon nhat la: " + max + " vi tri hang " + indexRow + " cot thu " + indexColumn);


    }
}
