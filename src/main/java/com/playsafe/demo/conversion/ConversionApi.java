package com.playsafe.demo.conversion;

public interface ConversionApi {

    ResponseEntity<Void>convertKelvin() throws Exception;
    ResponseEntity<Void>convertCelsius() throws Exception;
    ResponseEntity<Void>convertKilo() throws Exception;
    ResponseEntity<Void>convertMiles() throws Exception;
}
