import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Год високосный");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy"); //экземпляр формата даты
        Calendar calendar = new GregorianCalendar(year, Calendar.JANUARY, 1); // экземпляр календаря

        calendar.add(Calendar.DAY_OF_YEAR, 255); /* прибавляем к изначальному занчению 255,
                                                        т.к день месяца начинается с 1, а не с 0. */

        String dayP = simpleDateFormat.format(calendar.getTime());// форматирую календарь в паттерн dd.mm.yyyy
        System.out.println(dayP);
    }
    public static boolean isLeapYear(int year){
        // здесь нужно определить, является ли переданный год високосным
        if (year % 400 == 0 || year % 4 == 0 && year%100 !=0) {
            return true;
        }
        return false;

    }



}