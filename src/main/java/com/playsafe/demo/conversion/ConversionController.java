package com.playsafe.demo.conversion;

import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ConversionController implements ConversionApi{
    private final Logger logger = LoggerFactory.getLogger(ConversionController.class);

    @Autowired
    private Worker worker;

    @Override
    @RequestMapping(path = "/conversions/ktoc", method = RequestMethod.GET, produces = { "application/json" })
    public float convertToCelcius(int kelvin) throws Exception {
        logger.trace("Produces results in celsius()");

        return worker.convertToCelcius(kelvin);
    }

    @Override
    @RequestMapping(path = "/conversions/ctoc", method = RequestMethod.GET, produces = { "application/json" })
    public float convertToKelvin(int celsius) throws Exception {
        logger.trace("Produces results in Kelvin()");

        return worker.convertToKelvin(celsius);
    }

    @Override
    @RequestMapping(path = "/conversions/ktom", method = RequestMethod.GET, produces = { "application/json" })
    public double convertToMiles(int kilo) throws Exception {
        logger.trace("Produces results in Miles()");

        return worker.convertToMiles(kilo);
    }

    @Override
    @RequestMapping(path = "/conversions/mtok", method = RequestMethod.GET, produces = { "application/json" })
    public double convertToKilo(int miles) throws Exception {
        logger.trace("Produces results in Kilo()");

        return worker.convertToKilo;
    }
}
