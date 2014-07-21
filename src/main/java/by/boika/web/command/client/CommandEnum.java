package by.boika.web.command.client;

import by.boika.web.command.ActionCommand;
import by.boika.web.command.ChoiceCommand;
import by.boika.web.command.LoginCommand;
import by.boika.web.command.LogoutCommand;

public enum CommandEnum {
    CHOICE {
        {
            this.command = new ChoiceCommand();
        }
    },

    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    };
    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}