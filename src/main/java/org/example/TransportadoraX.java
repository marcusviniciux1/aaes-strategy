package org.example;

public class TransportadoraX implements Transportadora {
    @Override
    public float calcularFrete(float pesoProdutos, float distancia) {
        return (float) ((pesoProdutos * 10) + (distancia * 0.5));
    }
}