public class Task8 {
    public static void main(String[] args) {

        int[] mas = new int[12];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 15 - 0);
            System.out.print(mas[i] + " ");
        }

        int jMax = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= mas[jMax]) {
                jMax = i;
            }
        }
        System.out.println("\nМаксимальный элемент " + mas[jMax]);
        System.out.println("Индекс его последнего вхождения в массив = " + jMax);

    }
}
//        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
