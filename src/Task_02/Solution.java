package Task_02;

/* Отсортируйте массив
    [5,6,3,2,5,1,4,9]
*/
public class Solution {
    public static void main(String[] args) {
        // Создаем и заполняем массив
        int[] arrInt = new int[] { 5, 6, 3, 2, 5, 1, 4, 9 };

        // Выводим исходный массив в консоль
        System.out.println("Source array: ");
        for (int j : arrInt) {
            System.out.print(j + " ");
        }

        // Для сортировки массива будем использовать метод быстрой сортировки
        quickSort(arrInt, 0, arrInt.length-1);

        // Выводим отсортированный массив в консоль
        System.out.println("\nSorted array: ");
        for (int j : arrInt) {
            System.out.print(j + " ");
        }
    }

    // Метод быстрой сортировки
    public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        // source - входной массив
        int leftMarker = leftBorder;        // левый маркер (начало массива)
        int rightMarker = rightBorder;      // правый маркер (конец массива)
        int pivot                           // опорный элемент
                = source[(leftMarker + rightMarker) / 2];       // выбираем середину массива
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}
