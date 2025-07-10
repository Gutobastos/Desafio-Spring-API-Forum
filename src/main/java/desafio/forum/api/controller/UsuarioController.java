package desafio.forum.api.controller;

import desafio.forum.api.domain.topico.DadosCadastroTopico;
import desafio.forum.api.domain.topico.DadosDetalhamentoTopico;
import desafio.forum.api.domain.topico.Topico;
import desafio.forum.api.domain.topico.TopicoRepositorio;
import desafio.forum.api.domain.usuario.DadosCadastroUsuario;
import desafio.forum.api.domain.usuario.DadosDetalhamentoUsuario;
import desafio.forum.api.domain.usuario.Usuario;
import desafio.forum.api.domain.usuario.UsuarioRepositorio;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio repositorio;

    @PostMapping("/cadastro/usuario")
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroUsuario dados, UriComponentsBuilder uriBuilder) {
        var usuario = new Usuario(dados);
        repositorio.save(usuario);
        var uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoUsuario(usuario));
    }
}
