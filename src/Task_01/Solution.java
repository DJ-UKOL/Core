package Task_01;

/* Заполните двумерный массив случайным числами
  и выведите максимальное, минимальное и среднее значение.
*/
public class Solution {

    public static int a = 41;
    public static int c = 11119;
    public static int m = 11113;
    public static int seed = 1;

    public static void main(String[] args) {

        int min = 0;        // Минимальное значение случайного чмсла
        int max = 100;      // Максимальное занчение случайного чмсла

        int sizeX = 10;         // Количество ячеек в строке
        int sizeY = 10;         // Количество столбцов

        int[][] twoDimensionalArray = new int[sizeY][sizeX];    // Создаем двумерный массив с размерами sizeY на sizeX

        // Заполняем массив случайными числами
        seed = (int) System.currentTimeMillis() % 10;
        fullArrayRandom(twoDimensionalArray, min, max);

        // Выведем массив в консоль
        outArrayScreen(twoDimensionalArray);

        System.out.println("\nMaximum value is " + getMax(twoDimensionalArray));
        System.out.println("\nMinimum value is " + getMin(twoDimensionalArray));
        System.out.println("\nAverage value is " + getAvg(twoDimensionalArray));
    }

    // ГПСЧ
    public static int getNextRandom() {
        seed = (a * seed + c) % m;
        return seed;
    }

    // Заполняем массив случайными числами
    public static void fullArrayRandom(int[][] inputArray, int min, int max) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                inputArray[i][j] = getNextRandom() % (max - min) + min;
            }
        }
    }

    // Выведем массив в консоль
    public static void outArrayScreen(int[][] inputArray) {
        for (int[] ints : inputArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    // Поиск максимального значения
    public static int getMax(int[][] inputArray) {
        int maxValue = inputArray[0][0];
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                if (inputArray[i][j] > maxValue) {
                    maxValue = inputArray[i][j];
                }
            }
        }
        return maxValue;
    }

    // Поиск минимального значения
    public static int getMin(int[][] inputArray) {
        int minValue = inputArray[0][0];
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                if (inputArray[i][j] < minValue) {
                    minValue = inputArray[i][j];
                }
            }
        }
        return minValue;
    }

    // Поиск среднего значения
    public static int getAvg(int[][] inputArray) {
        int sum = 0;
        int count = 0;
        for (int[] ints : inputArray) {
            for (int anInt : ints) {
                sum += anInt;
                count++;
            }
        }
        return sum / count;
    }
}
