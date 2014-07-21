package by.boika.parsing.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public abstract class AbstractElectricalAppliance {

    static final Logger LOGGER = Logger.getLogger(AbstractElectricalAppliance.class);
    private static final String LOG_CONFIGURATIONS_PATH = "src\\main\\resources\\log4j.xml";
    private String model;
    private String producer;
    private int power;
    private int voltage;
    private boolean switchedOn;
    private TypesOfAppliances typeOfAppliance;
    private int ID;

    static {
        new DOMConfigurator().doConfigure(LOG_CONFIGURATIONS_PATH, LogManager.getLoggerRepository());
    }

    public AbstractElectricalAppliance() {
    }

    public int getID() {
        return ID;
    }

    public AbstractElectricalAppliance setID(int ID) {
        this.ID = ID;
        return this;
    }

    public String getModel() {
        return model;
    }

    public AbstractElectricalAppliance setModel(String model) {
        this.model = model;
        return this;
    }

    public TypesOfAppliances getTypeOfAppliance() {
        return typeOfAppliance;
    }

    public AbstractElectricalAppliance setTypeOfAppliance(TypesOfAppliances typeOfAppliance) {
        this.typeOfAppliance = typeOfAppliance;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public AbstractElectricalAppliance setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public int getPower() {
        return power;
    }

    public AbstractElectricalAppliance setPower(int power) {
        this.power = power;
        return this;
    }

    public int getVoltage() {
        return voltage;
    }

    public AbstractElectricalAppliance setVoltage(int voltage) {
        this.voltage = voltage;
        return this;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void switchOn() {
        this.switchedOn = true;
    }

    public void switchOff() {
        this.switchedOn = false;
    }

    @Override
    public String toString() {
        return getTypeOfAppliance().toString() + " " + getProducer() + " " + getModel() + " " + getPower();
    }


}
