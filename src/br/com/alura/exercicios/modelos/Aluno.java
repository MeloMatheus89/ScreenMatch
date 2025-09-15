package br.com.alura.exercicios.modelos;

public class Aluno {
    private String nome;
    private int idade;
    private String cidade;
    private int notaMatematica;
    private int notaQuimica;
    private int notaFisica;
    private double mediaDasNotas;

    private void exibeInformacoes(){
        System.out.println("O nome do aluno é: "+ this.nome);
        System.out.println("A idade do aluno é: "+ this.nome);
        System.out.println("A cidade do aluno é: "+ this.nome);

    }
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNotaMatematica(int notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public void setNotaQuimica(int notaQuimica) {
        this.notaQuimica = notaQuimica;
    }

    public void setNotaFisica(int notaFisica) {
        this.notaFisica = notaFisica;
    }
    //Getters

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void calculaMedia() {
        mediaDasNotas = (double) (this.notaFisica + this.notaMatematica + this.notaQuimica) / 3;
        System.out.println("A média das notas é " +  mediaDasNotas);

    }
}
/*
 * Exercício da alura para praticar classes. Retirar do código principal depois.
 *
 * Resposta do exercicio
 *  Aluno sujeito = new Aluno();
        sujeito.setNome("Genivaldo");
        sujeito.setNotaMatematica(8);
        sujeito.setNotaFisica(8);
        sujeito.setNotaQuimica(9);
        sujeito.calculaMedia();

 * */
