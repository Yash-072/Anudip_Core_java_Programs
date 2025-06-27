//Assignment 1
import java.util.Random;

public class ThreeDArrayOperations {
    public static void main(String[] args) {

        int layers = 3;
        int rows = 2;
        int columns = 4;

        int[][][] array3D = initialize3DArray(layers, rows, columns);

        int max = findMaxValue(array3D);

        double average = calculateAverage(array3D);
        
        System.out.println("3D Array Contents:");
        display3DArray(array3D);
        
        System.out.println("\nMaximum Value: " + max);
        System.out.printf("Average Value: %.2f%n", average);
    }

    public static int[][][] initialize3DArray(int layers, int rows, int columns) {
        int[][][] array = new int[layers][rows][columns];
        Random rand = new Random();
        
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    array[i][j][k] = rand.nextInt(100); // Random values 0-99
                }
            }
        }
        return array;
    }

    public static int findMaxValue(int[][][] array) {
        int max = Integer.MIN_VALUE;
        for (int[][] layer : array) {
            for (int[] row : layer) {
                for (int value : row) {
                    if (value > max) max = value;
                }
            }
        }
        return max;
    }

    public static double calculateAverage(int[][][] array) {
        int sum = 0;
        int count = 0;
        
        for (int[][] layer : array) {
            for (int[] row : layer) {
                for (int value : row) {
                    sum += value;
                    count++;
                }
            }
        }
        return (double) sum / count;
    }

    public static void display3DArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.printf("%3d ", array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
