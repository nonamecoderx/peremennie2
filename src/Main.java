public class Main {
    public static void main(String[] args) {
     byte total = 120;
     byte klassWhite = 2;
     byte klassBrown = 4;
     int oneClass = klassBrown + klassWhite;
     int totalClasses = total / oneClass;
     int totalClassWhite = totalClasses * klassWhite;
     int totalClassBrown = totalClasses * klassBrown;
     System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalClassWhite + " банок белой краски и " + totalClassBrown + " банок коричневой краски");
    }
}