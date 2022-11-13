import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20 - 0);
            System.out.print(mas[i] + " ");
        }
        for (int i = 0; i < mas.length; i++) {
            if(i % 2 == 1){
                mas[i] = 0;
            }
        }
        System.out.println("\n"+Arrays.toString(mas));
    }
}

// 9) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//     Снова выведете массив на экран на отдельной строке.