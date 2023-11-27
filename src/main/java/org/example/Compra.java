package org.example;

public class Compra {

    private float valorTotal;

    public float getValorTotal() {
        return valorTotal;
    }

    public void comprarComTransportadoraA(float valor, float pesoProdutos, float distancia) {
        Pedido pedido = new Pedido(valor, pesoProdutos, distancia);
        this.valorTotal = pedido.calcularValorTotal(new TransportadoraX());
    }

    public void comprarComTransportadoraB(float valor, float pesoProdutos, float distancia) {
        Pedido pedido = new Pedido(valor, pesoProdutos, distancia);
        this.valorTotal = pedido.calcularValorTotal(new TransportadoraY());
    }

    public void comprarComTransportadoraC(float valor, float pesoProdutos, float distancia) {
        Pedido pedido = new Pedido(valor, pesoProdutos, distancia);
        this.valorTotal = pedido.calcularValorTotal(new TransportadoraZ());
    }
}