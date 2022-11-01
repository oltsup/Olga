public class Task5 {
    public static int getMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            max = Math.max(max, i);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 10, 3};
        System.out.println(getMax(A));
    }
}


/**
 * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
 **/
