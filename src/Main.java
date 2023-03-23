public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}

