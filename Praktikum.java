    import java.util.Scanner;

    public class Praktikum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            if (isLeapYear(year)) { // возврашаем значение boolean из метода isLeapYear
                System.out.println("12.09." + year);   // если год високосный
            } else {
                System.out.println("13.09." + year);
            }
        }

            public static boolean isLeapYear(int year) {
            // здесь нужно определить, является ли переданный год високосным
            if (year % 100 == 0) { // Проверяем кратность 100
                if (year % 400 == 0) { // Проверяем иссколючение, кратность 400
                    return true; // Если оба значения выполняются
                } else {
                    return false; // Если выполняется только кратность 100
                }
            } else if (year % 4 == 0) { // Проверяем кратность 4-м
                    return true;
            } else {
                return false;
            }
        }
    }



