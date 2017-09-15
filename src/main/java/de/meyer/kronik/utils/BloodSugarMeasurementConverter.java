package de.meyer.kronik.utils;

public class BloodSugarMeasurementConverter {


    private static double mmolFactor = 0.0555;
    private static double mgdlFactor = 18.0182;



    public static double getMmolL(int arg) {

        return arg * mmolFactor;
    }

    public static int getMgdl(double arg) {

        return (int) (arg * mgdlFactor);
    }

}
