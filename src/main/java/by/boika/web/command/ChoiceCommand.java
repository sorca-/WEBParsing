package by.boika.web.command;

import by.boika.parsing.model.AbstractElectricalAppliance;
import by.boika.web.logic.ParserLogic;
import by.boika.web.resource.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class ChoiceCommand implements ActionCommand {
    private static final String PARAM_NAME_PARSER = "parser";

    @Override
    public String execute(HttpServletRequest request) {
        String parser = request.getParameter(PARAM_NAME_PARSER);
        ArrayList<AbstractElectricalAppliance> devicesList = ParserLogic.getDevicesList(parser);
        request.setAttribute("devicesList", devicesList);
        String page = ConfigurationManager.getProperty("path.page.result");
        return page;
    }
}
