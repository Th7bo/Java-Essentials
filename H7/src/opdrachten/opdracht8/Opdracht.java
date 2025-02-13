package opdrachten.opdracht8;

public class Opdracht {

    public static void main(String[] args) {
        int[][] array = new int[4][6];
        for (int i = 1; i <= array.length; i++) {
            for (int j = 1; j <= array[i - 1].length; j++) {
                array[i - 1][j - 1] = i * j;
            }
        }

        for (int[] row : array) {
            for (int value : row) {
                System.out.printf("%d\t", value);
            }
            System.out.println();
        }

        for (int j = 1; j <= array[0].length; j++) {
            int som = 0;
            for (int i = 1; i <= array.length; i++) {
                som += array[i - 1][j - 1];
            }
            System.out.printf("Som: %d ", som);
        }
        System.out.println();
    }

}
