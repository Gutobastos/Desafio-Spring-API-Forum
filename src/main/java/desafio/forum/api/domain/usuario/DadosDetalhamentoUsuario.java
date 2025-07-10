package desafio.forum.api.domain.usuario;

import desafio.forum.api.domain.topico.Topico;

public record DadosDetalhamentoUsuario(Long id, String login, String senha) {

    public DadosDetalhamentoUsuario(Usuario usuario) {
            this(usuario.getId(), usuario.getLogin(), usuario.getSenha());
        }
}
