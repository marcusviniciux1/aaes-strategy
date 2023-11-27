package org.example;

public class TransportadoraZ implements Transportadora {
    @Override
    public float calcularFrete(float pesoProdutos, float distancia) {
        return (float) ((pesoProdutos * 8) + (distancia * 1.0));
    }
}