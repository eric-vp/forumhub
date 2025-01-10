package com.example.forumhub.domain.resposta;

import com.example.forumhub.domain.topico.Topico;
import com.example.forumhub.domain.usuario.Usuario;

import java.time.LocalDateTime;

public class Resposta {
    private Long id;
    private String mensagem;
    private Topico topico;
    private LocalDateTime dataCriacao;
    private Usuario autor;
    private String solucao;
}
