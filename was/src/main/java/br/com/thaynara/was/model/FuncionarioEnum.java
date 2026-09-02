package br.com.thaynara.was.model;


import lombok.Getter;

@Getter

public enum FuncionarioEnum {
    MOTORISTA("motorista"),
    MONITOR("monitor");

    private final String cargo;

    FuncionarioEnum(String cargo) {
        this.cargo = cargo;
    }

}
