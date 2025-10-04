package br.com.alura.exercicios.modelos;

import java.util.ArrayList;

public class TesteProduto {
    public void testeProduto(){
        ArrayList<Produto> listaDeProduto= new ArrayList<>();
        Produto roteador = new Produto();
        roteador.setNome("WiFi 5");
        roteador.setPreco(150.00);
        roteador.setQuantidade(20);

        listaDeProduto.add(roteador);

        Produto ONU = new Produto();
        ONU.setNome("Biscatinha");
        ONU.setPreco(65.00);
        ONU.setQuantidade(20);

        System.out.println(listaDeProduto.get(0).getNome());

        listaDeProduto.add(ONU);

        System.out.println(listaDeProduto.get(1).getNome());
    }
}
