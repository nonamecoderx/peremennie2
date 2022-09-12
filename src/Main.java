public class Main {
    public static void main(String[] args) {
    int mashaOld = 67760;
    int denOld = 83690;
    int krisOld = 76230;
    int mashaOldYear = mashaOld * 12;       //зп за год Маши до повышения
    int denOldYear = denOld * 12;           //зп за год Дениса до повышения
    int krisOldYear = krisOld * 12;         //зп за год Кристины до повышения
    double mashaNew = mashaOld * 1.1;       //зп в месяц после повышения
    double denNew = denOld * 1.1;           //зп в месяц после повышения
    double krisNew = krisOld * 1.1;         //зп в месяц после повышения
    double mashaNewYear = mashaNew * 12;    //зп за год после повышения
    double denNewYear = denNew * 12;        //зп за год после повышения
    double krisNewYear = krisNew * 12;      //зп за год после повышения
    double raznMasha = mashaNewYear - mashaOldYear;
    double raznDen = (denNewYear - denOldYear);
    double raznKris = krisNewYear - krisOldYear;
    System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + raznMasha + " рублей.");
    System.out.println("Денис теперь получает " +  denNew + " рублей. Годовой доход вырос на " +  raznDen + " рублей.");
    System.out.println("Кристина теперь получает " + krisNew + " рублей. Годовой доход вырос на " + raznKris + " рублей.");
    }
}