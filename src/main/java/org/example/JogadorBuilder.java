package org.example;

public class JogadorBuilder {

    private Jogador jogador;

    public JogadorBuilder() {
        jogador = new Jogador();
    }

    public Jogador build() {
        if (jogador.getIdJogador() == 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (jogador.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return jogador;
    }

    public JogadorBuilder setIdJogador(int idJogador) {
        jogador.setIdJogador(idJogador);
        return this;
    }

    public JogadorBuilder setNome(String nome) {
        jogador.setNome(nome);
        return this;
    }
    public JogadorBuilder setPosicao(String posicao) {
        jogador.setPosicao(posicao);
        return this;
    }

    public JogadorBuilder setTimeAtual(String timeAtual) {
        jogador.setTimeAtual(timeAtual);
        return this;
    }

    public JogadorBuilder setTimeAnterior(String timeAnterior) {
        jogador.setTimeAtual(timeAnterior);
        return this;
    }

    public JogadorBuilder setCpf(String cpf) {
        jogador.setCpf(cpf);
        return this;
    }

    public JogadorBuilder setRg(String rg) {
        jogador.setRg(rg);
        return this;
    }

    public JogadorBuilder setAltura(String altura) {
        jogador.setAltura(altura);
        return this;
    }

    public JogadorBuilder setPeso(String peso) {
        jogador.setPeso(peso);
        return this;
    }
    public JogadorBuilder setEnderecoCidade(String enderecoCidade) {
        jogador.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public JogadorBuilder setEnderecoUF(String enderecoUF) {
        jogador.setEnderecoUF(enderecoUF);
        return this;
    }

    public JogadorBuilder setCep(String cep) {
        jogador.setCep(cep);
        return this;
    }

    public JogadorBuilder setEmail(String email) {
        jogador.setEmail(email);
        return this;
    }

    public JogadorBuilder setCelular(String celular) {
        jogador.setCelular(celular);
        return this;
    }

}