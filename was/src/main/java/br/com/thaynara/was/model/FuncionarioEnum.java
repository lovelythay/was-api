package br.com.thaynara.was.model;

public enum FuncionarioEnum {
    MOTORISTA("motorista"),
    MONITOR("monitor");

    private final String cargo;

    FuncionarioEnum(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
