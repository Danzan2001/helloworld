public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0;
        int android = 1;
        int iOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS > 0) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задача 2");
        if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (clientOS > 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задача 3");
        int year = 2025;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является виссокосным");
        } else {
            System.out.println(year + " год не является виосокосным");
        }
        System.out.println("Задача 4");
        int devileryDistance = 95;
        if (devileryDistance <= 20) {
            System.out.println("Доставка 1 день");
        } else if (devileryDistance > 20 && devileryDistance <= 60) {
            System.out.println("Доставка 2 дня");
        } else if (devileryDistance > 60 && devileryDistance <= 100) {
            System.out.println("Доаставка 3 дня");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12,1,2:
                System.out.println("Месяц зимы");
                break;
            case 3,4,5:
                System.out.println("Месяц весны");
                break;
            case 6,7,8:
                System.out.println("Месяц лета");
                break;
            case 9,10,11:
                System.out.println("Месяц осени");
                break;
            default:
                System.out.println("Нет такого");

        }
    }
}