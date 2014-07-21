package by.boika.parsing.builder;

import by.boika.parsing.model.AbstractElectricalAppliance;

public abstract class AbstractLocalBuilder extends AbstractBuilder {

    public abstract AbstractElectricalAppliance buildCountOfPhase(int countOfPhase);

}
