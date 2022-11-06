public class Task1 {
    public static void main(String[] args) {
}
    public static int sum(int a, int b) {
        long summa = (long) a + b;
        if (summa > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }

}

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     *     public static int sum(int a, int b) {
     *         return a + b;
     *     }
     **/