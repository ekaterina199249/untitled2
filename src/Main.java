public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int d1 = 100;
        byte d2 = 100;
        short d3 = 100;
        long d4 = 100000000000000L;
        float d5 = 100.0f;
        double d6 = 100.0;
        System.out.printf("Значение переменной d1 с типом int  равно %s%n", d1);
        System.out.printf("Значение переменной d2 с типом byte равно %s%n", d2);
        System.out.printf("Значение переменной d3 с типом short равно %s%n", d3);
        System.out.printf("Значение переменной d4 с типом long равно %s%n",d4);
        System.out.printf("Значение переменной d5 с типом float равно %s%n", d5);
        System.out.printf("Значение переменной d6 с типом double равно %s%n", d6);

        System.out.println("\nTask 2");
        double f1 = 27.12;
        long f2 = 987_678_965_549L;
        double f3 = 2.786;
        short f4 = 569;
        short f5 = -159;
        short f6 = 27897;
        byte f7 = 67;

        System.out.println("\nTask 3");
        //У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        int ludmilasStudentsAmount = 23;
        int annasStudentsAmount = 27;
        int ekaterinasStudentsAmount = 30;
        int commonPaperAmount = 480;
        int commonStudentsAmount = ludmilasStudentsAmount + annasStudentsAmount + ekaterinasStudentsAmount;
        double paperByOneStudents = commonPaperAmount / commonStudentsAmount;
        System.out.printf("На каждого ученика рассчитано %s листов бумаги%n", (int)paperByOneStudents);

        System.out.println("\nTask 4");
        int machineProductivityPerTwoMinute = 16;
        int machineProductivityPerOneMinute = machineProductivityPerTwoMinute / 2;
        int machineProductivityPerTwentyMinutes = machineProductivityPerOneMinute * 20;
        int minutesInOneDay = machineProductivityPerOneMinute * 60 * 24;
        int machineProductivityPerDay = machineProductivityPerOneMinute * minutesInOneDay;
        int machineProductivityPerFreeDay = machineProductivityPerDay * 3;
        int machineProductivityPerMonth = machineProductivityPerDay * 31;
        System.out.printf("За 20 минут машина произвела %s штук бутылок%n", machineProductivityPerTwentyMinutes);
        System.out.printf("За сутки машина произвела %s штук бутылок%n", machineProductivityPerDay);
        System.out.printf("За 3 дня машина произвела %s штук бутылок%n", machineProductivityPerFreeDay);
        System.out.printf("За месяц машина произвела %s штук бутылок%n", machineProductivityPerMonth);

        System.out.println("\nTask 5");
        int commonCanAmount = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int commonPaintPerClass = whitePaintPerClass + brownPaintPerClass;
        int classAmount = commonCanAmount / commonPaintPerClass;
        int commonWhitePaintAmount = classAmount * whitePaintPerClass;
        int commonBrownPaintAmount = classAmount * brownPaintPerClass;
        System.out.printf("В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски%n", classAmount, commonWhitePaintAmount, commonBrownPaintAmount);

        System.out.println("\nTask 6");
        int bananasAmount = 5;
        int bananasWeight = 80;
        int commonBananasGrAmount = bananasAmount * bananasWeight;
        int milkMlAmounts = 200;
        int milkWeightPer100Gr = 105;
        int commonMilkMlAmountsGrAmount = milkMlAmounts / 100 * milkWeightPer100Gr;
        int iceCreamAmount = 2;
        int iceCreamWeight = 100;
        int commonIceCreamGrAmount = iceCreamAmount * iceCreamWeight;
        int eggsAmount = 4;
        int eggsWeight = 70;
        int commonEggsGrAmount = eggsAmount * eggsWeight;
        int allProductsGrAmount = commonBananasGrAmount + commonMilkMlAmountsGrAmount + commonIceCreamGrAmount + commonEggsGrAmount;
        double allProductsKgAmount = (double) allProductsGrAmount / 1000;
        System.out.println("Вес завтрака в граммах = " + allProductsGrAmount);
        System.out.println("Вес завтрака в килограммах = " + allProductsKgAmount);

        System.out.println("\nTask 7");
        int weight = 7;
        int weightInGrams = weight * 1000;
        int minLossWeightAmount = 250;
        int maxLossWeightAmount = 500;
        double minDaysAmount = (double) weightInGrams / minLossWeightAmount;
        double maxDaysAmount = (double) weightInGrams / maxLossWeightAmount;
        System.out.println("Максимальное количество дней похудения: " + minDaysAmount);
        System.out.println("Минимальное количество дней похудения: " + maxDaysAmount);
        double avgDaysAmount = (maxDaysAmount + minDaysAmount) / 2;
        System.out.println("Среднее количество дней похудения = " + avgDaysAmount);

        System.out.println("\nTask 8");
        double percent = 1.1f;
        int mashaSalaryPerMouth = 67_760;
        int denisSalaryPerMouth = 83_690;
        int kristinaSalaryPerMouth = 76_230;
        double newMashaSalaryPerMouth = mashaSalaryPerMouth * percent;
        double newDenisSalaryPerMouth = denisSalaryPerMouth * percent;
        double newKristinaSalaryPerMouth =  kristinaSalaryPerMouth * percent;
        double mashaSalaryPerYear = mashaSalaryPerMouth * 12;
        double denisSalaryPerYear = denisSalaryPerMouth * 12;
        double kristinaSalaryPerYear = kristinaSalaryPerMouth * 12;
        double newMashaSalaryPerYear = newMashaSalaryPerMouth * 12;
        double newDenisSalaryPerYear = newDenisSalaryPerMouth * 12;
        double newKristinaSalaryPerYear = newKristinaSalaryPerMouth * 12;
        double mashaSalaryDelta = newMashaSalaryPerYear - mashaSalaryPerYear;
        double denisSalaryDelta = newKristinaSalaryPerYear - denisSalaryPerYear;
        double kristinaSalaryDelta = newKristinaSalaryPerYear - kristinaSalaryPerYear;
        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n",
                newMashaSalaryPerMouth,mashaSalaryDelta);
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n",
                newDenisSalaryPerMouth, denisSalaryDelta);
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n",
                newKristinaSalaryPerMouth, kristinaSalaryDelta);
    }
}