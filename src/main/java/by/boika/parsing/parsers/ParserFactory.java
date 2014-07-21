package by.boika.parsing.parsers;

import by.boika.parsing.exceptions.LogicalException;
import by.boika.parsing.model.AbstractElectricalAppliance;
import by.boika.parsing.parsers.dom.DOMParserReader;
import by.boika.parsing.parsers.sax.SAXParserReader;
import by.boika.parsing.parsers.stax.StAXParser;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ParserFactory {
    private final static Logger LOGGER = Logger.getLogger(ParserFactory.class);
    public static ArrayList<AbstractElectricalAppliance> parse (String parserName, String path) {
        ArrayList<AbstractElectricalAppliance> devicesList = new ArrayList<>();
        final String DOM = "DOM";
        final String STAX  = "STAX";
        final String SAX = "SAX";

        switch (parserName.toUpperCase()) {
            case DOM: {
                try {
                    devicesList = new DOMParserReader().parseElectricalAppliance(path);
                } catch (ParserConfigurationException|SAXException|LogicalException|IOException e) {
                    LOGGER.error(e);
                }
                break;
            }
            case SAX: {
                devicesList = new SAXParserReader().parseElectricalAppliance(path);
            }
            case STAX: {
                try {
                    devicesList = new StAXParser().parse(path);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            }
            default: {
                LOGGER.info(parserName);
                LOGGER.error("Unknown parser");
                break;
            }
        }
        return devicesList;
    }
}
