package br.com.thaynara.was.enums;

import lombok.Getter;

@Getter
public enum AlunoEnum {

    PREFEITURA("prefeitura"),
    PARTICULAR("particular");

    private final String tipo;

    AlunoEnum (String tipo){

        this.tipo = tipo;
    }
}
