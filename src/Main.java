public class Main {
    public static void main(String[] args) {
        //задание 1
        int start = 1;
        while (start <= 10) {
            System.out.println(start);
            start ++;
        }

        int i = 1;
        int i1 = 10;
        for (i1 = 10; i1 >= 1; i1 --)
            System.out.println(i1);

        //задание 2
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница," + friday + "-е число.Необходимо подготовить отчет");
            friday = friday + 7;
        }

        //задание 3
        int currentYear = 2022;
        for (int year = currentYear - 200; year < currentYear + 100; year = year + 1) {
            if (year % 79 == 0)
                System.out.println(year);
        }
    }
}