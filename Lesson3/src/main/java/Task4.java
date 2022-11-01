public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int result = 0;
        for (int m : array) {
            result += m;
        }
        double arr = ((double) result) / array.length;
        System.out.println(arr);
    }

}


/**
 * Метод должен вернуть среднее значение из массива чисел
 * (необходимо сумму всех элеменов массива разделить на длину массива)
 * <p>
 * Example:
 * array = {1,2,3,4,5}
 * Метод должен return 3.0
 **/



