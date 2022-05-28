package com.zadania.converter_27_05_22;

public class ConverterTest {
    public static void main(String[] args) {
        Converter converter = new Converter();
        double m =  33.24;
        double m1 =  67.25;
        double m2 =  33.57;
        double m3 =  78.99;
        double metersToCm = converter.metersToCentimeters(m);
        double score1 = converter.metersToMillimeters(m1);
        double score2 = converter.cmToM(m2);
        double score3 = converter.mmToM(m3);
        System.out.println("Metry na centymetry to  " + metersToCm);
        System.out.println("Metry na milimetry to " + score1);
        System.out.println("Centymetry na metry to " + score2);
        System.out.println("Milimetry na metry to " + score3);
    }
}
