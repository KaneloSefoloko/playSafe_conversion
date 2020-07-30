package com.playsafe.demo.conversion;

public interface ConversionApi {

    ResponseEntity<Float>convertToCelcius(Integer kelvin) throws Exception;
    ResponseEntity<Float>convertToKelvin(Integer celsius) throws Exception;
    ResponseEntity<Integer>convertToMiles(Integer kilo) throws Exception;
    ResponseEntity<Integer>convertToKilo(Integer miles) throws Exception;
}
