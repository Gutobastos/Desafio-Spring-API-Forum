package desafio.forum.api.controller;

import desafio.forum.api.domain.usuario.DadosAutenticacao;
import desafio.forum.api.infra.security.DadosTokenJWT;
import desafio.forum.api.infra.security.TokenService;
import jakarta.validation.Valid;
import desafio.forum.api.domain.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        System.out.println(authenticationToken.isAuthenticated());
        var authentication = manager.authenticate(authenticationToken);
        var tokenJWT = tokenService.gerarToken((Usuario)authentication.getPrincipal());

        return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
    }
}
