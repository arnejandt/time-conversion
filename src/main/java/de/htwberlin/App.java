package de.htwberlin;

public class App {

  public static void main(String[] args) {
    String s1 = "07:05:45 PM";
    String s2 = "07:05:45 AM";
    String s3 = "12:05:45 PM";
    String s4 = "12:05:45 AM";
    // TODO: Rufen Sie hier Ihre Methode auf
    TimeConversion timeConversion = new TimeConversion(s1);
    System.out.println(timeConversion.timeConversion12To24(s1));
    System.out.println(timeConversion.timeConversion12To24(s2));
    System.out.println(timeConversion.timeConversion12To24(s3));
    System.out.println(timeConversion.timeConversion12To24(s4));
  }

}
