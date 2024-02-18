package io.github.zeculesu.itmo.prog5.manager.command;

import io.github.zeculesu.itmo.prog5.data.CollectionAction;
import io.github.zeculesu.itmo.prog5.error.ElementNotFound;
import io.github.zeculesu.itmo.prog5.manager.CommandAction;
import io.github.zeculesu.itmo.prog5.manager.Response;
import io.github.zeculesu.itmo.prog5.user_interface.ConsoleCommandEnvironment;
import io.github.zeculesu.itmo.prog5.user_interface.ElementFormConsole;
import org.jetbrains.annotations.NotNull;

public class RemoveByIdCommand implements CommandAction {

    boolean acceptsElement = false;

    @Override
    public Response execute(CollectionAction collectionSpaceMarine, ConsoleCommandEnvironment env, String[] args, ElementFormConsole... element) {
        Response response = new Response();
        if (args.length == 0){
            response.setMessage("Не введен аргумент - id элемента для удаления");
            return response;
        }
        try{
            int id = Integer.parseInt(args[0]);
            collectionSpaceMarine.remove_by_id(id);
        }
        catch (ElementNotFound e){
            response.setMessage(e.getMessage());
        }
        catch (NumberFormatException e) {
            response.setMessage("Неверный формат ввода id");
        }
        return response;
    }

    @NotNull
    @Override
    public String getName() {
        return "remove_by_id";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "remove_by_id id : удалить элемент из коллекции по его id";
    }

    @Override
    public boolean isAcceptsElement() {
        return acceptsElement;
    }
}
