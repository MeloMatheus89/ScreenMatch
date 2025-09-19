package br.com.alura.exercicios.modelos;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorEmDolar;

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }


    @Override
    public double getConverterDolarParaReal() {
        return (double) valorEmDolar * (5.32) ;
    }
}


/*
* Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
* */