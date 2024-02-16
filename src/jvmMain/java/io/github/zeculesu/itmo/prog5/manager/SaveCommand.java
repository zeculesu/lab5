package io.github.zeculesu.itmo.prog5.manager;

import io.github.zeculesu.itmo.prog5.data.CollectionAction;
import io.github.zeculesu.itmo.prog5.user_interface.ConsoleCommandEnvironment;
import org.jetbrains.annotations.NotNull;

public class SaveCommand implements CommandAction{

    @Override
    public String execute(CollectionAction collectionSpaceMarine, CommandIO console, ConsoleCommandEnvironment env, String[] args) {
        return null;
    }

    @NotNull
    @Override
    public String getName() {
        return "save";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "сохранить коллекцию в файл";
    }
}