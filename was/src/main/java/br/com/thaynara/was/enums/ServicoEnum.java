package br.com.thaynara.was.enums;

import lombok.Getter;

@Getter
public enum ServicoEnum {

    PREFEITURA("prefeitura"),
    PARTICULAR("particular");

    private final String tipo;

    ServicoEnum(String tipo){

        this.tipo = tipo;
    }
}
