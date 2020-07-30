package com.playsafe.demo.conversion;

public interface ConversionApi {

    float convertToCelcius(int kelvin) throws Exception;
    float convertToKelvin(int celsius) throws Exception;
    double convertToMiles(int kilo) throws Exception;
    double convertToKilo(int miles) throws Exception;
}
