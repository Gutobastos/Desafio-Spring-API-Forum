package desafio.forum.api.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(
        @NotNull
        String login,

        @NotNull
        String senha
) {
}
