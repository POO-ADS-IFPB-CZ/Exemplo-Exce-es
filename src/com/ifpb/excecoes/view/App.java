package com.ifpb.excecoes.view;

import com.ifpb.excecoes.exceptions.DataInvalidaException;
import com.ifpb.excecoes.model.Pessoa;

import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {

        try{
            Pessoa p = new Pessoa("111.111.111-01", "João",
                    LocalDate.of(1990, Month.JANUARY, 01));
        }catch (DataInvalidaException ex){
            System.out.println(ex.getMessage());
        }

    }

}
