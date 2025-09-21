package br.com.alura.exercicios.modelos;
import br.com.alura.exercicios.modelos.Pessoa;

import java.util.ArrayList;

public class TestePessoa {
    public static void Testando(String[] args) {


    Pessoa novoBipede = new Pessoa();
    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    novoBipede.setNome("Ostrogesio");
    novoBipede.setIdade(36);

    Pessoa outroBipede = new Pessoa();
    outroBipede.setNome("Judcleia");
    outroBipede.setIdade(34);

    listaDePessoas.add(novoBipede);
    listaDePessoas.add(outroBipede);

        System.out.println(listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);





    }

}


/*
    No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
    Adicione pelo menos três pessoas à lista utilizando o método add.
    Imprima o tamanho da lista utilizando o método size.
    Imprima a primeira pessoa da lista utilizando o método get.
    Imprima a lista completa
* */
