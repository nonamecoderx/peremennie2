public class Main {
    public static void main(String[] args) {
     byte bananWeigh = 80;
     byte milkWeigh = 105;
     byte iceWeigh = 100;
     byte eggWeigh = 70;
     byte bananNumber = 4;
     byte milkNumber = 2;
     byte iceNumber = 2;
     byte eggNumber = 4;
     int totalBanan = bananWeigh * bananNumber;
     int totalMilk = milkWeigh * milkNumber;
     int totalIce = iceWeigh * iceNumber;
     int totalEgg = eggWeigh * eggNumber;
     int breakfastWeigh = totalEgg + totalBanan + totalIce + totalMilk;
     int grPerKg = 1000;
     float weightKg = breakfastWeigh/(float)grPerKg;
     System.out.println("Вес завтрака " + weightKg + " кг");

    }
}