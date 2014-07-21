package by.boika.web.logic;

import by.boika.parsing.model.AbstractElectricalAppliance;
import by.boika.parsing.parsers.ParserFactory;

import java.util.ArrayList;

public class ParserLogic {

    public static ArrayList<AbstractElectricalAppliance> getDevicesList (String parser) {
        final String PATH = "src\\main\\resources\\electricalAppliances.xml";
        ArrayList<AbstractElectricalAppliance> devicesList;
        devicesList = ParserFactory.parse(parser, PATH);
        return devicesList;
    }
}
