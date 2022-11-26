public class Task5 {
        public static void main(String[] args) {
            System.out.println(summ(-3, 5));
            System.out.println(summ(3, -5));
            System.out.println(summ(3, 5));
            System.out.println(summ(-3, -5));
            System.out.println(summ(0, -5));
            System.out.println(summ(-5, 0));
            System.out.println(summ(1, 10000));
        }

        private static int summ(int a, int b) {

            int result = 0;
            int minValue = Math.min(Math.abs(a), Math.abs(b));
            int maxValue = Math.max(Math.abs(a), Math.abs(b));

            for (int i = 0; i < minValue; i++) {//0 до 5
                result += maxValue;
            }

            if (a < 0 && b > 0 || b < 0 && a > 0) {//a < 0 ^ b < 0
                return -result;
            }

            return result;
        }

    }

// 5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//      умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.