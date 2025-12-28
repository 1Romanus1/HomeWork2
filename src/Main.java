public class Main {
    public static void main(String[] args) {
//Задача1
        byte orange = 33;
        short apple = 22325;
        int banana = 132567493;
        long grapes = 1645645645754865L;
        float mango = 2.464F;
        double lemon = 63586.5645745;
        System.out.println(" Значение переменной orange с типом byte равно " + orange);
        System.out.println(" Значение переменной apple с типом short равно " + apple);
        System.out.println(" Значение переменной banana с типом int равно " + banana);
        System.out.println(" Значение переменной grapes с типом long равно " + grapes);
        System.out.println(" Значение переменной mango с типом float равно " + mango);
        System.out.println(" Значение переменной lemon с типом double равно " + lemon);
        //Задача 2
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short f = -159;
        short i = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(i);
        System.out.println(g);
        //Задача 3
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        int all = ludmila + anna + ekaterina;
        System.out.println(all);
        short paper = 480;
        int allPaper = paper / all;
        System.out.println(allPaper);
        //Задача 4
        byte bottle = 16;
        byte min = 2;
        byte twentyMin = 20;
        short day = 1440; //Измеряем дни в минутах
        short threeDay = 4320;
        int month = 43200;  //Условно 30 дней
        int createForTwentyMin = twentyMin / min * bottle;
        System.out.println("За 20 минут машина произвела " + createForTwentyMin + " бутылок");
        int createForDay = day / min * bottle;
        System.out.println("За 1 сутки машина произвела " + createForDay + " бутылок");
        int createThreeDay = threeDay / min * bottle;
        System.out.println("За 3 дня машина произвела " + createThreeDay + " бутылок");
        int createForMonth = month / min * bottle;
        System.out.println("За 1 месяц машина произвела " + createForMonth + " бутылок");
        //Задача 5
        byte allJar = 120;
        byte wJar = 2;
        byte gJar = 4;
        int gwJar = wJar + gJar;
        int classJar = allJar / gwJar;
        int allJarW = classJar * wJar;
        int allJarG = classJar * gJar;
        System.out.println("В школе, где " + classJar + " классов, нужно " + allJarW + " банок белой краски и " + allJarG + " банок коричневой краски");
//Задача 6
        byte allBan = 5;
        short allMilkMl = 200;
        byte allIce = 2;
        byte allEgg = 4;
        byte Ban = 80;
        short Milk = 105;
        byte ice = 100;
        byte egg = 70;
        int allBanG = allBan * Ban;
        int allMilkG = allMilkMl * Milk / 100;
        int allIceG = allIce * ice;
        int allEggG = allEgg * egg;
        int allProductG = allBanG + allMilkG + allIceG + allEggG;
        short kg = 1000;
        float allKg = (float) allProductG / kg;
        System.out.println(allProductG);
        System.out.println(allKg);
        //Задача 7
        short GrOne = 250;
        short GrTwo = 500;
        byte allSportKg = 7;
        short GrForKg = 1000;
        int allSportGr = allSportKg * GrForKg;
        int dayOne = allSportGr / GrOne;
        int dayTwo = allSportGr / GrTwo;
        int allGr = GrOne + GrTwo;
        int middleDay = allSportGr * 2 / allGr;
        System.out.println(dayOne);
        System.out.println(dayTwo);
        System.out.println(middleDay);
//Задача 8
        int mashaPay = 67760;
        int denisPay = 83690;
        int kristinaPay = 76230;
        byte precent = 10;
        int mashaPayPrecent = mashaPay + mashaPay * precent / 100;
        int denisPayPrecent = denisPay + denisPay * precent / 100;
        int kristinaPayPrecent = kristinaPay + kristinaPay * precent / 100;
        int mashaBigPay = mashaPayPrecent - mashaPay;
        int denisBigPay = denisPayPrecent - denisPay;
        int kristinaBigPay = kristinaPayPrecent - kristinaPay;
        byte monthOneYear = 12; //1 год, значит - 12 месяцев
        int mashaYearBigPay = mashaBigPay * monthOneYear;
        int denisYearBigPay = denisBigPay * monthOneYear;
        int kristinaYearBigPay = kristinaBigPay * monthOneYear;
        System.out.println("Маша теперь получает " + mashaPayPrecent + " рублей. Годовой доход вырос на " + mashaYearBigPay + " рублей");
        System.out.println("Денис теперь получает " + denisPayPrecent + " рублей. Годовой доход вырос на " + denisYearBigPay + " рублей");
        System.out.println("Кристина теперь получает " + kristinaPayPrecent + " рублей. Годовой доход вырос на " + kristinaYearBigPay + " рублей");

    }
}