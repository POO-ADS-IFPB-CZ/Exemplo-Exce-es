package com.ifpb.excecoes.exceptions;

/**
 * Exceção que representa as situações onde as datas são
 * posteriores à data atual
 */

public class DataInvalidaException extends Exception{

    /**
     * cria uma exceção com a mensagem
     * @param mensagem uma mensagem a ser exibida ao usuário
     */
    public DataInvalidaException(String mensagem){
        super(mensagem);
    }

}
