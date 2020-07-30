package com.playsafe.demo.conversion;

public class Worker implements ConversionApi{

    private final double KILO = 1.609;
    private final double DEGREES = 273.15;

    @Override
    public float convertToCelcius(int kelvin) throws Exception {


        return (float) (kelvin - DEGREES);
    }

    @Override
    public float convertToKelvin(int celsius) throws Exception {
        return (float) (celsius + DEGREES);
    }

    @Override
    public double convertToMiles(int kilo) throws Exception {
        return kilo / KILO;
    }

    @Override
    public double convertToKilo(int miles) throws Exception {

        return miles * KILO;
    }
}
