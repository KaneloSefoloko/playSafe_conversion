package com.playsafe.demo.conversion;

public class Worker implements ConversionApi{

    private final double KILO = 1.609;

    @Override
    public float convertToCelcius(int kelvin) throws Exception {


        return null;
    }

    @Override
    public float convertToKelvin(int celsius) throws Exception {
        return null;
    }

    @Override
    public double convertToMiles(int kilo) throws Exception {
        return null;
    }

    @Override
    public double convertToKilo(int miles) throws Exception {

        return miles * KILO;
    }
}
