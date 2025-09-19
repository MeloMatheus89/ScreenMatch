package br.com.alura.exercicios.modelos;

public class TesteDeConversaoTemperatura implements ConversorTemperatura{
    private int temperatura;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void celsiusParaFahrenheit(int celsius) {
        int novoFarenheit = (celsius * 9/5) + 32;
        System.out.println("Sua temperatura em Farenheit seria de: " + novoFarenheit);
    }


    @Override
    public void fahrenheitParaCelsius(int fahrenheit) {

        int novoCelsius = (fahrenheit - 32) / (9/5);
        // To DO verificar a conta e imprimir no console

    }
}

