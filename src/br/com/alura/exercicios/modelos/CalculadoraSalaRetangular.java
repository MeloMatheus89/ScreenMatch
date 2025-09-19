package br.com.alura.exercicios.modelos;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
 private double altura;
 private double largura;

    @Override
    public double calcularArea(double altura, double largura) {
        return (double) this.altura * this.largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return (double) 2* (this.altura + this.largura);
    }
}


/*
* Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
* */