public class Main {
    public static void main(String[] args) {
       int cat = 2123484747; // Задача 1
       byte dog = 18;
       short fish = 1234;
       long horse = 123456789987654321L;
       float tiger = 3.67f;
       double lion = 5.1234567;
        System.out.println("Значение переменной " + "cat" +" с типом " + "int " + "равно " + cat);
        System.out.println("Значение переменной " + "dog" + " с типом " + "byte "  + "равно " + dog);
        System.out.println("Значение переменной " + "fish" +" с типом " + "short " + "равно " + fish);
        System.out.println("Значение переменной " + "horse" +" с типом " + "long " + "равно " + horse);
        System.out.println("Значение переменной " + "tiger" +" с типом " + "float " + "равно " + tiger);
        System.out.println("Значение переменной " + "lion" +" с типом " + "double " + "равно " + lion);

        float a = 27.12f; // Задача 2
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        System.out.println("d");
        System.out.println("e");
        System.out.println("f");
        System.out.println("g");

        byte class1 = 23; // Задача 3
        byte class2 = 27;
        byte class3 = 30;
        short sheetOfPaper = 480;
        int totalClass = class1 + class2 + class3;
        int sheetsForEachStudent = sheetOfPaper/totalClass;
        System.out.println("На каждого ученика расчитано " + sheetsForEachStudent + " листов бумаги");

        byte bottleMakerFor2Min = 16;
        int bottleMaker1Min = bottleMakerFor2Min/2;
        short time = 20;
        int bottleMakerFor20Min = time * bottleMakerFor2Min;
        System.out.println("За 20 минут машина произвела " + bottleMakerFor20Min + " бутылок");
        short day = 1440;
        int bottleMakerForDay = day* bottleMaker1Min;
        System.out.println("За день машина произвела " + bottleMakerForDay + " бутылок");
        short days = 4320;
        int bottleMakerFor3Days = days* bottleMaker1Min;
        System.out.println("За 3 дня машина произвела " + bottleMakerFor3Days + " бутылок");
        int month = 43200; // в месяце 30 дней
        int bottleMakerForMonth = month * bottleMaker1Min;
        System.out.println("За месяц машина произвела " + bottleMakerForMonth + " бутылок");

        byte paintTotal = 120; // Задача 5
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte paintClass = 6;
        int whitePaintTotal = paintTotal/whitePaint;
        int brownPaintTotal = paintTotal/brownPaint;
        int numberOfClasses = paintTotal/paintClass;
        System.out.println("В школе где, " + numberOfClasses + " классов, нужно " + whitePaintTotal + " белой краски и " + brownPaintTotal + " банок коричневой краски");


        byte bananas = 5; // Задача 6
        byte weightOfBanana = 80;
        short milk = 200;
        byte weightOfMilk100 = 105;
        byte iceCream = 2;
        byte eachWeightIceCream = 100;
        byte eggs = 4;
        byte eachWeightEgg = 70;
        float totalWeightBananas = bananas*weightOfBanana;
        float totalWeightBananasKg = totalWeightBananas/1000;
        float totalWeightMilk = weightOfMilk100*2;
        float totalWeightMilkKg = totalWeightMilk/1000;
        float totalWeightIceCream = iceCream*eachWeightIceCream;
        float totalWeightIceCreamKg = totalWeightIceCream/1000;
        float totalWeightEggs = eggs*eachWeightEgg;
        float totalWeightEggsKg = totalWeightEggs/1000;
        float totalWeightProducts = totalWeightBananas+totalWeightMilk+totalWeightIceCream+totalWeightEggs;
        float totalWeightProductsKg = totalWeightBananasKg+totalWeightMilkKg+totalWeightIceCreamKg+totalWeightEggsKg;
        System.out.println("Вес спортзавтрака равен " + totalWeightProducts + " грамм или " + totalWeightProductsKg +" килограмм");


        byte cutWeightKg = 7; // Задача 7
        int cutWeightGr = cutWeightKg*1000;
        short cutWeight1G = 250;
        short cutWeight2G = 500;
        int daysToDoWeight1 = cutWeightGr/cutWeight1G;
        int daysToDoWeight2 = cutWeightGr/cutWeight2G;
        System.out.println(daysToDoWeight1 + " дней потребуется, если терять в весе по 250 г. и " + daysToDoWeight2 + " дней при сбросе 500 г. ");

        int masha = 67760; // Задача 8
        int den = 83690;
        int kris = 76230;
        int mashaAnnually = masha*12;
        int denAnnually = den*12;
        int krisAnnually = kris*12;
        float mashaIncrease = masha*1.1f;
        float denIncreaseIncrease = den*1.1f;
        float krisIncreaseIncrease = kris*1.1f;
        float mashaIncreaseAnnually = mashaIncrease*12;
        float denIncreaseAnnually = denIncreaseIncrease*12;
        float krisIncreaseAnnually = krisIncreaseIncrease*12;
        float mashaDifference = mashaIncreaseAnnually-mashaAnnually;
        float denDifference = denIncreaseAnnually-denAnnually;
        float krisDifference = krisIncreaseAnnually-krisAnnually;
        System.out.println ("Маша теперь получает " + mashaIncrease + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println ("Денис теперь получает " + denIncreaseIncrease + " рублей. Годовой доход вырос на " + denDifference + " рублей");
        System.out.println ("Кристина теперь получает " + krisIncreaseIncrease + " рублей. Годовой доход вырос на " + krisDifference + " рублей");




    }
}