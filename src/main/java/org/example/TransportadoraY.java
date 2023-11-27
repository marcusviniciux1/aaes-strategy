package org.example;

public class TransportadoraY implements Transportadora {
    @Override
    public float calcularFrete(float pesoProdutos, float distancia) {
        return (float) ((pesoProdutos * 9) + (distancia * 0.75));
    }
}