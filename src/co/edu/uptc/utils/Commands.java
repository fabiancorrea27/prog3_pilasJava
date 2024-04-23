package co.edu.uptc.utils;

public enum Commands {
    ADD("add"),
    DELETE("delete");

    private final String value;

    Commands(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}