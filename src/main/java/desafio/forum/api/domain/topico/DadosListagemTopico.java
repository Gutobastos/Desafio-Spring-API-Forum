package desafio.forum.api.domain.topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime data,
        String autor,
        String curso,
        Boolean estado){

    public DadosListagemTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getData(),
                topico.getAutor(),
                topico.getCurso(),
                topico.getEstado()
        );
    }
}
