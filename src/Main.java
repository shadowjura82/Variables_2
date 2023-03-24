public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        byte byteVariable = 120;
        short shortVariable = 300;
        int intVariable = 3000;
        long longVariable = 30000L;
        float floatVariable = 1.0f;
        double doubleVariable = 23.33334;
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable + "\n");
    }

    public static void task2() {
        float fVar = 27.12f;
        long lVar = 987678965549L;
        float fVar2 = 2.786f;
        short sVar = 569;
        short sVar2 = -159;
        int iVar = 27897;
        byte bVar = 67;
    }

    public static void task3() {
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        byte summ = (byte) (480 / (classEA + classAS + classLP));
        System.out.println("На каждого ученика рассчитано " + summ + " листов бумаги\n");
    }

    public static void task4() {
        byte bottlesPerMin = 16 / 2;
        short bottlesPer20 = (short) (bottlesPerMin * 20);
        short bottlesPerDay = (short) (bottlesPerMin * 60 * 24);
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 31;
        System.out.println("За 20 минут машина произвела " + bottlesPer20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок\n");
    }

    public static void task5() {
        byte total = 120;
        byte classCount = 120 / 6;
        byte white = (byte) (classCount * 2);
        byte brown = (byte) (classCount * 4);
        System.out.println("В школе, где " + classCount + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски\n");
    }

    public static void task6() {
        byte bananas = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte egs = 2;
        short bananasWeight = (short) (bananas * 80);
        short milkWeight = (short) (milk * 105);
        short iceCreamWeight = (short) (iceCream * 105);
        short egsWeight = (short) (egs * 105);
        int totalGramm = (int) (bananasWeight + milkWeight + iceCreamWeight + egsWeight);
        float totalKg = totalGramm / 1000;
        System.out.println("Суммарная масса завтрака " + totalGramm + " грамм,или " + totalKg + " килограмм");
    }

    public static void task7(){

    }
}

