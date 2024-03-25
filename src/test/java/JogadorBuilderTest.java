
import org.example.Jogador;
import org.example.JogadorBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorBuilderTest {

    @Test
    void deveRetornarExcecaoParaJogadorSemId() {
        try {
            JogadorBuilder JogadorBuilder = new JogadorBuilder();
            Jogador jogador = JogadorBuilder
                    .setNome("Jogador 1")
                    .setEmail("jogador1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("ID inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaJogadorSemNome() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setIdJogador(1)
                    .setEmail("jogador1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarJogadorValido() {
        JogadorBuilder jogadorBuilder = new JogadorBuilder();
        Jogador jogador = jogadorBuilder
                .setIdJogador(1)
                .setNome("Jogador 1")
                .setEmail("jogador1@email.com")
                .build();

        assertNotNull(jogador);
    }
}