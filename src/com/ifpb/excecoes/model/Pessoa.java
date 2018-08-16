package com.ifpb.excecoes.model;

import com.ifpb.excecoes.exceptions.DataInvalidaException;

import java.time.LocalDate;

public class Pessoa {

    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public Pessoa(String cpf, String nome, LocalDate nascimento) throws DataInvalidaException{
        this.cpf = cpf;
        this.nome = nome;
        if(nascimento.compareTo(LocalDate.now())>0){
            throw new DataInvalidaException("A data é posterior à" +
                    "data atual");
        }
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) throws DataInvalidaException{
        if(nascimento.compareTo(LocalDate.now())>0){
            throw new DataInvalidaException("A data é posterior à" +
                    "data atual");
        }
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "com.ifpb.excecoes.model.Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }

}
