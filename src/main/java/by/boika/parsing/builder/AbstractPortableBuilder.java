package by.boika.parsing.builder;

import by.boika.parsing.model.AbstractElectricalAppliance;
import by.boika.parsing.model.TypesOfBatteries;

public abstract class AbstractPortableBuilder extends AbstractBuilder {

    public abstract AbstractElectricalAppliance buildCountOfBatteries(int countOfBatteries);

    public abstract AbstractElectricalAppliance buildTypeOfBattery(TypesOfBatteries type);
}
