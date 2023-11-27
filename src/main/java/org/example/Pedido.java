package org.example;

public class Pedido {

    private float valor;
    private float pesoProdutos;
    private float distancia;

    public Pedido(float valor, float pesoProdutos, float distancia) {
        this.valor = valor;
        this.pesoProdutos = pesoProdutos;
        this.distancia = distancia;
    }

    public float calcularValorTotal(Transportadora transportadora) {
        return valor + transportadora.calcularFrete(this.pesoProdutos, this.distancia);
    }
}