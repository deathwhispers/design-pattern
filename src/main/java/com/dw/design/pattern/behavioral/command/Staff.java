package com.dw.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 持有命令对象，负责调用命令并执行相关的操作
 */
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

}
