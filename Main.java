import java.lang.ProcessBuilder.Redirect;

class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Count");
    int totalMAndM;
    double totalBlue;
    double totalBrown;
    double totalGreen;
    double totalOrange;
    double totalRed;
    double totalYellow;
    totalMAndM = 55*10;
    totalBlue = totalMAndM *.24;
    totalBrown = totalMAndM * .13;
    totalGreen = totalMAndM * .16;
    totalOrange = totalMAndM * .2;
    totalRed = totalMAndM * .13;
    totalYellow = totalMAndM *.14;
    System.out.println("blue: " + totalBlue);
    System.out.println("brown: " + totalBrown);
    System.out.println("green: " + totalGreen);
    System.out.println("orange: " + totalOrange);
    System.out.println("red: " + totalRed);
    System.out.println("yellow: " + totalYellow);
    double sumMAndM;
    sumMAndM = totalBlue + totalBrown + totalGreen + totalOrange + totalRed + totalYellow;
    System.out.println("Sum: " + sumMAndM);
    if (totalBlue > totalBrown && totalGreen > totalOrange)
    System.out.println("Blue over Brown and Green over Orange");
    if (totalBrown <= totalRed)
    System.out.println ("Brown is less than or equal to Red");
    if (sumMAndM == totalMAndM)
    System.out.println ("Numbers match");
    }
}
