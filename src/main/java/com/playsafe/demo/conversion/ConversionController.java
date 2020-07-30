package com.playsafe.demo.conversion;

@RestController
public class ConversionController implements ConversionApi{

    @Override
    @RequestMapping(path = "/conversions/ktoc", method = RequestMethod.GET, produces = { "application/json" })
    public ResponseEntity<Void> convertKelvin() throws Exception {
        return null;
    }

    @Override
    @RequestMapping(path = "/conversions/ctoc", method = RequestMethod.GET, produces = { "application/json" })
    public ResponseEntity<Void> convertCelsius() throws Exception {
        return null;
    }

    @Override
    @RequestMapping(path = "/conversions/ktom", method = RequestMethod.GET, produces = { "application/json" })
    public ResponseEntity<Void> convertKilo() throws Exception {
        return null;
    }

    @Override
    @RequestMapping(path = "/conversions/mtok", method = RequestMethod.GET, produces = { "application/json" })
    public ResponseEntity<Void> convertMiles() throws Exception {
        return null;
    }
}
