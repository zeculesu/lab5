package io.github.zeculesu.itmo.prog5.manager;

import io.github.zeculesu.itmo.prog5.data.SpaceMarine;

import java.util.ArrayList;

public class Response {

    String message; // что-то успешно добавлено или наоборот неуспешно, какая-то ошибка была

    ArrayList<String> output;
    ArrayList<SpaceMarine> outputElement;

    public Response(){
        this.output = new ArrayList<>();
        this.outputElement = new ArrayList<>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<String> getOutput() {
        return output;
    }

    public void setOutput(ArrayList<String> output) {
        this.output = output;
    }

    public ArrayList<SpaceMarine> getOutputElement() {
        return outputElement;
    }

    public void setOutputElement(ArrayList<SpaceMarine> outputElement) {
        this.outputElement = outputElement;
    }

    public void addLineOutput(String line) {
        this.output.add(line);
    }

    public void addElement(SpaceMarine elem) {
        this.outputElement.add(elem);
    }
}
