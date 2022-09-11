public class Main {
    public static void main(String[] args) {
     byte time = 2;
     byte total = 16;
     byte time1 = 20;
     int proizv1 = total / time * time1;
     System.out.println("За " + time1 + " минут машина произвела бутылок " + proizv1 + " штук");
     int time2 = time1 * 3 * 24;
     int proizv2 = time2 * total;
     System.out.println("За " + time2 + " минут машина произвела бутылок " + proizv2 + " штук");
     int time3 = time2 * 3;
     int proizv3 = time3 * total;
     System.out.println("За " + time3 + " минут машина произвела бутылок " + proizv3 + " штук");
     int time4 = time2 * 31;
     int proizv4 = time4 * total;
     System.out.println("За " + time4 + " минут машина произвела бутылок " + proizv4 + " штук");
    }
}