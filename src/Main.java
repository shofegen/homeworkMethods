import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
// Задание 1
        leapYear(2024);
// Задание 2
        recommendVersion(0, 2021);
// Задание 3
        deliveryDistance(95);
    }

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && (year > 1584)) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }

    public static void recommendVersion(int clientOs, int deviceYear) {
        boolean deviceIsOld = deviceYear < 2015;
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (clientOs == 0) {
            System.out.print("IOS ");
        } else {
            System.out.print("Android");
        }
        System.out.printf("\n");
    }
    public static void deliveryDistance(int deliveryDay) {
        int resault = 1;
        if (deliveryDay <=20){
        } else if (deliveryDay >20 || deliveryDay <=60) {
            resault = resault + 2;
        } else if (deliveryDay >60 || deliveryDay <=100) {
            resault = resault + 3;
        } else {
            System.out.println("Доставка не может быть осуществлена");
        }
        System.out.println("Потребуется дней: " + resault + " , для выпуска карты с учетом доставки");
    }
}