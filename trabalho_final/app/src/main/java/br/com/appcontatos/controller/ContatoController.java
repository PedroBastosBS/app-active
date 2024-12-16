package br.com.appcontatos.controller;

import android.content.Context;
import br.com.appcontatos.database.DB_Handle;
import br.com.appcontatos.model.Contato;

public class ContatoController {
    public static boolean validarCadastroContato(String nome, String email, Context contexto){
        if (nome.isEmpty() || email.isEmpty()){
            return false;
        } else {
            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            DB_Handle.getInstance(contexto).insert(contato);
            return true;
        }
    }
}
