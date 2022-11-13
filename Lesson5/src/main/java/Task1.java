public class Task1 {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 7);
            switch (time % 7) {
                case 1:
                    System.out.print("Понедельник");
                    break;
                case 2:
                    System.out.print("Вторник");
                    break;
                case 3:
                    System.out.print("Среда");
                    break;
                case 4:
                    System.out.print("Четверг");
                    break;
                case 5:
                    System.out.print("Пятница");
                    break;
                case 6:
                    System.out.print("Выходной");
                    break;
                case 7:
                    System.out.print("Выходной ");
                    break;
                default:
                    System.out.print("nothing");
            }
        }
    }


//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
