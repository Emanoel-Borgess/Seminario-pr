package com.workshop;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class usuario {

    public String nome;
    public String email;
    public String senha;
    public int idade;

    public boolean validaremail(String e) {
        if (e.contains("@") == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean podeVotar() {
        if (idade >= 16) { return true; }
        return false;
    }

    public String getInfo() { return "Nome: " + nome + " Email: " + email + " Senha: " + senha + " Idade: " + idade + " Pode votar: " + podeVotar() + " Email valido: " + validaremail(email); }
}
