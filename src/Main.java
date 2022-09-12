public class Main {
    public static void main(String[] args) {
    byte vesKg = 7;
    int vesGr = vesKg * 1000;
    short weightOne = 250;
    short weihgtTwo = 500;
    int dayOne = vesGr / weightOne; //похудение при потере 250гр в день
    int dayTwo = vesGr / weihgtTwo; //похудение при потере 500гр в день
    int daySred = (dayTwo + dayOne) / 2; //похудение при потере 375гр в день
    System.out.println("Если в день терять " + weightOne + " гр, то на похудение уйдет " + dayOne + " дней");
    System.out.println("Если в день терять " + weihgtTwo + " гр, то на похудение уйдет " + dayTwo + " дней");
    System.out.println("В среднем на похудение уйдет " + daySred + " дней");
    }
}