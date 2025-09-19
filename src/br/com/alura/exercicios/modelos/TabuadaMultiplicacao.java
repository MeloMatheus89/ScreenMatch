package br.com.alura.exercicios.modelos;

import org.w3c.dom.ls.LSOutput;

public class TabuadaMultiplicacao implements Tabuada{
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void getMostrarTabuada(int numero) {
        for (int i = 1; i < 10; i++) {
            System.out.println("Iniciando a tabuada do: " + numero);
            System.out.println("");
            System.out.println("" + (numero * i));
        }
    }
}
/*
* Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
*/

